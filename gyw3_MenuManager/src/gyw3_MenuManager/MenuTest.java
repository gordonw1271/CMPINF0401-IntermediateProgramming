package gyw3_MenuManager;

public class MenuTest {

	public static void main(String[] args) {
		Entree E1 = new Entree("Steak","Delicious Steak",500);
		
		Entree E2 = new Entree("Ribs","Delicious Ribs",700);
		
		Side Side1 = new Side("Mashed Potatoes","DElicious Mash",300);
		
		Salad S1 = new Salad();
		S1.setName("Ceasar Salad");
		S1.setDescription("Delicious Ceasar Salad");
		S1.setCal(500);
		
		Salad S2 = new Salad();
		S2.setName("House Salad");
		S2.setDescription("Delicious House Salad");
		S2.setCal(400);
		
		Dessert D1 = new Dessert();
		D1.setName("Ice Cream");
		D1.setDescription("Delicious Vanilla Ice Cream");
		D1.setCal(450);
		
		Menu Menu1 = new Menu("Menu1");
		Menu1.setEntree(E1);
		Menu1.setSalad(S1);
		
		Menu Menu2 = new Menu("Menu2",E2,Side1,S2,D1);
		
		Menu1.description();
		System.out.println(Menu2.totalCalories());
		
		
	}

}
