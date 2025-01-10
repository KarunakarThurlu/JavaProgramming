package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetTypes {
	
	public static void main(String...  resultSetTypes) {
		/*
		    -----------------------------------------------
			How many types of ResultSet's available in JDBC?
		    -----------------------------------------------
			1. FORWARD_ONLY (Default)
			2. SCROLL_INSENSITIVE
			3. SCROLL_SENSITIVE
			
		    -----------------------------------------------
			Concurrency Modes
		    -----------------------------------------------
			1.READ_ONLY
			2.UPDATABLE

		 */
		 

		String url = "jdbc:postgresql://localhost:5432/TestDB";
		String uname = "postgres";
		String password = "postgres";
		try (Connection connection = DriverManager.getConnection(url, uname, password)) {
			String query = "select c_name,c_email from customer";
			
			//
			PreparedStatement statement = connection.prepareStatement(query);
			                               //OR
			PreparedStatement pstatement1 = connection.prepareStatement(query, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			
			
			PreparedStatement pstatement2 = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			PreparedStatement pstatement3 = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			PreparedStatement pstatement4 = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			PreparedStatement pstatement5 = connection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = pstatement1.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("c_name") + " | " + resultSet.getString("c_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}






























