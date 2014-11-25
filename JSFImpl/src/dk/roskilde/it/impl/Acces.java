package dk.roskilde.it.impl;

import java.util.List;

import dk.roskilde.it.interfaces.AccesManager;
import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.GroupManager;
import dk.roskilde.it.interfaces.LoginManager;
import dk.roskilde.it.interfaces.Membership;
import dk.roskilde.it.interfaces.User;
import dk.roskilde.it.interfaces.UserManager;

public class Acces implements AccesManager {

	UserManager usermaneger =  new MukUserManeger();
	GroupManager groupmanager = new MukGroupManager();
	Membership membership = new MukMembership();
	LoginManager loginlanager = new MukLoginManager();

	@Override
	public List<Group> getGroups() {
		return groupmanager.getGroups();
	}

	@Override
	public boolean addGroup(Group group) {
		return groupmanager.addGroup(group);
	}

	@Override
	public boolean deleateGroup(String nme) {
		return groupmanager.deleateGroup(nme);
	}

	@Override
	public Group getGroup(String name) {
		return groupmanager.getGroup(name);
	}

	@Override
	public boolean login(User user) {
		return loginlanager.login(user);
	}

	@Override
	public boolean logout(User user) {
		return loginlanager.logout(user);
	}

	@Override
	public List<User> getUsersInGroup(Group group) {
		return membership.getUsersInGroup(group);
	}

	@Override
	public List<Group> getGroupsForUser(User user) {
		return membership.getGroupsForUser(user);
	}

	@Override
	public boolean addUserToGroup(User user, Group group) {
		return membership.addUserToGroup(user, group);
	}

	@Override
	public boolean remuveUserFromGroup(User user, Group group) {
		return membership.remuveUserFromGroup(user, group);
	}

	@Override
	public User getUser(String username) {
		return usermaneger.getUser(username);
	}

	@Override
	public User getUserByName(String name) {
		return usermaneger.getUserByName(name);
	}

	@Override
	public List<User> getAllUsers() {
		return usermaneger.getAllUsers();
	}

	@Override
	public boolean CreateUser(User user) {
		return usermaneger.CreateUser(user);
	}

	@Override
	public boolean UpdateUser(String username, User changedUser) {
		return usermaneger.UpdateUser(username, changedUser);
	}

	@Override
	public boolean DeleteUser(String username) {
		return usermaneger.DeleteUser(username);
	}

}
