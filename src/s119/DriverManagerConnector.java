package s119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnector {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe"; //al posto di localhost possiamo usare l'ip del localhost cioè 192.168.20.60, xe è il database di oracle
//    private static final String URL = "jdbc:mysql://localhost:3386/me?serverTimezone=Europe/Rome"; //usando jdbc
    private static final String USER = "me";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            String user = conn.getSchema(); //ritorna lo schema al quale sono collegato
            if (user == null) {
            	user = conn.getCatalog();
            }
            System.out.println("Connected as " + user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
