package dk.roskilde.it.interfaces;

public class Group {
	protected String name;
	protected String description;
	
	public Group(){}
	public Group(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
