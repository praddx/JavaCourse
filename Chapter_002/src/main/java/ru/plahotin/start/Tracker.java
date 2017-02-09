package ru.plahotin.start;

import ru.plahotin.models.Item;
import java.util.Random;
import java.util.Arrays;

/**...
 * Class that contains list of items and methods to operate that list
 * @author Alexander Plakhotin
 * @since 20.12.16
 */
public class Tracker {
	private Item[] items;
	private int index = 0;
	private static final Random RN = new Random();

	/**...
	 * Constructor that sets the size of item list
	 * @param size - size of the item array
	 */
	Tracker(int size) {
		this.items = new Item[size];
	}

	/**...
	 * Method generates ID for the new item in the list
	 * @return - returns ID
	 */
	private String generateId() {
		return String.valueOf(RN.nextInt(100) + System.currentTimeMillis());
	}

	/**...
	 * Method that adds items to the list
	 * @param item - an item that will be added to list
	 * @return item - added item
	 */
	public Item addItem(Item item) {
		item.setId(this.generateId());
		this.items[this.index++] = item;
		return item;
	}

	/**...
	 * Method that deletes an item from the list
	 * Firstly method determines the index in list of the item that has to be deleted
	 * The it replaces found item with the following items of the list
	 * @param item - item to be deleted
	 */
	public void deleteItem(Item item) {
		int itemIndex = findItem(item);
		for (int i = itemIndex + 1; i < this.index; i++) {
			this.items[i - 1] = this.items[i];
		}
		this.index -= 1;
	}

	/**...
	 * Method that returns current list of items
	 * @return createdItems - list of created items
	 */
	public Item[] findAll() {
		Item[] createdItems = new Item[index];
		for (int i = 0; i < index; i++) {
			createdItems[i] = this.items[i];
		}
		return createdItems;
	}

	/**...
	 * Method that finds items in the list with the "name" field same as the name in methods parameter
	 * @param name - name of the item to search for
	 * @return requiredItem - array of the found by name items
	 */
	 public Item[] findByName(String name) {
		 Item[] requiredItem = new Item[this.index];
		 int requiredIndex = 0;
		 for (int i = 0; i < this.index; i++) {
			 if (name.equals(this.items[i].getName())) {
				 requiredItem[requiredIndex++] = this.items[i];
			 }
		 }
		 return Arrays.copyOf(requiredItem, requiredIndex);
	 }

	 /**...
	  * Method that finds item in the list by Id
	  * @param id - id of the required item
	  * @return requiredItem - found by id item
	  */
	 public Item findById(String id) {
		 Item requiredItem = null;
		 for (Item item : this.items) {
			 if (id.equals(item.getId())) {
				 requiredItem = item;
				 break;
			 }
		 }
		 return requiredItem;
	 }

	/**...
	 * Method that finds an item in the list
	 * @param item - item to be found
	 * @return index - index of the item in the list
	 */
	 int findItem(Item item) {
		 int count = -1;
		 for (int i = 0; i < this.index; i++) {
			 if (item.getId().equals(this.items[i].getId())) {
				 count = i;
				 break;
			 }
		 }
		 return count;
	 }

	 /**...
	  * Method that updates item in the list
	  * @param item - item that will be placed in the list instead of the old item
	  */
	 public void updateItem(Item item) {
		 int position = findItem(item);
		 this.items[position] = item;
	 }

}