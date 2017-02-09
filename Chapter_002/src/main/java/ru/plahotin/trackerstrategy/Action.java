package ru.plahotin.trackerstrategy;

import ru.plahotin.start.Tracker;
import ru.plahotin.start.Input;
/**...
 * Strategy interface for menu options in Tracker program
 */
public interface Action {
	/**...
	 * action method
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	void executeAction(Input input, Tracker tracker);
}