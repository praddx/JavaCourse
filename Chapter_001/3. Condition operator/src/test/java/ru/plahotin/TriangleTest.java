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
	 
	 @Test
	 public void whenSecondPointThenRightDistance() {
		 final Point pointA = new Point(0, 0);
		 final Point pointB = new Point(4, 0);
		 final Point pointC = new Point(0, 4);
		 final Triangle triangle = new Triangle(pointA, pointB, pointC); 
		 final double area = triangle.area();
		 assertEquals(1.0/2.0*4.0*4.0, area, PRECISION);
		 
	 }
	 
	
 }