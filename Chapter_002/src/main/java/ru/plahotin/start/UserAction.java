package ru.plahotin.start;

/**...
 * interface for menu actions
 */
public interface UserAction {

	/**...
	 * Method returns key of the action in the menu
	 * @return key
	 */
	int key();

	/**...
	 * Method that realizes logic of the action
	 * @param input - type of input
	 * @param tracker - tracker object
	 */
	void execute(Input input, Tracker tracker);

	/**...
	 * Method returns description of the action for the menu
	 * @return info
	 */
	String info();
}