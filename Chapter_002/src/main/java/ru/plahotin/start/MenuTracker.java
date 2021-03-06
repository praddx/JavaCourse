package ru.plahotin.start;

import ru.plahotin.models.Item;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.ZoneOffset;

/**...
 * Class that realises menu actions
 */
public class MenuTracker {

	private Tracker tracker;
	private Input input;
	private UserAction[] actions = new UserAction[5];

	/**...
	 * Constructor
	 * @param input - type of input
	 * @param tracker - tracker object
	 */
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	/**...
	 * Method fills array of possible actions with objects of action classes
	 */
	public void fillActions() {
		this.actions[0] = new MenuTracker.ShowItems("Show all created items");
		this.actions[1] = new AddItem("Add new item");
		this.actions[2] = new DeleteItem("Delete item");
		this.actions[3] = new FindItemByName("Find item by name");
		this.actions[4] = new EditItem("Edit selected item");
	}

	/**...
	 * Method that gets users choice and executes corresponding menu action
	 * @param key - users choice
	 */
	public void select(int key) {
		this.actions[key - 1].execute(input, tracker);
	}

	/**...
	 * Method that shows menu of the program to the users
	 */
	public void show() {
		System.out.printf("       %s\n", "Tracker Menu");
		for (UserAction action : this.actions) {
			System.out.println(action.info());
		}
		System.out.println("");
	}

	/**...
	 * Class that implements UserAction interface and realises show all items action
	 */
	private static class ShowItems extends BaseAction {
		/**...
		 * Constructor uses parent constructor that recieves name of action
		 * @param name - name of action
		 */
		 ShowItems(String name) {
			 super(name);
		 }
		/**...
		 * Method returns actions key in menu
		 * @return key - key of action in menu
		 */
		public int key() {
			return 1;
		}

		/**...
		 * Method that shows all created items
		 * @param input - type of input
		 * @param tracker - tracker object
		 */
		public void execute(Input input, Tracker tracker) {
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

	/**...
	 * Class implements UserAction interface and realizes adding item logic
	 */
	private class AddItem extends BaseAction {
		/**...
		 * Constructor uses parent constructor that recieves name of action
		 * @param name - name of action
		 */
		 AddItem(String name) {
			 super(name);
		 }
		/**...
		 * Method returns actions key in menu
		 * @return key - key of action in menu
		 */
		public int key() {
			return 2;
		}

		/**...
		 * Method that adds creates item and adds it to the tracker
		 * @param input - type of input
		 * @param tracker - tracker object
		 */
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task's name: ");
			System.out.println();

			String desc = input.ask("Please, enter the task's description: ");
			System.out.println();

			ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()),
													ZoneOffset.of("+3"));
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
			System.out.println("Current date: " + zdt.format(formatter));
			String date = input.ask("Press Enter to confirm current date OR\n"
								+ "enter date in dd/mm/yy format: ");
			System.out.println();
			while (!date.matches("[0-3]\\d\\/(0[1-9]|1[0-2])\\/\\d\\d") && !"".equals(date)) {
				System.out.println("You entered date in the wrong format. Please, try again.");
				date = input.ask("Press Enter to confirm current date OR\n"
								+ "enter date in dd/mm/yy format:");
				System.out.println();
			}
			if ("".equals(date)) {
				date = zdt.format(formatter);
			}
			try {
				tracker.addItem(new Item(name, desc, date));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("List of items is full. Please, delete something to add new item.");
			}
		}

		/**...
		 * Method displays info about action
		 * @return info
		 */
		/**public String info() {
			return String.format("%s. %s", this.key(), "Add new item");
		}*/
	}

	/**...
	 * Class implements UserAction interface and realizes delete item logic
	 */
	private class DeleteItem extends BaseAction {
		/**...
		 * Constructor uses parent constructor that recieves name of action
		 * @param name - name of action
		 */
		 DeleteItem(String name) {
			 super(name);
		 }
		/**...
		 * Method returns actions key in menu
		 * @return key - key of action in menu
		 */
		public int key() {
			return 3;
		}

		/**...
		 * Method that deletes item from the tracker
		 * @param input - type of input
		 * @param tracker - tracker object
		 */
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Enter id of the item to delete: ");
			while (!"".equals(id)) {
				if (!tracker.idCheck(id)) {
					id = input.ask("No task with such id. Please try again or press Enter to return to main menu: ");
				} else {
					tracker.deleteItem(tracker.findById(id));
					break;
				}
			}
		}

		/**...
		 * Method displays info about action
		 * @return info
		 */
		/**public String info() {
			return String.format("%s. %s", this.key(), "Delete item");
		}*/
	}

	/**...
	 * Class implements UserAction interface and realizes find item by name logic
	 */
	private class FindItemByName extends BaseAction {
		/**...
		 * Constructor uses parent constructor that recieves name of action
		 * @param name - name of action
		 */
		 FindItemByName(String name) {
			 super(name);
		 }
		/**...
		 * Method returns actions key in menu
		 * @return key - key of action in menu
		 */
		public int key() {
			return 4;
		}

		/**...
		 * Method that searches tracker for items with given name and displays them
		 * @param input - type of input
		 * @param tracker - tracker object
		 */
		public void execute(Input input, Tracker tracker) {
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

		/**...
		 * Method displays info about action
		 * @return info
		 */
		/**public String info() {
			return String.format("%s. %s", this.key(), "Find item by name");
		}*/
	}

	/**...
	 * Class implements UserAction interface and realizes adding item logic
	 */

}

/**...
 * Class that implements UserAction interface
 * and used to realize "edit item" option of the tracker programm
 */
class EditItem extends BaseAction {
	/**...
	* Constructor uses parent constructor that recieves name of action
	* @param name - name of action
	*/
	EditItem(String name) {
		 super(name);
	}
	/**...
	 * Method returns an int value that represents actions's place in the menu
	 * @return number - number of the action in the menu
	 */
	public int key() {
			return 5;
		}
	/**...
	 * Method executes required logic to edit item in the item's list
	 * @param input - type of input
	 * @param tracker - tracker object
	 */
	public void execute(Input input, Tracker tracker) {
		String id = input.ask("Enter id of the item to update: ");
		System.out.println();

		// find item to edit
		Item itemToEdit = tracker.findById(id);

		// set new name or leave name unchanged
		String name = input.ask("Enter new NAME or press Enter to skip: ", itemToEdit.getName());

		// set new description or leave unchanged
		String description = input.ask("Enter new DESCRIPTION or press Enter to skip: ", itemToEdit.getDescription());

		// set new date of creation or leave unchanged
		String date = input.ask("Enter new DATE in dd/mm/yy format or press Enter to skip: ", itemToEdit.getCreate());

		Item editedItem = new Item(name, description, date, itemToEdit.getId());

		tracker.updateItem(editedItem);


	}
		/**...
		 * Method displays info about action
		 * @return info
		 */
	/**public String info() {
		return String.format("%s. %s", this.key(), "Edit selected item");
	}*/
}