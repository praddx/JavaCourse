package ru.plahotin.start;

import java.util.Scanner;

/**...
 * Class that sets input to a console intput by user
 */
public class ConsoleInput implements Input {

	/**...
	 * method prints a question and reads user input
	 * return - returns user input
	 */
	@Override
	public String ask(String question) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(question);
		return scanner.nextLine();
	}

	/**...
	 * method prints a question and reads user input
	 * return - returns user input
	 */
	@Override
	public String ask(String question, String defValue) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(question);
		String answer = scanner.nextLine();
		if (!answer.equals("")) {
			return answer;
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
		Scanner scanner = new Scanner(System.in);
		System.out.print(question);
		String answer = scanner.nextLine();
		if (!answer.equals("")) {
			return Long.parseLong(answer);
		} else {
			return defValue;
		}
	}
}