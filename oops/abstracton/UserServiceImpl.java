package oops.abstracton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

	List<User> users = new ArrayList<>();
	
	@Override
	public String saveUser(User user) {
		if(user!=null) {
			//perform all validations
			users.add(user);
			return "User Saved Successfully";
		}else {
			throw new RuntimeException("User Obj is null");
		}
		
	}

	@Override
	public String updateUser(User user) {
		Optional<User> optionalUser = users.stream().filter(u->u.getUserId()==user.getUserId()).findFirst();
		if(optionalUser.isPresent()) {
			User savedUser= optionalUser.get();
			savedUser.setUserPhno(user.getUserPhno());
			return "Updated successfully";
		}
		throw new RuntimeException("User not exist");
	}

	@Override
	public User getUser(int userId) {
		Optional<User> optionalUser = users.stream().filter(u->u.getUserId()==userId).findFirst();
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}
		throw new RuntimeException("At the Time of Get , User not exist with " + userId);
	}

	@Override
	public String deleteUser(int userId) {
		Optional<User> optionalUser = users.stream().filter(u->u.getUserId()==userId).findFirst();
		if(optionalUser.isPresent()) {
			User savedUser = optionalUser.get();
			users.remove(savedUser);
			return "Deleted Successfully";
		}
		throw new RuntimeException("At the Time of Delete ,User not exist with " + userId);
	}

}
