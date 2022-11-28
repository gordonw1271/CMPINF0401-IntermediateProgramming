package gyw3_MenuManager_v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FileManager
 * author : Gordon Wong
 * created: 11/4/2022
 */

public class FileManager {
	
	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> arrLst = new ArrayList<MenuItem>();
		ArrayList<String[]> arrLst1 = new ArrayList<String[]>();
		ArrayList<String[]> entrees = new ArrayList<String[]>();
		ArrayList<String[]> desserts = new ArrayList<String[]>();
		ArrayList<String[]> salads = new ArrayList<String[]>();
		ArrayList<String[]> sides = new ArrayList<String[]>();
		
		//read through each line, split each line by @@ into an array and each array is stored in a array list
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
		//seperates each array in arrLst1 into entree,side,salad,and dessert array lists
		int index = arrLst1.size();
		for(int i = 0;i < index; i++) {
			if(arrLst1.get(i)[1].equals("entree")) {
				entrees.add(arrLst1.get(i));
			}else if(arrLst1.get(i)[1].equals("side")) {
				sides.add(arrLst1.get(i));
			}else if(arrLst1.get(i)[1].equals("salad")) {
				salads.add(arrLst1.get(i));
			}else if(arrLst1.get(i)[1].equals("dessert")) {
				desserts.add(arrLst1.get(i));
			}
		}
		//

		System.out.println(entrees.get(0)[0]);
		return arrLst;
	}
}