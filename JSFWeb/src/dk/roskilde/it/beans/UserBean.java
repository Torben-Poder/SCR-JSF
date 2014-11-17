package dk.roskilde.it.beans;

//@SessionScoped
public class UserBean {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserBean(String username) {
		super();
		this.username = username;
	}
	
	public UserBean() {}
}
