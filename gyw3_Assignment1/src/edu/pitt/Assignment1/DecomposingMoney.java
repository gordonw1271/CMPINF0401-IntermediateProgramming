package edu.pitt.Assignment1;

import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		
		String money = JOptionPane.showInputDialog("Enter an ammount of money from 1 to 9999 dollars: ");
		int m = Integer.parseInt(money);
		int grand = m / 1000;
		int hundreds = (m % 1000)/100;
		int tens = ((m % 1000)%100)/10;
		int ones = ((((m % 1000)%100)%10));
		JOptionPane.showMessageDialog(null, grand + " Grands, " + hundreds + " Benjamins, " + tens + 
				" Sawbucks, " + ones + " Bucks" );
		
	}

}
