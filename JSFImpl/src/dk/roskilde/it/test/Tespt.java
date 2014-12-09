package dk.roskilde.it.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dk.roskilde.it.impl.Acces;
import dk.roskilde.it.interfaces.Group;
import dk.roskilde.it.interfaces.User;

public class Tespt {

	@Test
	public void usetCreateTest() {
		Acces acces = new Acces();
		acces.CreateUser(new User("", "", ""));
		assertEquals(1, acces.getAllUsers().size());
	}

	@Test
	public void dublecatedGroopsForUser() {
		Acces acces = new Acces();
		acces.addUserToGroup(new User("", "", ""), new Group("", ""));
		acces.addUserToGroup(new User("", "", ""), new Group("", ""));
		assertEquals(1, acces.getGroupsForUser(new User("", "", "")).size());
	}
	
	@Test
	public void getUserByUsernameTest() {
		Acces acces = new Acces();
		User user = new User("", "", "");
		acces.CreateUser(user);
		assertEquals(user, acces.getUser(""));
	}
	
	@Test
	public void dublicadeGroupTest() {
		Acces acces = new Acces();
		acces.addGroup(new Group());
		acces.addGroup(new Group());
		assertEquals(1, acces.getGroups().size());
	}
	
	@Test
	public void getUsersIngroupTest() {
		Acces acces = new Acces();
		acces.addUserToGroup(new User(), new Group());
		acces.addUserToGroup(new User(), new Group());
		assertEquals(1, acces.getUsersInGroup(new Group()).size());
	}
	
	@Test
	public void updateUserTest() {
		Acces acces = new Acces();
		acces.CreateUser(new User("henrik", "henrik", "henrik"));
		User user = new User("henri", "henri", "henri");
		acces.UpdateUser("henrik", user);
		assertEquals("henri", acces.getUserByName("henri").getUsername());
	}
}
