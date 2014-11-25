package dk.roskilde.it.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dk.roskilde.it.impl.Acces;
import dk.roskilde.it.interfaces.User;

public class Tespt {

	@Test
	public void test() {
		Acces acces = new Acces();
		acces.CreateUser(new User("", "", ""));
		assertEquals(1, acces.getAllUsers().size());
	}

}
