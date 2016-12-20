package ru.plahotin;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**...
 * Test for class ArrayMerge
 */

public class ArrayMergeTest {

	/**...
	 * Test method
	 */
	@Test
	public void ifTestThenCorrect() {
		final int[] firstArray = {2, 4, 9, 11, 18};
		final int[] secondArray = {1, 6, 7};
		ArrayMerge testObj = new ArrayMerge();
		int[] correctArray = {1, 2, 4, 6, 7, 9, 11, 18};
		int[] mergedArray = testObj.mergeArrays(firstArray, secondArray);
		assertThat(correctArray, is(mergedArray));
	}
}