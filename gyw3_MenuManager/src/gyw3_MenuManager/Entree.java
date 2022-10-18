package gyw3_MenuManager;

/**
 * Class Entree
 * * author : Gordon Wong
 * created: 10/11/2022
 */

public class Entree {
	private String name;
	private String description;
	private int calories;

// Constructors
	
	public Entree(String name, String desc, int cal) {
		this.name = name;
		description = desc;
		calories = cal;	
	}

// Getters 
	
	public int getCal() {
		return calories;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

// Setters
	
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