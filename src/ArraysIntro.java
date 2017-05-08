import javax.swing.JOptionPane;

public class ArraysIntro {
	
	public static void main(String[] args) {
		String stringA = JOptionPane.showInputDialog("Enter an integer.");
		String stringB = JOptionPane.showInputDialog("Enter an integer.");
		String stringC = JOptionPane.showInputDialog("Enter an integer.");
		int intA = Integer.parseInt(stringA);
		int intB = Integer.parseInt(stringB);
		int intC = Integer.parseInt(stringC);
		int array[] = new int[3];
		array[0] = intA;
		array[1] = intB;
		array[2] = intC;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[i]) {
					
				}
			}
		}
	}

}


//Copyright © 2017 by Delara Aryan