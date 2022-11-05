package gyw3_MenuManager_v2;

/**
 * Class FileManager
 * author : Gordon Wong
 * created: 11/4/2022
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	/**
	 * Method readEntrees
	 * @param fileName a String
	 * @return ArrLst an Array List of Entrees
	 */
	public static ArrayList<Entree> readEntrees(String fileName) throws FileNotFoundException{
		ArrayList<Entree> arrLst = new ArrayList<Entree>();

		// Reads from entree file and inserts each line into a different element of the same array
		String[] arry = new String[5];

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			for (int lineNo = 1; lineNo < 6; lineNo++) {
				if (lineNo == 1) {
					arry[0] = br.readLine();
				} else if(lineNo == 2){
					arry[1] = br.readLine();
				}else if(lineNo == 3){
					arry[2] = br.readLine();
				}else if(lineNo == 4){
					arry[3] = br.readLine();
				}else if(lineNo == 5){
					arry[4] = br.readLine();
				}else
					br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Create 5 different arrays,split each line from text file based on @@ and each segment from each line to the 5 different arrays with 3 elements
		String[] arr1,arr2,arr3,arr4,arr5 = new String[3];

		arr1 = arry[0].split("@@");
		arr2 = arry[1].split("@@");
		arr3 = arry[2].split("@@");
		arr4 = arry[3].split("@@");
		arr5 = arry[4].split("@@");

		//create entree objects and adds them to the return array list
		Entree obj1 = new Entree(arr1[0],arr1[1],Integer.parseInt(arr1[2]));
		arrLst.add(obj1);
		Entree obj2 = new Entree(arr2[0],arr2[1],Integer.parseInt(arr2[2]));
		arrLst.add(obj2);
		Entree obj3 = new Entree(arr3[0],arr3[1],Integer.parseInt(arr3[2]));
		arrLst.add(obj3);
		Entree obj4 = new Entree(arr4[0],arr4[1],Integer.parseInt(arr4[2]));
		arrLst.add(obj4);
		Entree obj5 = new Entree(arr5[0],arr5[1],Integer.parseInt(arr5[2]));
		arrLst.add(obj5);

		return(arrLst);
	}
	/**
	 * Method readDesserts
	 * @param fileName a String
	 * @return ArrLst an Array List of Desserts
	 */
	public static ArrayList<Dessert> readDesserts(String fileName){
		ArrayList<Dessert> arrLst = new ArrayList<Dessert>();

		// Reads from dessert file and inserts each line into a different element of the same array
		String[] arry = new String[5];

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			for (int lineNo = 1; lineNo < 6; lineNo++) {
				if (lineNo == 1) {
					arry[0] = br.readLine();
				} else if(lineNo == 2){
					arry[1] = br.readLine();
				}else if(lineNo == 3){
					arry[2] = br.readLine();
				}else if(lineNo == 4){
					arry[3] = br.readLine();
				}else if(lineNo == 5){
					arry[4] = br.readLine();
				}else
					br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Create 5 different arrays,split each line based on @@ and assigns them to the arrays
		String[] arr1,arr2,arr3,arr4,arr5 = new String[3];

		arr1 = arry[0].split("@@");
		arr2 = arry[1].split("@@");
		arr3 = arry[2].split("@@");
		arr4 = arry[3].split("@@");
		arr5 = arry[4].split("@@");

		//create dessert and add them to the return array list
		Dessert obj1 = new Dessert(arr1[0],arr1[1],Integer.parseInt(arr1[2]));
		arrLst.add(obj1);
		Dessert obj2 = new Dessert(arr2[0],arr2[1],Integer.parseInt(arr2[2]));
		arrLst.add(obj2);
		Dessert obj3 = new Dessert(arr3[0],arr3[1],Integer.parseInt(arr3[2]));
		arrLst.add(obj3);
		Dessert obj4 = new Dessert(arr4[0],arr4[1],Integer.parseInt(arr4[2]));
		arrLst.add(obj4);
		Dessert obj5 = new Dessert(arr5[0],arr5[1],Integer.parseInt(arr5[2]));
		arrLst.add(obj5);

		return(arrLst);
	}
	/**
	 * Method readSides
	 * @param fileName a String
	 * @return ArrLst an Array List of Sides
	 */
	public static ArrayList<Side> readSides(String fileName){
		ArrayList<Side> arrLst = new ArrayList<Side>();

		// Reads from dessert file and inserts each line into a different element of the same array
		String[] arry = new String[5];

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			for (int lineNo = 1; lineNo < 6; lineNo++) {
				if (lineNo == 1) {
					arry[0] = br.readLine();
				} else if(lineNo == 2){
					arry[1] = br.readLine();
				}else if(lineNo == 3){
					arry[2] = br.readLine();
				}else if(lineNo == 4){
					arry[3] = br.readLine();
				}else if(lineNo == 5){
					arry[4] = br.readLine();
				}else
					br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Create 5 different arrays,split each line based on @@ and assigns them to the arrays
		String[] arr1,arr2,arr3,arr4,arr5 = new String[3];

		arr1 = arry[0].split("@@");
		arr2 = arry[1].split("@@");
		arr3 = arry[2].split("@@");
		arr4 = arry[3].split("@@");
		arr5 = arry[4].split("@@");

		//create side and add them to the return array list
		Side obj1 = new Side(arr1[0],arr1[1],Integer.parseInt(arr1[2]));
		arrLst.add(obj1);
		Side obj2 = new Side(arr2[0],arr2[1],Integer.parseInt(arr2[2]));
		arrLst.add(obj2);
		Side obj3 = new Side(arr3[0],arr3[1],Integer.parseInt(arr3[2]));
		arrLst.add(obj3);
		Side obj4 = new Side(arr4[0],arr4[1],Integer.parseInt(arr4[2]));
		arrLst.add(obj4);
		Side obj5 = new Side(arr5[0],arr5[1],Integer.parseInt(arr5[2]));
		arrLst.add(obj5);

		return(arrLst);
	}
	/**
	 * Method readSalads
	 * @param fileName a String
	 * @return ArrLst an Array List of Salads
	 */
	public static ArrayList<Salad> readSalads(String fileName){
		ArrayList<Salad> arrLst = new ArrayList<Salad>();

		// Reads from Salad file and inserts each line into a different element of the same array
		String[] Arry = new String[5];

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			for (int lineNo = 1; lineNo < 6; lineNo++) {
				if (lineNo == 1) {
					Arry[0] = br.readLine();
				} else if(lineNo == 2){
					Arry[1] = br.readLine();
				}else if(lineNo == 3){
					Arry[2] = br.readLine();
				}else if(lineNo == 4){
					Arry[3] = br.readLine();
				}else if(lineNo == 5){
					Arry[4] = br.readLine();
				}else
					br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Create 5 different arrays,split each line based on @@ and assigns them to the arrays
		String[] arr1,arr2,arr3,arr4,arr5 = new String[3];

		arr1 = Arry[0].split("@@");
		arr2 = Arry[1].split("@@");
		arr3 = Arry[2].split("@@");
		arr4 = Arry[3].split("@@");
		arr5 = Arry[4].split("@@");

		//create salad object and add them to the return array list
		Salad obj1 = new Salad(arr1[0],arr1[1],Integer.parseInt(arr1[2]));
		arrLst.add(obj1);
		Salad obj2 = new Salad(arr2[0],arr2[1],Integer.parseInt(arr2[2]));
		arrLst.add(obj2);
		Salad obj3 = new Salad(arr3[0],arr3[1],Integer.parseInt(arr3[2]));
		arrLst.add(obj3);
		Salad obj4 = new Salad(arr4[0],arr4[1],Integer.parseInt(arr4[2]));
		arrLst.add(obj4);
		Salad obj5 = new Salad(arr5[0],arr5[1],Integer.parseInt(arr5[2]));
		arrLst.add(obj5);

		return(arrLst);
	}


}
