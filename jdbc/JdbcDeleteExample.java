package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteExample {
	
	public static void main(String... jdbcDelete) {

		String url="jdbc:postgresql://localhost:5432/TestDB";
		String uname="postgres";
		String password="postgres";
		
		try(Connection connection = DriverManager.getConnection(url, uname, password)) {
			System.out.println("Connection established");
		
			String query = "DELETE FROM customer WHERE c_id=?";
			PreparedStatement pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, 2);
			pstatement.execute();
			
			System.out.println("Customer Data Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
