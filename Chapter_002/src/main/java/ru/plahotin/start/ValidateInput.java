package ru.plahotin.start;

/**...
 * Class that validates user input
 */
public class ValidateInput extends ConsoleInput {

	/**...
	 * Method ask that validates user input
	 * Particularly that user entered number and that number is in range of menu choices
	 * @param question - prompt phrase
	 * @param range - range of acceptable inputs
	 * @return key - choice of action from the menu
	 */
	 @Override
	public int ask(String question, int[] range) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = super.ask(question, range);
				invalid = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter valid data again.");
			} catch (MenuOutException moe) {
				System.out.println("Please select key from menu.");
			}
		} while (invalid);
		return value;
	}
}