package gyw_lab8;

public class Lab8 {

	public static void main(String[] args) {
		String input = "";
		RecordList list = new RecordList();
		do {
			// Get user input
			input = javax.swing.JOptionPane.showInputDialog("Please enter new record (name, time).\nHit cancel to quit.");
			
			if (input != null) {
				double time;
				String name;
				
				// Process user input
				try {
					String [] parts = input.split(",");
					name = parts[0].trim();
					String timeStr = parts[1].trim();
					time = Double.parseDouble(timeStr);
				} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
					javax.swing.JOptionPane.showMessageDialog(null, "Invalid input, please try again!");
					continue; // if input is invalid, restart the loop
				}
				
				// Add new record
				Record r = new Record(name, time);
				list.add(r);
				// Print out a message if this is new best time
				if (list.indexOf(r.getName()) == 0) {
					javax.swing.JOptionPane.showMessageDialog(null, "Congratulations! " + name + " has the fastest time so far");
				}
				
				list.print();
			}
		} while (input != null);
		
		list.writeToFile("data/recordList.txt");

	}

}