package ru.plahotin;

/**...
 * Class that describes a point in 2d coordinates
 * @author Alexander Plakhotin
 * @since 16.11.2016
 */

 public class Point {
	 /**...
	  * var x
	  */
	 public double x;
	 /**...
	  * var y
	  */
	 public double y;

	/**...
	 * Constructor that sets x and y coordinates of the point
	 * @param px - var x
	 * @param py - var y
	 */
	 public Point(double px, double py) {
		 this.x = px;
		 this.y = py;
	 }

	 /**...
	  * Method that calculates the distance between this point and another point
	  * @param point - another point
	  * @return - returns result
	  */
	 public double distanceTo(Point point) {
		 double deltaX = this.x - point.x;
		 double deltaY = this.y - point.y;
		 return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	 }
 }