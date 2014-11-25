package dk.roskilde.it.interfaces;

import java.util.List;

public interface Membership {

	List<User> getUsersInGroup(Group group);
	
	List<Group> getGroupsForUser(User user);
	
	boolean addUserToGroup(User user, Group group);

	boolean remuveUserFromGroup(User user, Group group);
}
