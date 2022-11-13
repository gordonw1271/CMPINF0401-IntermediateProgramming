package gyw3_lab9;

abstract public class Person {
	
	// Properties
	private String name;
	private String address = "String";
	
	// Methods
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}

}
