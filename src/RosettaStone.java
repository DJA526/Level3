import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener {
	
	HashMap<String, String> map = new HashMap<String, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	RosettaStone() {
		map.put("hola", "hello");
		map.put("adiós", "bye");
		map.put("Buenos días", "good morning");
		map.put("buenas noches", "good night");
		map.put("comida", "food");
		map.put("agua", "water");
		map.put("colegio", "school");
		map.put("casa", "home");
		map.put("música", "music");
		map.put("libro", "book");
		map.put("coche", "car");
		map.put("caminar", "walk");
		map.put("computadora", "computer");
		map.put("perro", "dog");
		map.put("gato", "cat");
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button);
		button.setText(""+map.keySet().toArray()[0]);
		button.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		RosettaStone a = new RosettaStone();
	}
	
	String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (map.keySet().contains(button.getText())) {
			button.setText(map.get(button.getText()));
		} else {
			button.setText(getRandomKey(map));
		}
	}

}
