package edu.pitt.Assignment1;

import javax.swing.JOptionPane;

public class AreaAndPermimeter {

	public static void main(String[] args) {
		
		String radius = JOptionPane.showInputDialog("Enter the radius: ");
		double r = Double.parseDouble(radius);
		double perimeter = 2 * Math.PI * r;
		double area = Math.pow(r,2) * Math.PI;
		perimeter = Math.round(perimeter * 100);
		perimeter = perimeter/100;
		area = Math.round(area * 100);
		area = area/100;
		JOptionPane.showMessageDialog(null, "The circle with radius " + r +" has an area of " 
		+ area +" and a perimeter of " + perimeter);

	}

}
