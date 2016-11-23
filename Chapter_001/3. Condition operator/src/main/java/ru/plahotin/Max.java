package ru.plahotin;

/**...
 * Класс содержит методы для определения наибольшего из переданных чисел
 * @author Alexander Plakhotin
 * @since 17.11.16
 */

 public class Max {

	 /**...
	  * Метод вычисляет наибольшее из двух чисел
	  * @param first - первое число
	  * @param second - второе число
	  * @return max - максимальное из двух чисел
	  */
	 public int max(int first, int second) {
		 int max = first;
		 if (max < second) {
			 max = second;
		 }
		 return max;
	 }

	 /**...
	  * Метод вычисляет наибольшее из трех чисел
	  * @param first - первое число
	  * @param second - второе число
	  * @param third - третье число
	  * @return max - максимальное из трех чисел
	  */
	 public int max(int first, int second, int third) {
		 return max(max(first, second), third);
	 }
 }