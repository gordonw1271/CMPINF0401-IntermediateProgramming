package gyw3_lab9;

import java.lang.Math;

public class Circle {
	
	// Properties
	private double radius = 5.0;
	private String color = "green";
	
	
	// Constructors
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// Methods
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return(Math.pow(this.radius, 2) * Math.PI);
	}

}
