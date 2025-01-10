package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectExample {

	public static void main(String... jdbcSelect) {

		String url = "jdbc:postgresql://localhost:5432/TestDB";
		String uname = "postgres";
		String password = "postgres";
		
		try (Connection connection = DriverManager.getConnection(url, uname, password)) {
			String preparedStatementQuery = "select c_name,c_email from customer where c_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(preparedStatementQuery);
			preparedStatement.setInt(1, 13);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("c_name") + " | " + resultSet.getString("c_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
