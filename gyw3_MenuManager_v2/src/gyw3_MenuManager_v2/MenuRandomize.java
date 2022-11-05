package gyw3_MenuManager_v2;

/** Class MenuRandomize
 *  author : Gordon Wong
 *  created: 11/4/2022
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	//properties
	private ArrayList<Entree> entrees;
	private ArrayList<Dessert> desserts;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;

	//constructor
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		try {
			this.entrees = FileManager.readEntrees(entreeFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.sides = FileManager.readSides(sideFile);
		this.salads = FileManager.readSalads(saladFile);
		this.desserts = FileManager.readDesserts(dessertFile);
	}

	/**
	 * Method randomMenu
	 * @return a Menu Object
	 */
	public Menu randomMenu() {
		Random r = new Random();
		int random1 =  r.nextInt((4 - 0) + 1) + 0;
		int random2 =  r.nextInt((4 - 0) + 1) + 0;
		int random3 =  r.nextInt((4 - 0) + 1) + 0;
		int random4 =  r.nextInt((4 - 0) + 1) + 0;
		Menu m = new Menu("Menu", entrees.get(random1),sides.get(random2), salads.get(random3), desserts.get(random4));
		return(m);
	}


}
