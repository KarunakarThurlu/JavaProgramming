package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class JdbcConnectionPooling {

	public static void main(String... connectionPooling) {

		String url = "jdbc:postgresql://localhost:5432/TestDB";
		String username = "postgres";
		String password = "postgres";
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		config.setMaximumPoolSize(5); // Set maximum pool size

		HikariDataSource dataSource = new HikariDataSource(config);

		try (Connection connection = dataSource.getConnection()) {
			String preparedStatementQuery = "select c_name,c_email from customer";
			PreparedStatement preparedStatement = connection.prepareStatement(preparedStatementQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("c_name") + " | " + resultSet.getString("c_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (dataSource != null) {
			dataSource.close();
		}
	}
}
