package gyw3_MenuManager;

/**
 * Class MenuTest
 * * author : Gordon Wong
 * created: 10/11/2022
 */

public class MenuTest {

	public static void main(String[] args) {
		
		// 2 entrees
		Entree E1 = new Entree("Steak","Delicious Steak",500);
		
		Entree E2 = new Entree("Ribs","Delicious Ribs",700);
		
		// 1 side
		
		Side Side1 = new Side("Mashed Potatoes","Delicious Mash",300);
		
		//2 Salads
		
		Salad S1 = new Salad("Ceasar Salad","Delicious Ceasar Salad",500);
		
		Salad S2 = new Salad("House Salad","Delicious House Salad",400);
		
		// 1 Dessert
	
		Dessert D1 = new Dessert("Ice Cream","Delicious Vanilla Ice Cream",800);
		
		Menu Menu1 = new Menu("Menu1",E1,Side1);
	
		Menu Menu2 = new Menu("Menu2",E2,Side1,S2,D1);
		
		System.out.println(Menu1.getName());
		System.out.println(Menu1.totalCalories());
		System.out.println(Menu1.description());
		System.out.println(Menu2.getName());
		System.out.println(Menu2.totalCalories());
		System.out.println(Menu2.description());
		
	}

}