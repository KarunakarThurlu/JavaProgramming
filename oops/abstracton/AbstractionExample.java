package oops.abstracton;

public class AbstractionExample {
	
	/*
	 * When to use abstract class & interface
	 * 
	 * Abstract Class:-
	 * ---------------
	 * 1. If There is IS-A relation between super class and sub class
	 * 2. All Type of variables and methods
	 * 3. We Can create constructor
	 * 
	 * 
	 * Interface:-
	 * ------------
	 * 1. If There is No IS-A relation between super class and sub class
	 * 2. Only public abstract methods & public static final variables
	 * 3. We Can't create constructor
	 * 
	 * 
	 */

	public static void main(String[] args) {
//		User userOne = new User(1,"Varun","varun@gmail.com","Varun1234","987234235435");
//		User userTwo = new User(2,"Tarun","tarun@gmail.com","tarun1234","909824235435");
//		
//		
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		
//		//Save User
//		String saveUserMsg1 = userServiceImpl.saveUser(userOne);
//		System.out.println(saveUserMsg1);
//		String saveUserMsg2 = userServiceImpl.saveUser(userTwo);
//		System.out.println(saveUserMsg2);
//		
//		//Get User
//		User user = userServiceImpl.getUser(2);
//		System.out.println(user);
//		
//		//Update User
//		userTwo.setUserPhno("909824236675");
//		String updateUser = userServiceImpl.updateUser(userTwo);
//		System.out.println(updateUser);
//		System.out.println(userTwo);
//		
//		//Delete User
//		String deleteUser = userServiceImpl.deleteUser(2);
//		System.out.println(deleteUser);
		
		
		MySQLDBConnectionImpl m = new MySQLDBConnectionImpl();
		String mySQLdbConnection = m.getDbConnection();
		String mongoDBConnection = m.getMongoDBConnection();
		System.out.println(mySQLdbConnection);
		System.out.println(mongoDBConnection);
		
		PostgreSQLDbConnectionImpl p = new PostgreSQLDbConnectionImpl();
		String postgreSQLdbConnection = p.getDbConnection();
		System.out.println(postgreSQLdbConnection);
			
	}
}
