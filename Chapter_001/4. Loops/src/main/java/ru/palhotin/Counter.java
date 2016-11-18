package ru.plahotin;

/** 
 * Class "Counter" contains method that calculates sum of all even numbers in a given interval
 * @author Alexander Plakhotin
 * @since 18/.11.16
 */
 
 public class Counter {
		
		/**
		 *Method that takes 2 numbers and calculates the sum of all even numbers between them
		 *@param start - first number
		 *@param finish - last number
		* @return sum - the sum of even numbers
		*/
		public int add(int start, int finish) {
				int sum = 0;
				for(int i = start; i <= finish; i++) {
				if (i % 2 == 0)
						sum += i;
		}
		return sum;
		}
 }