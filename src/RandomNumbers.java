import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNumbers {
	
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter an integer.");
		int x = Integer.parseInt(s);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			numbers.add(new Random().nextInt(10));
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(numbers.get(j));
			}
			System.out.println("");
		}
	}

}


//Copyright © 2017 by Delara Aryan