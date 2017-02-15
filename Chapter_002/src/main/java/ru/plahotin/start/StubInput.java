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

	/**...
	 * method prints a question and reads user input
	 * return - returns user input
	 */
	@Override
	public long ask(String question, long defValue) {
		if (!answers[position].equals("")) {
			return Long.parseLong(answers[position++]);
		} else {
			return defValue;
		}
	}
}