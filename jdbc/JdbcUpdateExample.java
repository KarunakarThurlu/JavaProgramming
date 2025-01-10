package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateExample {
	
	public static void main(String... jdbcUpdate) {

		String url="jdbc:postgresql://localhost:5432/TestDB";
		String uname="postgres";
		String password="postgres";
		
		try(Connection connection = DriverManager.getConnection(url, uname, password)) {
			System.out.println("Connection established");
		
			String query = "UPDATE customer set c_name=? WHERE c_id=?";
			PreparedStatement pstatement = connection.prepareStatement(query);
			pstatement.setString(1, "bar");
			pstatement.setInt(2, 1);
			pstatement.execute();
			
			System.out.println("Customer Data Saved");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
