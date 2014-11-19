package dk.roskilde.it.beans;

import java.util.Collection;

public class ItemBean {
	private Collection<Item> items;

	public ItemBean(Collection<Item> items) {
		super();
		this.items = items;
	}

	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}
	
	public void add(Item item) {
		items.add(item);
	}
}
