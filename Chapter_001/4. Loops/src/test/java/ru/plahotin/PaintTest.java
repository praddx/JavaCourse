package ru.plahotin;

/**...
 * Tests method piramid() of class Paint
 * @author Alexander Plakhotin
 * @since 24.11.16
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**...
 * Test class
 */
public class PaintTest {
	/**...
	 * Tests method with height 3
	 */
	@Test
	public void whenHeight3ThenRight() {
		final Paint pyramid = new Paint();
		final String answer = pyramid.piramid(3);
		final String correctStr = "  ^\n ^ ^\n^ ^ ^";
		assertEquals(correctStr, answer);
	}
}