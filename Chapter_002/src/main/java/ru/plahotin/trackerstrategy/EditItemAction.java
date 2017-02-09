package ru.plahotin.trackerstrategy;

import ru.plahotin.models.Item;
import ru.plahotin.start.Input;
import ru.plahotin.start.Tracker;
/**...
 * Class that implements strategy interface "Action" for Tracker program
 * Updates and item in tracker
 */
public class EditItemAction implements Action {
	/**...
	 * Method finds an item by Id, then creates new item, and updates tracker with edited item
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	public void executeAction(Input input, Tracker tracker) {
		String id = input.ask("Enter id of the item to update: ");
		String name;
		String desc;
		long date;
		String choice;
		System.out.println();

		Item itemToEdit = tracker.findById(id);

		choice = input.ask("Enter new NAME or press Enter to skip: ");
		if (!choice.equals("")) {
			name = choice;
		} else {
			name = itemToEdit.getName();
		}

		choice = input.ask("Enter new DESCRIPTION or press Enter to skip: ");
		if (!choice.equals("")) {
			desc = choice;
		} else {
			desc = itemToEdit.getDescription();
		}

		choice = input.ask("Enter new DATE or press Enter to skip: ");
		if (!choice.equals("")) {
			date = Long.parseLong(choice);
		} else {
			date = itemToEdit.getCreate();
		}


		Item editedItem = new Item(name, desc, date);
		editedItem.setId(id);

		tracker.updateItem(editedItem);
	}
}