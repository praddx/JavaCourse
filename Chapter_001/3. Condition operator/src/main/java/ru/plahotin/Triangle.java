package ru.plahotin;

/** Class that represents triangle with apexes in points a, b, c 
 * and that can calculate its area
 * @author Alexander Plakhotin
 * @since 16.11.2016
 */
 
 public class Triangle {
	 
	 public Point a;
	 public Point b;
	 public Point c;
	 
	 
	 public Triangle (Point a, Point b, Point c) {
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	 
	 /**
	  * Method that calculates area of the triangle
	  */
	 public double area() {
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = (ab + ac + bc) / 2;
		
		return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
	 }
 }
 