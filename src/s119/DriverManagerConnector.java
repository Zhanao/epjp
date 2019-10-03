package s119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnector {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe"; //collegalo al local host ( potevo mettere anche IP) ovvero sto lavorando solo sulla mia macchina.
    private static final String USER = "me";									 //1521 è la porta (ip è come se fosse una via e la porta è il numero), la porta standard di oracle è 1521
    private static final String PASSWORD = "password";							 // non vasta indentificare un servizio solo attraverso la macchina(ip) ma serve anche la porta
    																			 //xe è service id,identifica univocamente il database su cui voglio lavorare
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);//connection è un iterfaccia fornita dalla libreria JDBC8:chiamo il metodo statico getConnection su DriverManager
            System.out.println("Connected as " + conn.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
