package ru.plahotin;

import java.util.Arrays;

/**...
 * Class contains method that deletes repeating data in array
 * @author Alexander Plakhotin
 * @since 10.12.16
 */
public class DeleteSimilar {

	/**...
	 * Method that will delete repeating strings from array
	 * @param initialArray - array that will be cleared
	 * @return clearedArray - array with unique strings
	 */
	public String[] arrayClear(String[] initialArray) {

		int index = 0;
		int counter = 0;
		String[] clearedArray = new String[initialArray.length];
		for (int i = 0; i < initialArray.length; i++) {
			counter = 0;
			for (int j = 0; j < index; j++) {
				if (clearedArray[j].equals(initialArray[i])) {
					counter++;
				}
			}
			if (counter == 0) {
				clearedArray[index++] = initialArray[i];
			}
		}
		clearedArray = Arrays.copyOf(clearedArray, index);
		return clearedArray;
	}
}