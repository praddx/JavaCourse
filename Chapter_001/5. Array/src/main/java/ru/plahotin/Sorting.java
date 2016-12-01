package ru.plahotin;

/**...
 * Programm that sorts array using buble sort algorithm
 */


public class Sorting {

	/**...
	 * Method sorts an array
	 * @param a - array to sort
	 * @return a - sorted array
	 */
	public int[] bubleSort(int[] a) {

	int temp = 0;
	for (int i = 0; i < a.length - 1; i++) {
		for (int j = a.length - 1; j > 0; j--) {
			if (a[j] < a[j - 1]) {
				temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
			}
		}
	}
	return a;
	}
}