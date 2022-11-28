package gyw3_MenuManager_v3;

import java.util.ArrayList;

/** Class MenuTest
 *  author : Gordon Wong
 *  created: 11/28/2022
 */
public class MenuTester {

	public static void main(String[] args) {
		// entrees
		Entree E1 = new Entree("Steak","Delicious Steak",500,900);
		Entree E2 = new Entree("Ribs","Delicious Ribs",700,787);
		// side
		Side Side1 = new Side("Mashed Potatoes","Delicious Mash",300,787);
		// Salads
		Salad S1 = new Salad("Ceasar Salad","Delicious Ceasar Salad",500,563);
		Salad S2 = new Salad("House Salad","Delicious House Salad",400,567);
		// Dessert
		Dessert D1 = new Dessert("Ice Cream","Delicious Vanilla Ice Cream",800,234);
		//Menus
		Menu Menu1 = new Menu("Menu1",E1,Side1,S1,D1);
		Menu Menu2 = new Menu("Menu2",E2,Side1,S2,D1);
		///////////////////////////////////////////////////////////////////////////
		//readItems Test
		ArrayList<MenuItem> x = FileManager.readItems("data/dishes.txt");
		System.out.println(x.get(2) instanceof Entree);
		System.out.println(x.get(5) instanceof Side);
		System.out.println(x.get(7) instanceof Salad);
		System.out.println(x.get(13) instanceof Dessert);
		//writeMenus Test
		ArrayList<Menu> y = new ArrayList<Menu>();
		y.add(Menu1);
		y.add(Menu2);
		FileManager.writeMenus("data/writeMenusTest.txt",y);
		//MenuManager Constructor Test
		MenuManager g = new MenuManager("data/dishes.txt");
		System.out.println(g.getSaladArray().get(1));
		//randomMenu Test
		Menu o = g.randomMenu("menu99");
		System.out.println(o.getEntree());
		System.out.println(o.getSide());
		System.out.println(o.getName());
		//minCaloriesMenu Test
		System.out.println(g.minCaloriesMenu("MinCal").totalCalories());
		System.out.println(g.minCaloriesMenu("MinCal").getEntree());
		//maxCaloriesMenu Test
		System.out.println(g.maxCaloriesMenu("MaxCal").totalCalories());
		System.out.println(g.maxCaloriesMenu("MaxCal").getSalad());
	}

}