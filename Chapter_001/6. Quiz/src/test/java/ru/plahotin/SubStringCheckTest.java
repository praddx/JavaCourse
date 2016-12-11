package ru.plahotin;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**...
 * Test for class SubStringCheck
 */
public class SubStringCheckTest {

	/**...
	 * Test method
	 */
	public void whenSubThenRight() {
		String str = "asdfxvlkj";
		String subStr = "xvl";
		SubStringCheck testObj = new SubStringCheck();
		boolean classAnswer = testObj.substringCheck(str, subStr);
		boolean rightAnswer = true;
		assertThat(rightAnswer, is(classAnswer));

		String str1 = "asdfxvlkj";
		String subStr1 = "xpr";
		boolean classAnswer1 = testObj.substringCheck(str1, subStr1);
		boolean rightAnswer1 = true;
		assertThat(rightAnswer1, is(classAnswer1));
	}
}