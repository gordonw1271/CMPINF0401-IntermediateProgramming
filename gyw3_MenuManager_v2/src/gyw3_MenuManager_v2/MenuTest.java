package gyw3_MenuManager_v2;

/*
 * Class MenuTest
 * * author : Gordon Wong
 * created: 11/4/2022
 */

public class MenuTest {

	public static void main(String[] args) {

		MenuRandomize randomize = new MenuRandomize("data/entrees.txt","data/sides.txt","data/salads.txt","data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories: "+myMenu.totalCalories());

	}

}