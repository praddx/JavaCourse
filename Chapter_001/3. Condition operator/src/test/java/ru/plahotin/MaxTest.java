package ru.plahotin;

/**...
 * Test for class Max
 * @author Alexander Plakhotin
 * @since 17.11.2016
 */

 import org.junit.Test;
 import static org.junit.Assert.assertThat;
 import static org.hamcrest.core.Is.is;

 /**...
  * Test
  */
 public class MaxTest {

	/**...
	 * Test that chexks if the max method with 2 parameters defines the biggest number correctly
	 */
	@Test
	 public void whenMax2ThenBiggest() {
		 final Max maxObj = new Max();
		 final int maxNumber = maxObj.max(2, 8);
		 assertThat(8, is(maxNumber));

	 }

	 /**...
	 * Test that chexks if the max method with 3 parameters defines the biggest number correctly
 	 */
	 @Test
	 public void whenMax3ThenBiggest() {

		 final Max maxObj = new Max();
		 final int maxNumber = maxObj.max(2, 8, 0);
		 assertThat(8, is(maxNumber));

	 }
 }