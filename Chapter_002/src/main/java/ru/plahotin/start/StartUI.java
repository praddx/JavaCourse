package ru.plahotin.start;

import ru.plahotin.trackerstrategy.FindAllItemsAction;
import ru.plahotin.trackerstrategy.AddingItemAction;
import ru.plahotin.trackerstrategy.DeleteItemAction;
import ru.plahotin.trackerstrategy.FindItemByNameAction;
import ru.plahotin.trackerstrategy.MenuOperation;
import ru.plahotin.trackerstrategy.EditItemAction;
/**...
 * class that executes Tracker program with console input
 */
public class StartUI {

	/**...
	 * input - variable that determines type of input
	 */
	private Input input;
	public Tracker tracker;

	/**...
	 * Context object for strategy pattern implementation
	 */
	private MenuOperation menuOperation;

	/**...
	 * main method with console input
	 * @param args - console arguments
	 */
	public static void main(String[] args) {
		Input input  = new ConsoleInput();
		new StartUI(input, new Tracker(10)).init();
	}

	/**...
	 * constructor that sets type of input
	 * @param input - input method
	 * @param tracker - tracker
	 */
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	/**...
	 * method that executes shows user UI and operates on the input
	 */
	public void init() {
		//Tracker tracker = new Tracker(10);
		int choice = 0;
		showWelcoming();
		do {
			showMenu();
			choice = Integer.parseInt(this.input.ask("What do you want to do: "));
			System.out.println();
			switch (choice) {
				case 1:
					menuOperation = new MenuOperation(new FindAllItemsAction());
					menuOperation.executeOperation(input, tracker);
					break;
				case 2:
					menuOperation = new MenuOperation(new AddingItemAction());
					menuOperation.executeOperation(input, tracker);
					break;
				case 3:
					menuOperation = new MenuOperation(new DeleteItemAction());
					menuOperation.executeOperation(input, tracker);
					break;
				case 4:
					menuOperation = new MenuOperation(new FindItemByNameAction());
					menuOperation.executeOperation(input, tracker);
					break;
				case 5:
					menuOperation = new MenuOperation(new EditItemAction());
					menuOperation.executeOperation(input, tracker);
				case 6:
					break;
				default:
					System.out.println("No such option.");
					break;
			}
		} while (choice != 6);
	}

	/**...
	 * method that prints welcoming message
	 */
	public void showWelcoming() {

		System.out.println("====================================================\n"
						 + "=                     Hello!                       =\n"
						 + "=  You're working with a task management program   =\n"
						 + "= The list of tasks can hold no more than 10 tasks =\n"
						 + "=         Choose what you want to do!              =\n"
						 + "====================================================\n\n");
	}

	/**...
	 * method prints menuOperation
	 */
	public void showMenu() {

		System.out.println("======================================================\n"
						+  "                      MENU\n\n"
						+  "                 1. Show all tasks\n"
						+  "                 2. Add task\n"
						+  "                 3. Delete task\n"
						+  "                 4. Find task by name\n"
						+  "                 5. Edit task\n"
						+  "                 6. Exit\n");
	}
}