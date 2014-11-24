package dk.roskilde.it.impl;

import dk.roskilde.it.interfaces.User;

public class Userimpl implements User {
	
	private String name;
	private String username;
	private String password;
	private boolean isloggedin;

	public Userimpl(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = username;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setLoggedin(boolean loggedin) {
		this.isloggedin = loggedin;
	}

	@Override
	public boolean isLoggedin() {
		return isloggedin;
	}

}
