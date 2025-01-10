package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultSetVsRowSet {
	
	public static void main(String ...resultSetVsRowSet) {
		//ResultSet                           Vs                        RowSet
		
		//1.ResultSet is from java.sql  	                  1. ResultSet is from javax.sql
		//2.FORWARD_ONLY,SCROLL_INSENSITIVE,SCROLL_SENSITIVE. 2. JdbcRowSet, CachedRowSet, WebRowSet, JoinRowSet
		//3.Connected Mode: while processing the data.        3. Disconnected Mode:  retrieves data from the database, stores it in memory
		//4.Won't Participated in serialization               4. Participated in serialization
		
		
		
		String url="jdbc:postgresql://localhost:5432/TestDB";
		String uname="postgres";
		String password="postgres";
		
		try(Connection connection = DriverManager.getConnection(url, uname, password)) {
			System.out.println("Connection establiched");
		
			String query = "UPDATE customer set c_name=? WHERE c_id=?";
			PreparedStatement pstatement = connection.prepareStatement(query);
			pstatement.setString(1, "KIRAN");
			pstatement.setInt(2, 5);
			pstatement.execute();
			System.out.println("Customer Data Saved");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
