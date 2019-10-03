package s123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//curiosità: BLOb: binary large object, posso salvare qualsiasi cosa in database, non solo numeri o stringhe ma anche eseguibili immagini e video.
// dovendo salvare es. film e foto li salviamo in binario come BLOb

//PreparedStatement fa select più robuste e ci difende da SQL injection (targa con su scritto drop database, per proteggersi se targa italiana 2 lettere+ 2 numeri + 2 lettere?
// PreparedStatement prep= conn.prepareStatement(
// "SELECT first _name FROM coders where coder_id = ? order by 1")){
// prep.setInt(1, id);
//ResultSet rs = prep.executeQuery();
public class Selector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "me";
	private static final String PASSWORD = "password";

	public List<String> getCoderNames() throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //
				Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT first_name FROM coders ORDER BY 1");// non è ancora una collection al 100%

			List<String> results = new ArrayList<>();
			while (rs.next()) {
				results.add(rs.getString(1));//nota che parte da 1 come in standard sql e non 0
			}

			return results;
		}
	}

	public List<Coder> getCoders() throws SQLException {
		
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //try with the resources--> come con lo scanner lo posso usare con tutte le risorse autoclosable
				Statement stmt = conn.createStatement()) { // ci penserà java a chiudermi le risorse quando non serviranno più
			
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, salary FROM coders ORDER BY 1");

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}

			return results;
		}
	}

	public List<Coder> getCodersBySalary(double lower) throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //
				Statement stmt = conn.createStatement()) {
			String query = "SELECT first_name, last_name, salary FROM coders WHERE salary >= " + lower
					+ " ORDER BY 3 DESC";

			ResultSet rs = stmt.executeQuery(query);

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));//notare che salary è su DB poteva avere virgole, facendo getInt me lo tronca prendendo solo il valore intero
			}

			return results;
		}
	}

	public static void main(String[] args) {
		try {
			Selector sample = new Selector();

			System.out.println("Coder names are: " + sample.getCoderNames());
			System.out.println("Coders are: " + sample.getCoders());
			System.out.println("Rich coders are: " + sample.getCodersBySalary(6000));

		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}
}