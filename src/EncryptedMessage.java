import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EncryptedMessage {
	
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Enter a message.");
		String encryptedMessage = "";
		for (int i = 0; i < message.length(); i++) {
			encryptedMessage += (char)(message.charAt(i) + 10);
		}
		
		try {
			FileWriter fw = new FileWriter("src/encryption.txt");
			fw.write(encryptedMessage);	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


//Copyright © 2017 by Delara Aryan