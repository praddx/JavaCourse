package ru.plahotin.trackerstrategy;

import ru.plahotin.models.Item;
import ru.plahotin.start.Tracker;
import ru.plahotin.start.Input;
/**...
 * Class that implements strategy interface "Action" for Tracker program
 */
public class FindAllItemsAction implements Action {
	/**...
	 * Method prints all Items that had been added to the tracker
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	@Override
	public void executeAction(Input input, Tracker tracker) {
		Item[] createdItems = tracker.findAll();
		if (createdItems.length > 0) {
			for (Item item : createdItems) {
				System.out.println(item.toString());
			}
		} else {
			System.out.println("List is empty\n");
		}
	}
}