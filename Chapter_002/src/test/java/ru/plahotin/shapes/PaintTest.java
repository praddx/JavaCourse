package ru.plahotin.shapes;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Test for strategy pattern train program
 */
public class PaintTest {

	/**...
	 * Test method
	 */
	@Test
	public void whenPaintShapeThenCorrectStringReturned() {
		final String correctTriangle = "   *\n  ***\n *****\n*******";
		final Paint paintTriangle = new Paint(new Triangle());
		final String triangle = paintTriangle.pic();
		assertThat(correctTriangle, is(triangle));

		final String correctSquare = "****\n*  *\n*  *\n****";
		final Paint paintSquare = new Paint(new Square());
		final String square = paintSquare.pic();
		assertThat(correctSquare, is(square));
	}
}