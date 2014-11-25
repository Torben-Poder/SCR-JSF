package dk.roskilde.it.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import dk.roskilde.it.interfaces.User;
import dk.roskilde.it.interfaces.UserManager;

class MukUserManeger implements UserManager {

	List<User> userlist = new ArrayList<>();
	@Override
	public User getUser(String username) {
		for (User user : userlist) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getUserByName(String name) {
		for (User user : userlist) {
			if (user.getName().equals(name)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return userlist;
	}

	@Override
	public boolean CreateUser(User user) {
		return userlist.add(user);
	}

	@Override
	public boolean UpdateUser(String username, User changedUser) {
		ListIterator<User> users = userlist.listIterator();
		while (users.hasNext()) {
			User user = (User) users.next();
			if (user.getUsername().equals(username)) {
				users.set(changedUser);
			}
		}
		return false;
	}

	@Override
	public boolean DeleteUser(String username) {
		for (User user : userlist) {
			if (user.getUsername().equals(username)) {
				return userlist.remove(user);
			}
		}
		return false;
	}

}
