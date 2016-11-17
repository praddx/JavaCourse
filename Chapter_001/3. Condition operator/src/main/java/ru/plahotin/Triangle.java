package ru.plahotin;

/** Class that represents triangle with apexes in points a, b, c 
 * and that can calculate its area
 * @author Alexander Plakhotin
 * @since 17.11.2016
 */ 
 public class Triangle {
	 
	 public Point a;
	 public Point b;
	 public Point c;
	 
	 /** 
	  * Constructor that sets points for each apex of the triangle
	  */
	 public Triangle (Point a, Point b, Point c) {
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	 
	 /**
	  * Method that calculates area of the triangle if the triangle can be constructed 
	  * with given points
	  */
	 public double area() {
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = (ab + ac + bc) / 2;
		if (ab + ac > bc) {
			return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
		} else {
			return 0;
		}
	 }
	 
 }
 