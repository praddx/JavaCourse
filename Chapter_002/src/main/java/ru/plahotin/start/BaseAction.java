package ru.plahotin.start;

/**...
 * Abstract class that implements UserAction interface
 * and realizes functionality of the info method
 * info method prints name of the action in the menu
 */
abstract class BaseAction implements UserAction {

	public String name;

	/**...
	 * Constructor - sets name of the action
	 * @param name - name of action for the menu
	 */
	BaseAction(String name) {
		this.name = name;
	}
	/**...
	 * Method returns key of the function in menu
	 * @return key - key
	 */
	public abstract int key();

	/**...
	 * Method that executes logic of the action
	 * @param input - type of input
	 * @param tracker - tracker object
	 */
	 public abstract void execute(Input input, Tracker tracker);

	 /**...
	  * Method that prints name of the action
	  * @return info - name of the action for menu
	  */
	public String info() {
		return String.format("%s. %s", this.key(), this.name);
	}
}