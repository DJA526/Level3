import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class JokesArrayList {

	public static void main(String[] args) {
		ArrayList<String> jokes = new ArrayList<String>();
		jokes.add("Why was the scarecrow given a Nobel Prize?");
		jokes.add("What did the Buddhist say to the hot dog vendor?");
		jokes.add("What do you call a psychic midget who just escaped from prison?");
		jokes.add("What do you call it when Batman skips church?");
		jokes.add("What's the difference between a dirty bus stop and a lobser with breast implants?");
		
		ArrayList<String> punchlines = new ArrayList<String>();
		punchlines.add("Because he was outstanding in his field.");
		punchlines.add("Make me one with everything.");
		punchlines.add("A small medium at large.");
		punchlines.add("Christian Bale.");
		punchlines.add("One's a crusty bus station and one's a busty crustacean.");
		
		int x = new Random().nextInt(jokes.size());
		JOptionPane.showMessageDialog(null, jokes.get(x));
		JOptionPane.showMessageDialog(null, punchlines.get(x));
	}
	
}
