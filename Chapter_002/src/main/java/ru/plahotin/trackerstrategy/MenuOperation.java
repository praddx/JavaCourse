package ru.plahotin.trackerstrategy;

import ru.plahotin.start.Input;
import ru.plahotin.start.Tracker;
/**...
 * Class for the context object for strategy pattern implementation in Tracker program
 */
public class MenuOperation {
	private Action action;

	/**...
	 * Constructor
	 * @param action - object that implements interface Action and determines what action to do
	 */
	public MenuOperation(Action action) {
		this.action = action;
	}

	/**...
	 * Execute method
	 * @param input - input method
	 * @param tracker - tracker object
	 */
	public void executeOperation(Input input, Tracker tracker) {
		this.action.executeAction(input, tracker);
	}
}