package dk.roskilde.it.impl;

import java.util.ArrayList;
import java.util.List;

import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.GroupManager;

class MukGroupManager implements GroupManager {

	List<Group> grouplist = new ArrayList<>();
	@Override
	public List<Group> getGroups() {
		return grouplist;
	}

	@Override
	public boolean addGroup(Group group) {
		return grouplist.add(group);
	}

	@Override
	public boolean deleateGroup(String name) {
		for (Group group : grouplist) {
			if (group.getName().equals(name)) {
				return grouplist.remove(group);
			}
		}
		return false;
	}

	@Override
	public Group getGroup(String name) {
		for (Group group : grouplist) {
			if (group.getName().equals(name)) {
				return group;
			}
		}
		return null;
	}

}
