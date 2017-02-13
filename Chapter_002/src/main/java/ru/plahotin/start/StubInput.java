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
	public String ask(String question) {
		return answers[position++];
	}
}