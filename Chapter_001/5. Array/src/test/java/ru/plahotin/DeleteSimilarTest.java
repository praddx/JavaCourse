package ru.plahotin;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Test for DeleteSimilar class
 */
public class DeleteSimilarTest {

	/**...
	 * Test method
	 */
	 public void whenArrayThenCleared() {
		 DeleteSimilar testObj = new DeleteSimilar();
		 String[] strArray = {"1", "2", "4", "4", "2", "2", "3"};
		 String[] rightArray = {"1", "2", "4", "3"};
		 String[] answerArray = testObj.arrayClear(strArray);
		 assertThat(rightArray, is(answerArray));
	 }
}