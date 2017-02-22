package ru.plahotin.start;

/**...
 * Class that starts Tracker program
 */
public class StartUI {
	private Input input;
	private Tracker tracker;
	private int[] userActions = new int[] {1, 2, 3, 4, 5};

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
		//int key;
		do {
				menu.show();
				System.out.println();
				menu.select(input.ask("select:", this.userActions));
				System.out.println();
		} while (!"y".equals(this.input.ask("Exit?:")));
	}

	/**...
	 * Method main
	 * @param args - standard param
	 */
	public static void main(String[] args) {
		Input input = new ValidateInput();
		new StartUI(input, new Tracker(10)).init();
	}
}