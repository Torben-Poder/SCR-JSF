package dk.roskilde.it.interfaces;

public class Item {
	private String name;
	private int price;
	private boolean haveit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isHaveit() {
		return haveit;
	}
	public Item(String name, int price, boolean haveit) {
		this.name = name;
		this.price = price;
		this.haveit = haveit;
	}
	public void setHaveit(boolean haveit) {
		this.haveit = haveit;
	}
	
	public Item() {}
}
