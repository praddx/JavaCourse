package ru.plahotin;

//import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Test for class RotationTest
 */
public class RotationTest {
	/**...
	 * Method to test rotation class
	 */
	 public void whenArrayThenCorrectRotation() {
		 Rotation arrayRot = new Rotation();
		 int[][] initArray = {{2, 4}, {5, 9}};
		 int[][] testArray = arrayRot.rotateArray(initArray);
		 int[][] correctArray = {{4, 9}, {2, 5}};
		 assertThat(correctArray, is(testArray));

		 int[][] initArray1 = {{1, 5, 3}, {2, 0, 9}, {3, 7, 1}};
		 int[][] testArray1 = arrayRot.rotateArray(initArray1);
		 int[][] correctArray1 = {{3, 9, 1}, {5, 0, 7}, {1, 2, 3}};
		 assertThat(correctArray1, is(testArray1));
	 }
}