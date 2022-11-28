package gyw3_MenuManager_v3;

public class MenuItem {
// Properties
	private String name;
	private String description;
	private int calories;
	private double price;
	
	//Constructor
	public MenuItem(String name,String description,int calories,double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}
	//Getters
	public int getCal() {
		return calories;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return this.name;
	}
	//Setters
	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	public void setCal(int newCal) {
		this.calories = newCal;
	}
}
