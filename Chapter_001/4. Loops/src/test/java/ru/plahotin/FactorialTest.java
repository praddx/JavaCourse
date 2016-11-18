package ru.plahotin;

/**
 * Test that checks if method factorial() calculates factorial correctly
 * @author Alexander Plakhotin
 * @since 18.11.16
 */
 
 import org.junit.Test;
 import static org.junit.Assert.assertThat;
 import static org.hamcrest.core.Is.is;
 
 public class FactorialTest {
	 
	 @Test
	 public void whenFourThen24() {
		 final Factorial facObj = new Factorial();
		 final int answer = facObj.factorial(4);
		 assertThat(answer, is(24));
		 
	 }
 }