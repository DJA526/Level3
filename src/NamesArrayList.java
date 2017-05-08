import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NamesArrayList implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton();
	JButton viewButton = new JButton();
	JButton deleteButton = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	public void start() {
		frame.setSize(400, 100);
		frame.add(panel);
		addButton.addActionListener(this);
		viewButton.addActionListener(this);
		deleteButton.addActionListener(this);
		addButton.setText("Add");
		viewButton.setText("View");
		deleteButton.setText("Delete");
		panel.add(addButton);
		panel.add(viewButton);
		panel.add(deleteButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		NamesArrayList a = new NamesArrayList();
		a.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			names.add(JOptionPane.showInputDialog("Enter a name."));

		} else if (e.getSource() == viewButton) {
			
		}
	}

}


//Copyright © 2017 by Delara Aryan