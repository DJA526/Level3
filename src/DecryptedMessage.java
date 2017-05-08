import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class DecryptedMessage {
	
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(jfc.getSelectedFile().getAbsolutePath()));	
				String message = br.readLine();
				String decryptedMessage = "";
				for (int i = 0; i < message.length(); i++) {
					decryptedMessage += (char)(message.charAt(i) - 10);
				}
				System.out.println(decryptedMessage);
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}


//Copyright © 2017 by Delara Aryan