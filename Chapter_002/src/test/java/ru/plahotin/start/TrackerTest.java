package ru.plahotin.start;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import ru.plahotin.models.Item;

/**...
 * Test for class ItemEvent
 * @author Alexander Plakhotin
 * @since 25.11.2017
 */

public class TrackerTest {

	/**...
	 * Test for method addItem(Item)
	 */

	@Test
	public void whenAddItemThenReturnItem() {
		final Item item1  = new Item("First Item", "Item #1", 1);
		final Tracker tracker = new Tracker(2);
		final Item result = tracker.addItem(item1);
		assertThat(result, is(item1));
	}

	/**...
	 * Test for method findAll()
	 * Method must return an array of all the added items
	 */
	@Test
	public void whenFindAllThenReturnAllAddedItems() {
		final Item item1 = new Item("First", "Item #1", 1);
		final Item item2 = new Item("Second", "Item #2", 2);
		final Item item3 = new Item("Third", "Item #3", 3);
		final Tracker tracker = new Tracker(4);
		tracker.addItem(item1);
		tracker.addItem(item2);
		tracker.addItem(item3);
		final Item[] result = tracker.findAll();
		final Item[] correctList = {item1, item2, item3};
		assertThat(result, is(correctList));
	}

	/**...
	 * Test for method deleteItem(Item)
	 * Method must remove item from the array in tracker
	 */
	@Test
	public void whenDeleteItemThenReturnEditedListOfItems() {
		final Item item1 = new Item("First", "Item #1", 1);
		final Item item2 = new Item("Second", "Item #2", 2);
		final Item item3 = new Item("Third", "Item #3", 3);
		final Tracker tracker = new Tracker(4);
		tracker.addItem(item1);
		tracker.addItem(item2);
		tracker.addItem(item3);
		tracker.deleteItem(item2);
		final Item[] result = tracker.findAll();
		final Item[] correctList = {item1, item3};
		assertThat(result, is(correctList));
	}

	/**...
	 * Test for method findByName(String)
	 * Method must return array of items that have name from the parameter
	 */
	 @Test
	 public void whenFindByNameThenReturnCorrectArray() {
		final Item item1 = new Item("First", "Item #1", 1);
		final Item item2 = new Item("Second", "Item #2", 2);
		final Item item3 = new Item("Third", "Item #3", 3);
		final Item item4 = new Item("First", "Item #4", 4);
		final Tracker tracker = new Tracker(4);
		tracker.addItem(item1);
		tracker.addItem(item2);
		tracker.addItem(item3);
		tracker.addItem(item4);
		final Item[] result = tracker.findByName("First");
		final Item[] correctList = {item1, item4};
		assertThat(result, is(correctList));
	 }

	 /**...
	  * Test for method findById(String)
	  * Method must return an item with the set id
	  */
	  @Test
	  public void whenFindByIdThenReturnCorrectItem() {
		final Item item1 = new Item("First", "Item #1", 1);
		final Item item2 = new Item("Second", "Item #2", 2);
		final Item item3 = new Item("Third", "Item #3", 3);
		final Item item4 = new Item("First", "Item #4", 4);
		final Tracker tracker = new Tracker(4);
		tracker.addItem(item1);
		tracker.addItem(item2);
		tracker.addItem(item3);
		tracker.addItem(item4);
		final Item result = tracker.findById(item2.getId());
		final Item correctItem = item2;
		assertThat(result, is(correctItem));
	  }

}






















