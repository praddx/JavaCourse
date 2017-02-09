package ru.plahotin.shapes;

/**...
 * Triangle strategy class
 * made to train strategy pattern
 */
public class Triangle implements Shape {

	/**...
	 * method that draws a square with pseudographics
	 *implementation of the interface method
	 * @return shape - returns triangle
	 */
	public String draw() {
		return "   *\n  ***\n *****\n*******";
	}
}