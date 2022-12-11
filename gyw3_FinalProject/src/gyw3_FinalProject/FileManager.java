package gyw3_FinalProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FileManager
 * author : Gordon Wong
 * created: 12/11/2022
 */
public class FileManager {
	/**
	 * Method readItems
	 * @param fileName a String file name
	 * @return array list of menu items
	 */
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> arrLst = new ArrayList<MenuItem>();
		ArrayList<String[]> arrLst1 = new ArrayList<String[]>();

		//read through each line, split each line by @@ into an array and each array is then stored in a array list
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				arrLst1.add(line.split("@@"));
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//checks whether element is entree,salad, side or dessert and creates the appropriate
		//object and adds it to the output array list
		for(int i = 0;i < arrLst1.size(); i++) {
			if(arrLst1.get(i)[1].equalsIgnoreCase("entree")) {
				arrLst.add(new Entree(arrLst1.get(i)[0],arrLst1.get(i)[2],Integer.parseInt(arrLst1.get(i)[3]),Double.parseDouble(arrLst1.get(i)[4])));
			}else if(arrLst1.get(i)[1].equalsIgnoreCase("side")) {
				arrLst.add(new Side(arrLst1.get(i)[0],arrLst1.get(i)[2],Integer.parseInt(arrLst1.get(i)[3]),Double.parseDouble(arrLst1.get(i)[4])));
			}else if(arrLst1.get(i)[1].equalsIgnoreCase("salad")) {
				arrLst.add(new Salad(arrLst1.get(i)[0],arrLst1.get(i)[2],Integer.parseInt(arrLst1.get(i)[3]),Double.parseDouble(arrLst1.get(i)[4])));
			}else if(arrLst1.get(i)[1].equalsIgnoreCase("dessert")) {
				arrLst.add(new Dessert(arrLst1.get(i)[0],arrLst1.get(i)[2],Integer.parseInt(arrLst1.get(i)[3]),Double.parseDouble(arrLst1.get(i)[4])));
			}
		}
		return arrLst;
	}
	/**
	 * Method writeMenus
	 * @param fileName a String file name
	 * @param menus an array list of menus
	 */
	public static void writeMenus(String filename,ArrayList<Menu> menus) {

		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0;i<menus.size();i++) {
				bw.write(menus.get(i).getName());
				bw.write("\n");
				bw.write("Entree: "+menus.get(i).getEntree().getName()+": "+menus.get(i).getEntree().getDescription()+", Calories: "+menus.get(i).getEntree().getCal()+", Price: "+menus.get(i).getEntree().getPrice());
				bw.write("\n");
				bw.write("Salad: "+menus.get(i).getSalad().getName()+": "+menus.get(i).getSalad().getDescription()+", Calories: "+menus.get(i).getSalad().getCal()+", Price: "+menus.get(i).getSalad().getPrice());
				bw.write("\n");
				bw.write("Side: "+menus.get(i).getSide().getName()+": "+menus.get(i).getSide().getDescription()+", Calories: "+menus.get(i).getSide().getCal()+", Price: "+menus.get(i).getSide().getPrice());
				bw.write("\n");
				bw.write("Dessert: "+menus.get(i).getDessert().getName()+": "+menus.get(i).getDessert().getDescription()+", Calories: "+menus.get(i).getDessert().getCal()+", Price: "+menus.get(i).getDessert().getPrice());
				bw.write("\n");
				bw.write("Total Calories: "+menus.get(i).totalCalories());
				bw.write("\n");
				double tp = menus.get(i).getEntree().getPrice() + menus.get(i).getSalad().getPrice() + menus.get(i).getSide().getPrice()+ menus.get(i).getDessert().getPrice();
				bw.write("Total Price: "+ tp);
				bw.write("\n\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}