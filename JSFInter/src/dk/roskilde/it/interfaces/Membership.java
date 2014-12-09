package dk.roskilde.it.interfaces;

import java.util.List;
import java.util.Set;

public interface Membership {

	List<User> getUsersInGroup(Group group);
	
	Set<Group> getGroupsForUser(User user);
	
	boolean addUserToGroup(User user, Group group);

	boolean remuveUserFromGroup(User user, Group group);
}
