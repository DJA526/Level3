import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListTracker implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton();
	JButton removeButton = new JButton();
	JButton saveButton = new JButton();
	JButton loadButton = new JButton();
	JLabel label = new JLabel();
	ArrayList<String> list = new ArrayList<String>();
	
	public void start() {
		frame.setSize(400, 500);
		frame.add(panel);
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
		saveButton.addActionListener(this);
		loadButton.addActionListener(this);
		addButton.setText("Add");
		removeButton.setText("Remove");
		saveButton.setText("Save");
		loadButton.setText("Load");
		panel.add(addButton);
		panel.add(removeButton);
		panel.add(saveButton);
		panel.add(loadButton);
		panel.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		ToDoListTracker a = new ToDoListTracker();
		a.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			list.add(JOptionPane.showInputDialog("Enter a new task."));
		} else if (e.getSource() == removeButton) {
			String removeTask = JOptionPane.showInputDialog("Enter the task you want to remove.");
			if (list.contains(removeTask)) {
				list.remove(removeTask);
			} else {
				JOptionPane.showMessageDialog(null, "The list does not contain this task.");
			}
		} else if (e.getSource() == saveButton) {
			for (String s : list) {
				try {
					FileWriter fw = new FileWriter("src/ToDoList", true);
					fw.write("\n" + s);	
					fw.close();
				} catch (IOException f) {
					f.printStackTrace();
				}
			}
		} else if (e.getSource() == loadButton) {
			String list = "<html>";
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/ToDoList"));
				
				String line = br.readLine();
				while(line != null){
					list = list + line + "<br>";
					line = br.readLine();
				}
				label.setText(list + "</html>");
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException g) {
				// TODO Auto-generated catch block
				g.printStackTrace();
			}
		}
	}
	
	

}
