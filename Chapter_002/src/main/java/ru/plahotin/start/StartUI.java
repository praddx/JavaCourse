package ru.plahotin.start;

/**...
 * Class that starts Tracker program
 */
public class StartUI {
	private Input input;
	private Tracker tracker;

	/**...
	 * Constructor
	 * @param input - type of input
	 * @param tracker - tracker object
	 */
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	/**...
	 * Method that runs logic
	 */
	public void init() {
		//Tracker tracker = new Tracker(10);
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		int key;
		do {
			menu.show();
			key = Integer.parseInt(input.ask("Select action or enter '6' to exit: "));
			if (key != 6) {
				System.out.println();
				menu.select(key);
				System.out.println();
			}
		} while (key != 6);
	}

	/**...
	 * Method main
	 * @param args - standard param
	 */
	public static void main(String[] args) {
		Input input = new ConsoleInput();
		new StartUI(input, new Tracker(10)).init();
	}
}