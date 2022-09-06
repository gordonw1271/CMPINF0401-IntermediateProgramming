package edu.pitt.Assignment1;

import javax.swing.JOptionPane;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		
		String number1 = JOptionPane.showInputDialog("Enter the first number: ");
		String number2 = JOptionPane.showInputDialog("Enter the second number: ");
		int one = Integer.parseInt(number1);
		int two = Integer.parseInt(number2);
		double hypotenuse = Math.sqrt((Math.pow(one, 2)+ Math.pow(two, 2)));
		hypotenuse = Math.round(hypotenuse * 100);
		hypotenuse = hypotenuse/100;
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse);

	}

}
