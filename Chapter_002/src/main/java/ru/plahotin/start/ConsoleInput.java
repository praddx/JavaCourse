package ru.plahotin.start;

import java.util.Scanner;

/**...
 * Class that sets input to a console intput by user
 */
public class ConsoleInput implements Input {

	private Scanner scanner = new Scanner(System.in);
	/**...
	 * method prints a question and reads user input
	 * @param question - prompt messege
	 * @return - returns user input
	 */
	@Override
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
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
		int key = Integer.valueOf(this.ask(question));
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
	 * @param question - prompt messege
	 * @param defValue - default value
	 * @return - returns user input
	 */
	@Override
	public String ask(String question, String defValue) {
		System.out.print(question);
		String answer = scanner.nextLine();
		if (!answer.equals("")) {
			return answer;
		} else {
			return defValue;
		}
	}

}