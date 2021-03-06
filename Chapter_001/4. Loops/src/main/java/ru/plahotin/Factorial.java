package ru.plahotin;

/**...
 * Class with method thad calculates factorial
 * @author Alexander Plakhotin
 * @since 18.11.16
 */

 public class Factorial {

	 /**...
	  * Method that calculates factorial
	  * @param number - number to calculate factorial
	  * @return factorial - factorial of the number
	  */
	 public int factorial(int number) {
		 int factorial = 1;
		 for (int i = 1; i <= number; i++) {
			 factorial *= i;
		 }
		 return factorial;
	 }
 }