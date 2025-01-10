package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLInjection {
	
	public static void main(String... SQLInjection)  {
		String url="jdbc:postgresql://localhost:5432/TestDB";
		String uname="postgres";
		String password="postgres";
		
		
		//Why Statement is not recommended?
		//What is SQL Injection ?
		try(Connection connection = DriverManager.getConnection(url, uname, password)) {
			System.out.println("Connection established");
//			Statement statement = connection.createStatement();
//			String pName="Monitor";
//			String pColor="Black '); DROP TABLE product; --";
//           	String query = "INSERT INTO product(p_name,p_color) values('"+ pName +"','"+pColor+"')";
//           	
//           	//INSERT INTO product(p_name,p_color) values('Monitor','Black'); 
//           	//DROP TABLE product; 
//			statement.execute(query);
			
		 	String query = "INSERT INTO product(p_name,p_color) values(?,?)";
			PreparedStatement pstatement = connection.prepareStatement(query);
			String pName="Mobile";
			String pColor= "White '); DROP TABLE product; --";
			pstatement.setString(1, pName);
			pstatement.setString(2, pColor);
           	
           	//INSERT INTO product(p_name,p_color) values('Monitor','Black'); 
           	//DROP TABLE product; 
			pstatement.execute();
			System.out.println("Data Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
