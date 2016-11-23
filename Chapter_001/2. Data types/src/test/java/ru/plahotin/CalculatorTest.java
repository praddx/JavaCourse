package ru.plahotin;

/** Calculator Test...
 * @author Alexander Plakhotin
 * @since 15.11.2016
 */

 import org.junit.Test;
 import static org.junit.Assert.assertEquals;

 /**...
  * Test
  */
 public class CalculatorTest {
	 /**...
  * PRECISION for method assertEquals
  */
	private static final double PRECISION = 0.0001;

	/** Test method addition() with parameters 1 and 1...
	 */
	@Test
	public void whenAdditionThenResultIsRight() {
		final Calculator calc = new Calculator();
		calc.addition(1, 1);
		final double res = calc.result;
		assertEquals(2d, res, PRECISION);
	}

	/** Test method subtract() with parameters 53.4 and 27.1...
	 */
	@Test
	public void whenSubtractionThenResultIsRigth() {
		final Calculator calc = new Calculator();
		calc.subtract(53.4, 27.1);
		final double res = calc.result;
		assertEquals(26.3d, res, PRECISION);
	}

	/** Test method multiplicate() with parameters 2 and 8...
	 */
	@Test
	public void whenMultiplicationThenResultIsRigth() {
		final Calculator calc = new Calculator();
		calc.multiplicate(2, 8);
		final double res = calc.result;
		assertEquals(16d, res, PRECISION);
	}

	/** Test method division() with parameters 9 and 2...
	 */
	@Test
	public void whenDivisionThenResultIsRigth() {
		final Calculator calc = new Calculator();
		calc.division(9, 2);
		final double res = calc.result;
		assertEquals(4.5d, res, PRECISION);
	}
 }