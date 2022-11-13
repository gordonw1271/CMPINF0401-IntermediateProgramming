package gyw3_lab9;

public class Cylinder extends Circle {
	// Properties
	private double height = 1;
	
	// Constructors
	public Cylinder() {
		super();
	}
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height = height;
	}
	
	// Methods
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return(getArea() * this.height);
	}
	

}
