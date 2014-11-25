package dk.roskilde.it.interfaces;

import java.util.List;

public interface GroupManager {

	List<Group> getGroups();
	
	boolean addGroup(Group group);
	
	boolean deleateGroup(String nme);
	
	Group getGroup(String name);
}
