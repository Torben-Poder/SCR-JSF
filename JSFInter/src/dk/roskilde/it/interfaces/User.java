package dk.roskilde.it.interfaces;

public interface User {

	String getName();
	
	String getUsername();
	
	String getPassword();

	void setLoggedin(boolean loggedin);
	
	boolean isLoggedin();
}
