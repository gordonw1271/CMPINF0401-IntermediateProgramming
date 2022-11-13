package gyw3_lab9;

public class Staff extends Person{
	// Properties
	private String school;
	private double pay;
	
	// Constructors
	public Staff(String name,String address,double pay) {
		setName(name);
		setAddress(address);
		this.pay = pay;
	}
	
	// Methods
	public String getSchool() {
		return this.school;
	}
	public double getPay() {
		return this.pay;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return("Name: " + getName() + ", Address :" + getAddress() + ", School: " + getSchool() + ", Pay: "+ getPay());
	}

}
