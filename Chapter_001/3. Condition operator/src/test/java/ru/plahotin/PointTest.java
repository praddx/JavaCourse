package ru.plahotin;

/**...
 * Test for class Point
 * @author Alexander Plakhotin
 *@since 16.11.2016
 */

 import org.junit.Test;
 import static org.junit.Assert.assertEquals;

 /**...
  * Test
  */
 public class PointTest {
	 /**...
	  * Precision for method asserEquals
	  */
	 private static final double PRECISION = 0.0001;
	 /**...
	  * Test
	  */
	 @Test
	 public void whenSecondPointThenRightDistance() {
		 final Point pointA = new Point(0, 0);
		 final Point pointB = new Point(4, 0);
		 final double distance = pointA.distanceTo(pointB);
		 assertEquals(4d, distance, PRECISION);

	 }
	 /**...
	  * Test
	  */
	 @Test
	 public void whenSecondPointThenRightDistance1() {
		 final Point pointA = new Point(0, 0);
		 final Point pointB = new Point(2, 2);
		 final double distance = pointA.distanceTo(pointB);
		 assertEquals(Math.sqrt(8), distance, PRECISION);

	 }
 }