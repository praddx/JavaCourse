package ru.plahotin;

/**...
 * Test that check method sdd() in class "Counter"
 * @author Alexander Plakhotin
 * @since 18.11.16
 */

 import org.junit.Test;
 import static org.junit.Assert.assertThat;
 import static org.hamcrest.core.Is.is;

 /**...
 * Test
 */
 public class CounterTest {

	 /**...
	  * Test that checks that method add() returns 110 when get 2 and 20
	  */
	 @Test
	 public void whenTwoAndTwentyThen110() {
		 final Counter counter = new Counter();
		 final int answer = counter.add(2, 20);
		 assertThat(answer, is(110));
	 }

	 /**...
	  * Test that checks that method add() returns 108 when get -2 and 20
	  */
	 @Test
	 public void whenTwoAndTwentyThen108() {
		 final Counter counter = new Counter();
		 final int answer = counter.add(2, 20);
		 assertThat(answer, is(110));
	 }
 }