package ru.plahotin;

/**...
 * Class that prints a pyramid made of "^" based on entered number
 * @author Alexander Plakhotim
 * @since 23.11.16
 */
public class Paint {

	/**...
	 * Method that constructs a pyramid in pseudographics based on the
	 * height that it gets as parameter
	 * @param height - height of the pyramid
	 * @return - returns a string that contains a pyramid
	 */
	public String piramid(int height) {
		/**...
		 * Stringbuilder that is used to construct pyramid
		 */
		StringBuilder pyramid = new StringBuilder();
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < height - i; j++) {
				pyramid.append(" ");
			}
			pyramid.append("^");
			for (int k = 1; k < i; k++) {
				pyramid.append(" ^");
			}
			if (i < height) {
				pyramid.append("\n");
			}
		}
		return pyramid.toString();
	}
}