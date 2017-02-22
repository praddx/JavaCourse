package ru.plahotin.start;

/**...
 * Class for automated input for Tracker program tests
 */
public class StubInput implements Input {

	private String[] answers;
	private int position = 0;

	/**...
	 * Constructor
	 * @param answers - array of strings with answers to menu questions
	 */
	public StubInput(String[] answers) {
		this.answers = answers;
	}

	/**...
	 * Relization of method ask from interface Input
	 * @param question - question from menu
	 * @return string - an answer
	 */
	 @Override
	public String ask(String question) {
		return answers[position++];
	}

	/**...
	 * method prints a question and reads user input
	 * checks if input is correct and if so returns acquired input
	 * @param question - prompt messege
	 * @param range - range of possible actions
	 * @return key - returns user input
	 */
	 @Override
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(answers[position++]);
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutException("Please select correct choice.");
		}
	}

	/**...
	 * method prints a question and reads user input
	 * return - returns user input
	 */
	@Override
	public String ask(String question, String defValue) {
		if (!answers[position].equals("")) {
			return answers[position++];
		} else {
			return defValue;
		}
	}


}