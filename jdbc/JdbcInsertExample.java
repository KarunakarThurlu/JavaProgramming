package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertExample {
	
	public static void main(String... jdbcInsert) {
		
		String url="jdbc:postgresql://localhost:5432/TestDB";
		String uname="postgres";
		String password="postgres";
		
		try(Connection connection = DriverManager.getConnection(url, uname, password)) {
			System.out.println("Connection established");
			String name="foo";
			String email="foo@gmail.com";
			String cpassword="F0o$!";
			String query = "INSERT INTO customer(c_name,c_email,c_password) values(?,?,?)";
			PreparedStatement pstatement = connection.prepareStatement(query);
			pstatement.setString(1, name);
			pstatement.setString(2, email);
			pstatement.setString(3, cpassword);
			pstatement.executeUpdate();
			System.out.println("Customer Data Saved");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
