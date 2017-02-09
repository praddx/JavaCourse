package ru.plahotin.shapes;

/**...
 * Square strategy class
 * made to train strategy pattern
 */
public class Square implements Shape {

	/**...
	 * method that draws a square with pseudographics
	 * implementation of the interface method
	 * @return shape - returns square
	 */
	public String draw() {
		return "****\n*  *\n*  *\n****";
	}
}