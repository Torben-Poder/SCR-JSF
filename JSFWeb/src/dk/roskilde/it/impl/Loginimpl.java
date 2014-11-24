package dk.roskilde.it.impl;

import dk.roskilde.it.interfaces.Login;
import dk.roskilde.it.interfaces.User;

public class Loginimpl implements Login{

	@Override
	public boolean login(User user) {
		if (user.getUsername() == "h" && user.getPassword() == "h") {
			user.setLoggedin(true);
			return true;
		}
		return false;
	}

	@Override
	public boolean logout(User user) {
		if (user.isLoggedin()) {
			user.setLoggedin(false);
			return true;
		}
		return false;
	}

}
