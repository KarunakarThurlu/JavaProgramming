package oops.abstracton;

public interface UserService {
	 String saveUser(User user);
	 String updateUser(User user);
	 User getUser(int userId);
	 String deleteUser(int userId);
}
