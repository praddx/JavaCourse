package ru.plahotin;

/**...
 * Class contains method that merges two sorted in ascending order arrays.
 * New array is sorted the same way
 * @author Alexander Plakhotin
 * @since 20.12.16
 */
public class ArrayMerge {

	/**...
	 * Method that merges two int arrays
	 * @param firstArray - first array
	 * @param secondArray - second array
	 * @return mergedArray - resultin merged array
	 */
	public int[] mergeArrays(int[] firstArray, int[] secondArray) {
		int firstSize = firstArray.length;
		int secondSize = secondArray.length;
		int mergedSize = firstSize + secondSize;
		int[] mergedArray = new int[mergedSize];
		int firstIndex = 0;
		int secondIndex = 0;

		for (int i = 0; i < mergedSize; i++) {
			if (secondIndex == secondSize || (firstIndex < firstSize && firstArray[firstIndex] < secondArray[secondIndex])) {
				mergedArray[i] = firstArray[firstIndex];
				firstIndex++;
			} else {
				mergedArray[i] = secondArray[secondIndex];
				secondIndex++;
			}
		}

		return mergedArray;
	}
}