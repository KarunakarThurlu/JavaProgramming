package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcBatchExecute {

	public static void main(String... batchUpdate) {

		String url = "jdbc:postgresql://localhost:5432/TestDB";
		String uname = "postgres";
		String password = "postgres";

		try (Connection connection = DriverManager.getConnection(url, uname, password)) {
			System.out.println("Connection established");

			// 1. Set auto-commit to false
			connection.setAutoCommit(false);

			String query = "INSERT INTO customer(c_name,c_email,c_password) values(?,?,?)";
			PreparedStatement pstatement = connection.prepareStatement(query);

			// 2. Add multiple records to batch
			pstatement.setString(1, "foo");
			pstatement.setString(2, "foo@gmail.com");
			pstatement.setString(3, "f$%J45@");
			pstatement.addBatch();

			pstatement.setString(1, "bar");
			pstatement.setString(2, "bar@gmail.com");
			pstatement.setString(3, "Bi%J45@#");
			pstatement.addBatch();

			// 3. Execute batch
			pstatement.executeBatch();

			// 4. Commit the transaction
			connection.commit();

			System.out.println("Customer's Data Saved");
		} catch (SQLException e) {
			System.out.println("Error While Saving Customer's Data");
			e.printStackTrace();
		}
	}
}
