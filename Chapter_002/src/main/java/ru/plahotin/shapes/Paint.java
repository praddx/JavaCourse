package ru.plahotin.shapes;

/**...
 * context class that is used with strategy pattern
 */
public class Paint {
	private Shape shape;

	/**...
	 * Constructor
	 * @param shape - shape
	 */
	public Paint(Shape shape) {
		this.shape = shape;
	}

	/**...
	 * run method
	 * @return shape - returns needed shape in pseudographics
	 */
	public String pic() {
		return this.shape.draw();
	}
}