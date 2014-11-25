package dk.roskilde.it.interfaces;

public interface LoginManager {

	boolean login(User user);
	
	boolean logout(User user);
}
