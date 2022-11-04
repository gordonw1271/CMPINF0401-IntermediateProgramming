package gyw3_MenuManager_v2;

/*
 * Class MenuRandomize
 * * author : Gordon Wong
 * created: 11/4/2022
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	//properties
	private ArrayList<Entree> entreeArry;
	private ArrayList<Dessert> dessertArry;
	private ArrayList<Side> sideArry;
	private ArrayList<Salad> saladArry;

	//constructor
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		try {
			this.entreeArry = FileManager.readEntrees(entreeFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.sideArry = FileManager.readSides(sideFile);
		this.saladArry = FileManager.readSalads(saladFile);
		this.dessertArry = FileManager.readDesserts(dessertFile);
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
		Menu M = new Menu("Menu", entreeArry.get(random1),sideArry.get(random2), saladArry.get(random3), dessertArry.get(random4));
		return(M);
	}


}
