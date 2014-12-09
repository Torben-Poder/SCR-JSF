package dk.roskilde.it.interfaces;

import java.util.List;

public interface ItemManager {
	List<Item> getItems();
	boolean addItem(Item item);
	boolean remuveItem(String name);
	
}
