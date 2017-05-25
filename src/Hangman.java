import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hangman implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel instructions = new JLabel();
	JLabel livesLeft = new JLabel();
	JLabel wordsSolved = new JLabel();
	JLabel word = new JLabel();
	int lives = 9;
	int solved = 0;
	String puzzle = "";
	Stack<String> words = new Stack<String>();
	ArrayList<String> boxes = new ArrayList<String>();

	public static void main(String[] args) {
		Hangman a = new Hangman();
		a.addWords();
		a.createUI();
		a.nextWord();
	}

	public void createUI() {
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(instructions);
		panel.add(livesLeft);
		panel.add(wordsSolved);
		panel.add(word);
		instructions.setText("Guess a letter.");
		livesLeft.setText("You have 9 lives left.");
		wordsSolved.setText("You have solved 0 words.");
	}

	public void addWords() {
		words.push("awkward");
		words.push("blizzard");
		words.push("cycle");
		words.push("disavow");
		words.push("espionage");
		words.push("fuchsia");
		words.push("galvanize");
		words.push("haphazard");
		words.push("jazzy");
		words.push("kayak");
	}

	public void createBoxes() {
		String s = "";
		for (int i = 0; i < boxes.size(); i++) {
			s += boxes.get(i);
		}
		word.setText(s);
	}

	public void nextWord() {
		boxes.clear();
		puzzle = words.pop();
		for (int i = 0; i < puzzle.length(); i++) {
			boxes.add("_ ");
		}
		createBoxes();
	}

	public void updateSpaces(char keyChar) {
		for (int i = 0; i < puzzle.length(); i++) {
			if (puzzle.charAt(i) == keyChar) {
				boxes.set(i, "" + keyChar);
			}
		}
		if (puzzle.contains("" + keyChar) == false) {
			lives--;
			livesLeft.setText("You have " + lives + " lives left.");
		}
		createBoxes();
	}

	public void endGame() {
		if (lives == 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		updateSpaces(e.getKeyChar());
		if (boxes.contains("_ ") == false) {
			JOptionPane.showMessageDialog(null, "Solved!");
			solved++;
			wordsSolved.setText("You have solved " + solved + " words.");
			nextWord();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
