package ru.plahotin.trackerstrategy;

import ru.plahotin.models.Item;
import ru.plahotin.start.Tracker;
import ru.plahotin.start.Input;
/**...
 * Class that implements strategy interface "Action" for Tracker program
 */
public class FindItemByNameAction implements Action {
	/**...
	 * Method finds and prints all Items from the tracker that match entered name
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	@Override
	public void executeAction(Input input, Tracker tracker) {

		String name = input.ask("Enter name of the item to find: ");
		Item[] foundByName = tracker.findByName(name);
		if (foundByName.length > 0) {
			for (Item item : foundByName) {
				System.out.println(item.toString());
			}
			} else {
				System.out.println("No tasks with such name!\n");
			}
	}
}