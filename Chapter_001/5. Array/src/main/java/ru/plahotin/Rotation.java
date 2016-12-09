package ru.plahotin;

/**...
 * Program to rotate square array 90 degrees
 * @author Alexander Plakhotin
 * @since 09.12.16
 */

public class Rotation {

	/**...
	 * Method to rotatate square array
	 * @param array - array to rotate
	 * @return rotatedArray - returns rotated array
	 */
	 public int[][] rotateArray(int[][] array) {
		 int size = array.length;
		 int[][] rotatedArray = new int[size][size];
		 for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				rotatedArray[j][i] = array[i][j];
			}
		}
		return rotatedArray;
	 }
}