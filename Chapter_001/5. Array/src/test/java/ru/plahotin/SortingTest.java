package ru.plahotin;

/**...
 * Test for class Sorting
 * @author Alexander Plakhotin
 * @since 30.11.2016
 */

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Testing class
 */
public class SortingTest {

	/**...
	 * Test of method bubleSort with array {5, 2, 10, 8, 1}
	 */
	public void whenSortingThenRight() {
		final int[] testArray = {5, 2, 10, 8, 1};
		final Sorting bSort = new Sorting();
		final int[] sortedArray = bSort.bubleSort(testArray);
		final int[] rightArray = {1, 2, 5, 8, 10};
		assertThat(rightArray, is(sortedArray));
	}
}