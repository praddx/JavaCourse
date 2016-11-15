package ru.plahotin;

/**
 * Calculator program
 * @author Alexander Plakhotin 
 * @since 15.11.2016
 * @virsion 1.0
  */
  
  public class Calculator {
	
	public double result;
	
	/**
	 * Method calculates addition of two numbers that it gets as parameters
	 * and saves result of the operation into the "result" variable of class "Calculator"
	 * @param first, second - numbers that will be added up
	 */
	public void addition(double first, double second) {
			this.result = first + second;
	}
	
	/**
	 * Method calculates subtraction of two numbers that it gets as parameters
	 * and saves result of the operation into the "result" variable of class "Calculator"
	 * @param first, second - numbers that will be subtracted
	 */
	public void subtract(double first, double second) {
			this.result = first - second;
	}
	
	/**
	 * Method calculates multiplication of two numbers that it gets as parameters
	 * and saves result of the operation into the "result" variable of class "Calculator"
	 * @param first, second - numbers that will be multiplicated
	 */
	public void multiplicate(double first, double second) {
			this.result = first * second;
	}
	
	/**
	 * Method calculates division of two numbers that it gets as parameters
	 * and saves result of the operation into the "result" variable of class "Calculator"
	 * @param first, second - numbers that will be devided
	 */
	public void division(double first, double second) {
			this.result = first / second;
	}
	
}