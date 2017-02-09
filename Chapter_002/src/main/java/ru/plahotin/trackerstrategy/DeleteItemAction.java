package ru.plahotin.trackerstrategy;

import ru.plahotin.start.Tracker;
import ru.plahotin.start.Input;
/**...
 * Class that implements strategy interface "Action" for Tracker program
 */
public class DeleteItemAction implements Action {
	/**...
	 * Method deletes Item from the tracker, Item is found by its id
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	@Override
	public void executeAction(Input input, Tracker tracker) {

		String id = input.ask("Enter id of the item to delete: ");
		tracker.deleteItem(tracker.findById(id));
	}
}