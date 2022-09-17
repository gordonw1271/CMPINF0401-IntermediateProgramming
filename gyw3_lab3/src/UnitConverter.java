import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		// asking user for input
		String userInput = JOptionPane.showInputDialog("Enter distance or weight ammount: ");
		String num = "";
		String unit = "";
		
		// Find the position of the space in input
		Integer ind = userInput.indexOf(" ");
		
		
		//For loop to add numbers to string num and then convert to double
		for(int j = 0; j<ind;j++) {
			num = num + userInput.charAt(j);
		}
		double number = Double.parseDouble(num);
		
		//For loop to add units to string unit
		for(int x = ind + 1; x < userInput.length();x ++) {
			unit = unit + userInput.charAt(x);
		}
		
		//if statement to convert values and get new units in a string
		String newUnit = "";
		
		if(unit.equals("cm")) {
			number = number * 0.393701;
			newUnit = "in";
		}else if(unit.equals("in")) {
			number = number * 2.54;
			newUnit = "cm";
		}else if(unit.equals("yd")) {
			number = number * 0.9144;
			newUnit = "m";
		}else if(unit.equals("m")) {
			number = number * 1.09361;
			newUnit = "yd";
		}else if(unit.equals("oz")) {
			number = number * 28.3495;
			newUnit = "gm";
		}else if(unit.equals("gm")) {
			number = number * 0.035274;
			newUnit = "oz";
		}else if(unit.equals("lb")) {
			number = number * 0.453592;
			newUnit = "kg";
		}else if(unit.equals("kg")) {
			number = number * 2.20462;
			newUnit = "lb";
		}else {
			System.out.println("Please enter valid units");
		}
		
		// Rounded the output to 3 decimal places
		double out = Math.round(number * 1000);
		out = out/1000;
		
		JOptionPane.showMessageDialog(null, userInput + " = " + out + " " + newUnit );
		
	}

}
