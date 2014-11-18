package dk.roskilde.it.beans;

//@SessionScoped
public class UserBean {
	public boolean isIsloggedin() {
		return isloggedin;
	}

	public void setIsloggedin(boolean isloggedin) {
		this.isloggedin = isloggedin;
	}

	private String username;
	private boolean isloggedin;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserBean(String username) {
		this.username = username;
	}
	
	public UserBean() {}
}
