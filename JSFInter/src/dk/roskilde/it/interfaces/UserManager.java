package dk.roskilde.it.interfaces;

import java.util.List;

public interface UserManager {
	
	User getUser(String username);
	User getUserByName(String name);
	List<User> getAllUsers();
	boolean CreateUser(User user);
	boolean UpdateUser(String username, User changedUser);
	boolean DeleteUser(String username);
}
