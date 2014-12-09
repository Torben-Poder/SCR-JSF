package dk.roskilde.it.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.Membership;
import dk.roskilde.it.interfaces.User;

public class MukMembership implements Membership {

	Map<User, Set<Group>> usermap = new HashMap<>();
	@Override
	public List<User> getUsersInGroup(Group group) {
		List<User> resolt = new ArrayList<>();
		for (User user : usermap.keySet()) {
			if (usermap.get(user).contains(group)) {
				resolt.add(user);
			}
		}
		return resolt;
	}

	@Override
	public Set<Group> getGroupsForUser(User user) {
		return usermap.get(user);
	}

	@Override
	public boolean addUserToGroup(User user, Group group) {
		Set<Group> groups = usermap.get(user);
		if (groups != null) {
			groups.add(group);
			usermap.put(user, groups);
			return true;
		}
		groups = new HashSet<>(Arrays.asList(group));
		usermap.put(user, groups);
		return true;
	}

	@Override
	public boolean remuveUserFromGroup(User user, Group group) {
		Set<Group> groups = usermap.get(user);
		if (groups != null) {
			groups.remove(group);
			usermap.put(user, groups);
			return true;
		}
		usermap.put(user, groups);
		return true;
	}

}
