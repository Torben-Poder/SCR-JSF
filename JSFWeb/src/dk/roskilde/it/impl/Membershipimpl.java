package dk.roskilde.it.impl;

import java.util.List;

import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.Membership;
import dk.roskilde.it.interfaces.User;

public class Membershipimpl implements Membership {

	@Override
	public List<User> getUsersInGroup(Group group) {
		return null;
	}

	@Override
	public List<Group> getGroupsForUser(User user) {
		return null;
	}

}
