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
		System.out.println();

		// find item to edit
		Item itemToEdit = tracker.findById(id);

		// set new name or leave name unchanged
		itemToEdit.setName(input.ask("Enter new NAME or press Enter to skip: ", itemToEdit.getName()));

		// set new description or leave unchanged
		itemToEdit.setDescription(input.ask("Enter new DESCRIPTION or press Enter to skip: ", itemToEdit.getDescription()));

		// set new date of creation or leave unchanged
		itemToEdit.setCreateDate(input.ask("Enter new DATE or press Enter to skip: ", itemToEdit.getCreate()));

	}

}