package gyw3_lab7;

import javax.swing.JOptionPane;
import java.util.Random;

public class MainProgram {

	public static void main(String[] args) {
		// asking for user input
		String userInput = JOptionPane.showInputDialog("How many elements in the array? (must be an integer): ");
		int y = Integer.parseInt(userInput);
		
		//creating array with size determined by user
		double[] data = new double[y];
		
		//fill array with randomly generated doubles
		Random rand = new Random();
		for(int i = 0; i < y; i ++) {
			data[i] = rand.nextDouble();
		}
		
		//print out max,min,sum, and average
		System.out.println("max is " + max(data));
		System.out.println("min is " + min(data));
		System.out.println("sum is " + sum(data));
		System.out.println("average is " + ave(data));
		

	}
	public static double max(double[] arr) {
		double i = arr[0];
		for(double element : arr) {
			if(element > i) {
				i = element;
			}
		}
		return i;
	}
	
	public static double min(double[] arr) {
		double i = arr[0];
		for(double element : arr) {
			if(element < i) {
				i = element;
			}
		}
		return i;
	}
	
	public static double sum(double[] arr) {
		double i = 0;
		for(double element : arr) {
			i += element;
		}
		return i;
	}
	
	public static double ave(double[] arr) {
		double i = 0;
		for(double element : arr) {
			i += element;
		}
		i = i/arr.length;
		return i;
	}
	
}
