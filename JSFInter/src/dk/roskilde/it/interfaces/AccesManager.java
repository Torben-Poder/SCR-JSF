package dk.roskilde.it.interfaces;

import java.util.List;

public interface AccesManager {

	List<User> getUsersInGroup(Group group);
	
	List<Group> getGroupsForUser(User user);

	boolean login(User user);
	
	boolean logout(User user);

	boolean createUser(User user);
	
	boolean deleteUser(User user);
}
