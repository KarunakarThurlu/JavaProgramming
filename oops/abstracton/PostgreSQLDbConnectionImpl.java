package oops.abstracton;

public class PostgreSQLDbConnectionImpl extends DBConnection {

	@Override
	String getDbConnection() {
		return "PostgreSQL";
	}

}
