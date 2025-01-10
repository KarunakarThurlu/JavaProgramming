package oops.abstracton;

public class User {
	
	private int userId;
	private String userName;
	private String userPWd;
	private String userEmail;
	private String userPhno;
	
	
	public User() {
		super();
	}

	public User(int userId, String userName, String userPWd, String userEmail, String userPhno) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPWd = userPWd;
		this.userEmail = userEmail;
		this.userPhno = userPhno;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPWd() {
		return userPWd;
	}

	public void setUserPWd(String userPWd) {
		this.userPWd = userPWd;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(String userPhno) {
		this.userPhno = userPhno;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPWd=" + userPWd + ", userEmail=" + userEmail
				+ ", userPhno=" + userPhno + "]";
	}
	
	
	
	
}
