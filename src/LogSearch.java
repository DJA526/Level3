import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {

 /*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons.
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 *
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 *
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 *
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list.
	 *
	 * */
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	LogSearch() {
		frame.setSize(500, 70);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	
	public static void main(String[] args) {
		LogSearch a = new LogSearch();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			String IDstring = JOptionPane.showInputDialog("Enter an ID number.");
			int IDnumber = Integer.parseInt(IDstring);
			String name = JOptionPane.showInputDialog("Enter a name.");
			map.put(IDnumber, name);
		} else if (e.getSource() == button2) {
			String IDstring2 = JOptionPane.showInputDialog("Enter an ID number.");
			int IDnumber2 = Integer.parseInt(IDstring2);
			if (map.keySet().contains(IDnumber2)) {
				JOptionPane.showMessageDialog(null, map.get(IDnumber2));
			} else {
				JOptionPane.showMessageDialog(null, "This entry does not exist.");
			}
		} else if (e.getSource() == button3) {
			String list = "";
			for (Integer i : map.keySet()) {
				list = list + "ID: " + i + "  Name: " + map.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
		} else if (e.getSource() == button4) {
			String IDstring3 = JOptionPane.showInputDialog("Enter an ID number.");
			int IDnumber3 = Integer.parseInt(IDstring3);
			if (map.keySet().contains(IDnumber3)) {
				map.remove(IDnumber3);
			} else {
				JOptionPane.showMessageDialog(null, "This entry does not exist.");
			}
		}
	}
}

