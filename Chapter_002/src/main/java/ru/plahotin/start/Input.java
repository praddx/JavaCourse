package ru.plahotin.start;

/**...
 * Interface must be implemented by classes that will set type of input in Tracker program
 */
public interface Input {
	/**...
	 * method that should describe the way of input
	 * @param question - a String with question for the user
	 * @return answer - returns users input as a String
	 */
	String ask(String question);
}