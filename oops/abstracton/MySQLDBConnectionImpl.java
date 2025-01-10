package oops.abstracton;

public class MySQLDBConnectionImpl extends DBConnection {

	@Override
	String getDbConnection() {
		return "MYSQL";
	}

}
