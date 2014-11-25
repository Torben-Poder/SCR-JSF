package dk.roskilde.it.impl;

import java.util.List;

import dk.roskilde.it.interfaces.AccesManager;
import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.User;
import dk.roskilde.it.interfaces.UserManager;

public class Acces implements AccesManager {

	static UserManager usermaneger;

	@Override
	public List<Group> getGroups() {
		return null;
	}

	@Override
	public boolean addGroup(Group group) {
		return false;
	}

	@Override
	public boolean deleateGroup(String nme) {
		return false;
	}

	@Override
	public Group getGroup(String name) {
		return null;
	}

	@Override
	public boolean login(User user) {
		return false;
	}

	@Override
	public boolean logout(User user) {
		return false;
	}

	@Override
	public List<User> getUsersInGroup(Group group) {
		return null;
	}

	@Override
	public List<Group> getGroupsForUser(User user) {
		return null;
	}

	@Override
	public boolean addUserToGroup(User user, Group group) {
		return false;
	}

	@Override
	public boolean remuveUserFromGroup(User user, Group group) {
		return false;
	}

	@Override
	public User getUser(String username) {
		return null;
	}

	@Override
	public User getUserByName(String name) {
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

	@Override
	public boolean CreateUser(User user) {
		return false;
	}

	@Override
	public boolean UpdateUser(String username, User changedUser) {
		return false;
	}

	@Override
	public boolean DeleteUser(String username) {
		return false;
	}

}
