package ru.plahotin;

/**...
 * Program that reverses an array
 * @author Alexander Plakhotin
 * @since 30.11.2016
 */

public class Turn {

	/**...
	 * Method that reverses an array
	 * @param a - array to reverses
	 * @return a - reveresed array
	 */
	public int[] back(int[] a) {
		int temp = 0;
		for (int i = 0; i < (a.length / 2); i++) {

			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		return a;
	}
}