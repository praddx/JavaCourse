package ru.plahotin.start;

/**...
 * Class for menu exception
 */
public class MenuOutException extends RuntimeException {

	/**...
	 * Exception that occurs if entered number is out of range of menu choices
	 * @param msg - messege
	 */
	public MenuOutException(String msg) {
		super(msg);
	}
}