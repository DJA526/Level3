import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StacksTyping implements KeyListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String s = label.getText();
	Stack<Character> stack = new Stack<Character>();
	
	StacksTyping(){
		frame.setSize(800, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
	}
	
	public static void main(String[] args) {
		StacksTyping a = new StacksTyping();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			s = label.getText();
			if (s.length() != 0) {
				stack.push(s.charAt(s.length() - 1));
				s = s.substring(0, s.length() - 1);
				label.setText(s);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("hi");
			label.setText(label.getText() + stack.pop());
		} else {
			label.setText(label.getText() + e.getKeyChar());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
