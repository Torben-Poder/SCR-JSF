package dk.roskilde.it.impl;

import java.util.ArrayList;
import java.util.List;

import dk.roskilde.it.interfaces.Item;
import dk.roskilde.it.interfaces.ItemManager;

public class MokItemManager implements ItemManager {

	List<Item> itemlist = new ArrayList<>();
	@Override
	public List<Item> getItems() {
		return itemlist;
	}

	@Override
	public boolean addItem(Item item) {
		return itemlist.add(item);
	}

	@Override
	public boolean remuveItem(String name) {
		for (Item item : itemlist) {
			if (item.getName().equals(name)) {
				return itemlist.remove(item);
			}
		}
		return false;
	}

}
