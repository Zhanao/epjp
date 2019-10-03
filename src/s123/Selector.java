package s123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Selector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "me";
	private static final String PASSWORD = "password";

	public List<String> getCoderNames() throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //
				Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT first_name FROM coders ORDER BY 1"); //manca il ; finale, questo lo mette jdbc
							//il risultato della query viene messo dentro un resultset che è come un cursor
							//jdbc se qualcosa va storto ritorna una eccezione, ma dobbiamo mettere una checked exception che è un po' pesante
			List<String> results = new ArrayList<>();
			while (rs.next()) {
				results.add(rs.getString(1));
			}

			return results;
		}
	}

	public List<Coder> getCoders() throws SQLException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); //questa è una tries with resources e la cosa bella è che chiude le risorse da solo così si allegerisce tutto
				Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery("SELECT first_name, last_name, salary FROM coders ORDER BY 1");

			List<Coder> results = new ArrayList<>();
			while (rs.next()) {
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getDouble(3)));
				//rs.get[tipo] per prendere un tipo specifico di dato, il Blob è meglio BLOb sta per Binary Large Object e viene usato le immagini o i video
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
				results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
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