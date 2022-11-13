package gyw3_lab9;

public class Student extends Person{
	
	// Properties
	private String program;
	private int year;
	private double fee;
	
	// Constructors
	public Student(String name,String address, String program,int year, double fee) {
		setName(name);
		setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	// Methods
	// 		getters
	public String getProgram() {
		return this.program;
	}
	public int getYear() {
		return this.year;
	}
	public double getFee() {
		return this.fee;
	}
	//		setters
	public void setProgram(String program) {
		this.program = program;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	// toString Method
	@Override
	public String toString() {
		return("Name: " + getName() + ", Address :" + getAddress() + ", Program: " + getProgram() + ", Year: "+ getYear() + ", Fee: " + getFee());
	}


}
