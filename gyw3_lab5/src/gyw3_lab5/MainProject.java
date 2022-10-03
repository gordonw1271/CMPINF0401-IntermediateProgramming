package gyw3_lab5;

import java.util.Random;
import javax.swing.JOptionPane;

public class MainProject {

	public static void main(String[] args) {
		
		Random random = new Random();
		boolean loop = true;
		
		while(loop == true) {
			String userInput = JOptionPane.showInputDialog("How many times do you want to roll?: ");
			int numOfRolls = Integer.parseInt(userInput);
			Dice.RollDice(numOfRolls, random);
			String userInput2 = JOptionPane.showInputDialog("Type \"yes\" to continue and \"no\" to stop: ");
			if(userInput2.equalsIgnoreCase("no")){
				loop= false;
			}
		}			
	}
}
