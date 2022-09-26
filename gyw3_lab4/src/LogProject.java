import javax.swing.JOptionPane;

public class LogProject {

	public static void main(String[] args) {
		
		// asking user for base input
		String userInputB = JOptionPane.showInputDialog("Enter an integer value base for the log: ");
		int base = Integer.parseInt(userInputB);
		if(base <= 1 ) {
			while (base <= 1) {
			userInputB = JOptionPane.showInputDialog("Base must be greater than one, Enter another integer value base: ");
			base = Integer.parseInt(userInputB);
			}
		}
		// asking user for base input
		String userInputX = JOptionPane.showInputDialog("Enter an integer value X for the log: ");
		int x = Integer.parseInt(userInputX);
		if(x <= 0 ) {
			while (x <= 0) {
			userInputX = JOptionPane.showInputDialog("X must be greater than zero, Enter another integer value for X: ");
			x = Integer.parseInt(userInputX);
			}
				}
		
		//calculating answer
		int answer = 0;
		//create new variable for x so that I can display original x in output
		int y = x;
		while(x>=base) {
			x = x/base;
			answer ++;
		}
		
		System.out.println("The logarithm with base " + base + " of " + y + " is " + answer);

	}

}
