package ru.plahotin;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Test for class SubStringCheck
 */
public class SubStringCheckTest {

	/**...
	 * Test method
	 */
	 @Test
	public void whenSubThenRight() {
		String str = "asdfxvlkj";
		String subStr = "xvl";
		SubStringCheck testObj = new SubStringCheck();
		boolean classAnswer = testObj.substringCheck(str, subStr);
		boolean rightAnswer = true;
		assertThat(rightAnswer, is(classAnswer));

		/*String str1 = "asdfxvlkj";
		String subStr1 = "xpr";
		boolean classAnswer1 = testObj.substringCheck(str1, subStr1);
		boolean rightAnswer1 = false;
		assertThat(rightAnswer1, is(classAnswer1));*/
	}
	/**...
	 * Test method
	 */
	 @Test
	public void whenSubThenRight1() {
		String str1 = "asdfxvlkj";
		SubStringCheck testObj1 = new SubStringCheck();
		String subStr1 = "xpr";
		boolean classAnswer1 = testObj1.substringCheck(str1, subStr1);
		boolean rightAnswer1 = false;
		assertThat(rightAnswer1, is(classAnswer1));
	}
}