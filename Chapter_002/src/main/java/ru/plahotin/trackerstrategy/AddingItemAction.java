package ru.plahotin.trackerstrategy;

import ru.plahotin.models.Item;
import ru.plahotin.start.Tracker;
import ru.plahotin.start.Input;
/**...
 * Class that implements strategy interface "Action" for Tracker program
 */
public class AddingItemAction implements Action {
	/**...
	 * Method adds new Item to the tracker
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	@Override
	public void executeAction(Input input, Tracker tracker) {

		String name = input.ask("Enter name of the new item: ");
		String desc = input.ask("Enter description: ");
		long date = Long.parseLong(input.ask("Enter date: "));
		tracker.addItem(new Item(name, desc, date));
	}
}