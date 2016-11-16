package ru.plahotin;

/** 
 * Class that describes a point in 2d coordinates
 * @author Alexander Plakhotin
 * @since 16.11.2016
 */
 
 public class Point {
	 public double x;
	 public double y;
	
	/**
	 * Constructor that sets x and y coordinates of the point
	 */ 
	 public Point(double x, double y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 /**
	  * Method that calculates the distance between this point and another point
	  * @param point - another point
	  */
	 public double distanceTo(Point point) {
		 double deltaX = this.x - point.x;
		 double deltaY = this.y - point.y;
		 return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	 }
 }