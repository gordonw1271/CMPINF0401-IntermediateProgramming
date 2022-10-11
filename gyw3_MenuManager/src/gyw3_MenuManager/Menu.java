package gyw3_MenuManager;

public class Menu {
	private String name;
	private Entree entree = new Entree();
	private Salad salad = new Salad();
	private Side side = new Side();
	private Dessert dessert = new Dessert();
	
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
		return(entree.getCal() + salad.getCal() + side.getCal() + dessert.getCal());
	}
	
	public void description() {
		if(entree.getDescription() == null) {
			System.out.println("Entree: N/A");
		}else {
			System.out.println("Entree: " + entree.getDescription());
		}
		if(side.getDescription() == null) {
			System.out.println("Side: N/A");
		}else {
			System.out.println("Side: " + side.getDescription());
		}
		if(salad.getDescription() == null) {
			System.out.println("Salad: N/A");
		}else {
			System.out.println("Salad: " + salad.getDescription());
		}
		if(dessert.getDescription() == null) {
			System.out.println("Dessert: N/A");
		}else {
			System.out.println("Dessert: " + dessert.getDescription());
		}

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

}
