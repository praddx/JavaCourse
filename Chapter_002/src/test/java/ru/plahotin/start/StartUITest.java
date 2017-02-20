package ru.plahotin.start;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import ru.plahotin.models.Item;
/**...
 * class that executes Tracker program with console input
 */
public class StartUITest {

	/**...
	 * Method tests option 2 of the tracker program menu (adding task to the tracker)
	 */
	@Test
	public void when1ChoiceThenCorrectResults() {
		Input input = new StubInput(new String[] {"1", "2", "first name", "first desc", "21/02/17", "6"});
		Tracker tracker = new Tracker(10);
		StartUI start = new StartUI(input, tracker);
		Item[] resultItems;
		Item resultItem;
		start.init();
		resultItems = tracker.findAll();
		resultItem = resultItems[0];
		assertThat(resultItem.getName(), is("first name"));
	}

	/**...
	 * Method tests option 3 of the tracker program menu (deleting a task from the tracker)
	 */
	 @Test
	 public void when3ChoiceThenDeleted() {
		Input input = new StubInput(new String[] {"1", "3", "2", "1", "6"});
		Item item1 = new Item("first name", "first desc", "12/02/17", "1");
		Item item2 = new Item("second name", "decond desc", "21/02/17", "2");
		Item item3 = new Item("first name", "same name for test purose", "12/01/17", "3");
		Item[] initItems = {item1, item2, item3};
		Tracker tracker = new Tracker(10, initItems);
		StartUI start = new StartUI(input, tracker);
		Item[] correctItems = {item1, item3};
		Item[] resultItems;

		start.init();
		resultItems = tracker.findAll();
		assertThat(resultItems, is(correctItems));
	 }

	 /**...
	 * Method tests option 5 of the tracker program menu (edit task)
	 */
	 @Test
	 public void when5ChoiceThen3ItemEdited() {
		Input input = new StubInput(new String[] {"1", "5", "3", "third name", "blabla", "44", "1", "6"});
		Item item1 = new Item("first name", "first desc", "12/02/17", "1");
		Item item2 = new Item("second name", "decond desc", "21/02/17", "2");
		Item item3 = new Item("first name", "same name for test purose", "12/01/17", "3");
		Item[] initItems = {item1, item2, item3};
		Tracker tracker = new Tracker(10, initItems);
		StartUI start = new StartUI(input, tracker);
		Item[] resultItems;
		Item resultItem;
		start.init();
		resultItems = tracker.findAll();
		resultItem = resultItems[2];
		assertThat(resultItem.getName(), is("third name"));
	 }
}