package oops.abstracton;

public abstract class DBConnection {
	
	abstract String getDbConnection();
	
	String getMongoDBConnection() {
		return "MongoDBConnection";
	}
}
