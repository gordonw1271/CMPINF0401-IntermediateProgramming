package gyw3_MenuManager_v3;

/** Class MenuManager
 *   author : Gordon Wong
 *   created: 11/28/2022
 */

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	//properties
	private ArrayList<Entree> entrees;
	private ArrayList<Dessert> desserts;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	
	/**
	 * Constructor
	 * @param dishesFile a String for the name of a text file
	 */
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> arry = FileManager.readItems(dishesFile);
		ArrayList<Entree> e = new ArrayList<Entree>();
		ArrayList<Dessert> d = new ArrayList<Dessert>();
		ArrayList<Side> s = new ArrayList<Side>();
		ArrayList<Salad> sa = new ArrayList<Salad>();
		for(int i =0;i < arry.size();i++) {
			if(arry.get(i) instanceof Entree) {
				e.add(new Entree(arry.get(i).getName(),arry.get(i).getDescription(),arry.get(i).getCal(),arry.get(i).getPrice()));
			}else if(arry.get(i) instanceof Salad) {
				sa.add(new Salad(arry.get(i).getName(),arry.get(i).getDescription(),arry.get(i).getCal(),arry.get(i).getPrice()));
			}else if(arry.get(i) instanceof Side) {
				s.add(new Side(arry.get(i).getName(),arry.get(i).getDescription(),arry.get(i).getCal(),arry.get(i).getPrice()));
			}else if(arry.get(i) instanceof Dessert) {
				d.add(new Dessert(arry.get(i).getName(),arry.get(i).getDescription(),arry.get(i).getCal(),arry.get(i).getPrice()));
			}
		}
		this.entrees = e;
		this.desserts = d;
		this.salads = sa;
		this.sides = s;

	}
	//getters
	public ArrayList<Entree> getEntreeArray(){
		return this.entrees;
	}
	public ArrayList<Dessert> getDessertArray(){
		return this.desserts;
	}
	public ArrayList<Side> getSideArray(){
		return this.sides;
	}
	public ArrayList<Salad> getSaladArray(){
		return this.salads;
	}
	//setters
	public void setEntreeArray(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}
	public void setDessertArray(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
	public void setSideArray(ArrayList<Side> sides) {
		this.sides = sides;
	}
	public void setSaladArray(ArrayList<Salad> salads) {
		this.salads = salads;
	}
	/**
	 * Method randomMenu
	 * @param name a name for the menu output
	 * @return a menu object
	 */
	public Menu randomMenu(String name) {
		Random r = new Random();
		int random1 =  r.nextInt((entrees.size()));
		int random2 =  r.nextInt((sides.size()));
		int random3 =  r.nextInt((salads.size()));
		int random4 =  r.nextInt((desserts.size()));
		Menu M = new Menu(name, entrees.get(random1),sides.get(random2), salads.get(random3), desserts.get(random4));
		return M;
	}
	/**
	 * Method minCaloriesMenu
	 * @param name a name for the menu output
	 * @return a menu object
	 */
	public Menu minCaloriesMenu(String name) {
		Entree minE = this.entrees.get(0);
		Dessert minD = this.desserts.get(0);
		Side minS = this.sides.get(0);
		Salad minSa = this.salads.get(0);

		for(int i = 1;i < this.entrees.size();i++) {
			if(this.entrees.get(i).getCal() < minE.getCal()){
				minE = entrees.get(i);
			}
		}
		for(int i = 1;i < this.sides.size();i++) {
			if(this.sides.get(i).getCal() < minS.getCal()){
				minS = sides.get(i);
			}
		}
		for(int i = 1;i < this.salads.size();i++) {
			if(this.salads.get(i).getCal() < minSa.getCal()){
				minSa = salads.get(i);
			}
		}
		for(int i = 1;i < this.desserts.size();i++) {
			if(this.desserts.get(i).getCal() < minD.getCal()){
				minD = desserts.get(i);
			}
		}
		Menu m = new Menu(name,minE,minS,minSa,minD);
		return m;
	}
	/**
	 * Method maxCaloriesMenu
	 * @param name a name for the menu output
	 * @return a menu object
	 */
	public Menu maxCaloriesMenu(String name) {
		Entree maxE = this.entrees.get(0);
		Dessert maxD = this.desserts.get(0);
		Side maxS = this.sides.get(0);
		Salad maxSa = this.salads.get(0);

		for(int i = 1;i < this.entrees.size();i++) {
			if(this.entrees.get(i).getCal() > maxE.getCal()){
				maxE = entrees.get(i);
			}
		}
		for(int i = 1;i < this.sides.size();i++) {
			if(this.sides.get(i).getCal() > maxS.getCal()){
				maxS = sides.get(i);
			}
		}
		for(int i = 1;i < this.salads.size();i++) {
			if(this.salads.get(i).getCal() > maxSa.getCal()){
				maxSa = salads.get(i);
			}
		}
		for(int i = 1;i < this.desserts.size();i++) {
			if(this.desserts.get(i).getCal() > maxD.getCal()){
				maxD = desserts.get(i);
			}
		}
		Menu m = new Menu(name,maxE,maxS,maxSa,maxD);
		return m;
	}
}
