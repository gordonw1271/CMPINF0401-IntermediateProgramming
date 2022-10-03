package gyw3_lab5;

import java.util.Random;

public class Dice {
	
	public static void RollDice(int times, Random x) {
		
		double times2 = times;
		int ind = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0 ;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		
		while(ind < times) {
			
			int random1 = x.nextInt(6)+1;
			int random2 = x.nextInt(6)+1;
			int random3 = random1 +random2;
			
			if(random3 == 2) {
				two ++;
			}else if(random3 == 3) {
				three ++;
			}else if(random3 == 4) {
				four ++;
			}else if(random3 == 5) {
				five ++;
			}else if(random3 == 6) {
				six ++;
			}else if(random3 == 7) {
				seven ++;
			}else if(random3 == 8) {
				eight ++;
			}else if(random3 == 9) {
				nine ++;
			}else if(random3 == 10) {
				ten ++;
			}else if(random3 == 11) {
				eleven ++;
			}else if(random3 == 12) {
				twelve ++;
			}	
			ind ++;
		}
		
		System.out.println("2 was rolled " + two + "/" +times + " times which is " + two/times2 + "%");
		System.out.println("3 was rolled " + three + "/" +times + " times which is " + three/times2 + "%");
		System.out.println("4 was rolled " + four + "/" +times + " times which is " + four/times2 + "%");
		System.out.println("5 was rolled " + five + "/" +times + " times which is " + five/times2 + "%");
		System.out.println("6 was rolled " + six + "/" +times + " times which is " + six/times2 + "%");
		System.out.println("7 was rolled " + seven + "/" +times + " times which is " + seven/times2 + "%");
		System.out.println("8 was rolled " + eight + "/" +times + " times which is " + eight/times2 + "%");
		System.out.println("9 was rolled " + nine + "/" +times + " times which is " + nine/times2 + "%");
		System.out.println("10 was rolled " + ten + "/" +times + " times which is " + ten/times2 + "%");
		System.out.println("11 was rolled " + eleven + "/" +times + " times which is " + eleven/times2 + "%");
		System.out.println("12 was rolled " + twelve + "/" +times + " times which is " + twelve/times2 + "%");
		
	}

}
