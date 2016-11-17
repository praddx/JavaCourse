package ru.plahotin;

/**
 * Test for class Point
 * @author Alexander Plakhotin
 *@since 16.11.2016
 */
 
 import org.junit.Test;
 import static org.junit.Assert.assertEquals;
 
 public class TriangleTest {
	 private static final double PRECISION = 0.0001;
	 
	/** 
	 * Test that chexks if the area of the triangle is calculated correctly
	 */
	@Test
	 public void whenAreaThenRightArea() {
		 final Point pointA = new Point(0, 0);
		 final Point pointB = new Point(4, 0);
		 final Point pointC = new Point(0, 4);
		 final Triangle triangle = new Triangle(pointA, pointB, pointC); 
		 final double area = triangle.area();
		 assertEquals(1.0/2.0*4.0*4.0, area, PRECISION);
		 
	 }
	 
	 /**
	  * Test that checks if the method "area" defines correctly the possibility of constructing 
	  * triangle with given points
	  */
	 @Test
	 public void whenPointsInLineThenReturnNull() {
		 final Point pointA = new Point(0, 0);
		 final Point pointB = new Point(4, 0);
		 final Point pointC = new Point(6, 0);
		 final Triangle triangle = new Triangle(pointA, pointB, pointC); 
		 final double area = triangle.area();
		 assertEquals(0, area, PRECISION);
		 
	 }
 }