package gyw3_MenuManager_v3;

/** Class Menu
*   author : Gordon Wong
*   created: 11/4/2022
*/


public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
//Constructors
	
	public Menu(String name) {
		this.name = name;
	}
	
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
// Methods
	
	public int totalCalories() {
		int total = 0;
		if(this.salad != null) {
			total += salad.getCal();;
		}
		if(this.entree != null) {
			total += entree.getCal();;
		}
		if(this.side != null) {
			total += side.getCal();;
		}
		if(this.dessert != null) {
			total += dessert.getCal();;
		}
		
		return(total);
	}
	
	public String description() {
		String d = "";
		
		if(this.entree == null) {
			d = d + "Entree: N/A";
		}else {
			d = d + "Entree: " + entree.getDescription();
		}
		if(this.side == null) {
			d = d + "\nSide: N/A";
		}else {
			d = d + "\nSide: " + side.getDescription();
		}
		if(this.salad == null) {
			d = d +"\nSalad: N/A";
		}else {
			d = d +"\nSalad: " + salad.getDescription();
		}
		if(this.dessert == null) {
			d = d + "\nDessert: N/A";
		}else {
			d = d +"\nDessert: " + dessert.getDescription();
		}
		
		return d;

	}
	
// Setters
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	
	public void setSide(Side side) {
		this.side = side;
	}
	
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
		
	}
//Getters 
	public String getName() {
		return(name);
	}
	
	public Entree getEntree() {
		return(entree);
	}
	
	public Side getSide() {
		return(side);
	}
	
	public Salad getSalad() {
		return(salad);
	}
	
	public Dessert getDessert() {
		return(dessert);
	}
	@Override
	public String toString() {
		return this.name;
	}

}