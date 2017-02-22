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
	 * Constructor that creates initial list of items
	 * @param initItems - initial items
	 * @param size - size of the item array
	 */
	 Tracker(int size, Item[] initItems) {
		 this.items = new Item[size];
		 this.index = initItems.length;
		 for (int i = 0; i < initItems.length; i++) {
			 this.items[i] = initItems[i];
		 }

	 }
	/**...
	 * Method generates ID for the new item in the list
	 * @return - returns ID
	 */
	private String generateId() {
		return String.valueOf(RN.nextInt(100000));
	}

	/**...
	 * Method that adds items to the list
	 * @param item - an item that will be added to list
	 * @return item - added item
	 * @throws ArrayIndexOutOfBoundsException - index exception
	 */
	public Item addItem(Item item) throws ArrayIndexOutOfBoundsException {
		if (this.index <= this.items.length - 1) {
			item.setId(this.generateId());
			this.items[this.index++] = item;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
		return item;
	}

	/**...
	 * Method that deletes an item from the list
	 * Firstly method determines the index in list of the item that has to be deleted
	 * Then it replaces found item with the following items of the list
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
		for (int i = 0; i < this.index; i++) {
			if (id.equals(this.items[i].getId())) {
				requiredItem = items[i];
				break;
			}
		}
		return requiredItem;
	 }

	/**...
	 * Method that finds item in the list by Id
	 * @param id - id of the required item
	 * @return exists - true if id is correct, false otherwise
	 */
	 public boolean idCheck(String id) {
		 for (int i = 0; i < this.index; i++) {
			 if (id.equals(this.items[i].getId())) {
				 return true;
			 }
		}
		return false;
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
	  * @param editedItem - item that will be placed in the list instead of the old item
	  */
	 public void updateItem(Item editedItem) {
		 int position = findItem(editedItem);
		 this.items[position] = editedItem;
	 }

}