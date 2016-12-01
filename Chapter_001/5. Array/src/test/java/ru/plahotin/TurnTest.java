package ru.plahotin;

/**...
 * Test that tests class Turn
 */

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Testing class
 */
public class TurnTest {

	/**...
	 * Method tests method back with array {1, 6, 2, 4}
	 */
	@Test
	public void whenBackTestThenRight() {

		final Turn array = new Turn();
		final int[] testArray = {1, 6, 2, 4};
		final int[] arrayExpected = {4, 2, 6, 1};
		final int[] arrayReversed = array.back(testArray);
		assertThat(arrayReversed, is(arrayExpected));

		final int[] testArray1 = {1, 6, 4};
		final int[] arrayExpected1 = {4, 6, 1};
		final int[] arrayReversed1 = array.back(testArray1);
		assertThat(arrayReversed1, is(arrayExpected1));

		final int[] testArray2 = {1, 6};
		final int[] arrayExpected2 = {6, 1};
		final int[] arrayReversed2 = array.back(testArray2);
		assertThat(arrayReversed2, is(arrayExpected2));
	}
}