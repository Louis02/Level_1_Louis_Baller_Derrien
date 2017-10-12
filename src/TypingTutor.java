import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	static JFrame frame = new JFrame();
	static JLabel label = new JLabel();
	char c = generateRandomLetter();

	public static void main(String[] args) {

		new TypingTutor();

	}

	public TypingTutor() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(this);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(String.valueOf(c));
		
		frame.add(label);
		label.setFont(label.getFont().deriveFont((float) 28.));
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		c = generateRandomLetter();
		System.out.println(c);
		System.out.println("you pressed: " + e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		
label.setText(String.valueOf(c));
		label.setOpaque(true);
		if(c==e.getKeyChar()){
			System.out.println("correct");
			label.setBackground(Color.GREEN);
			
		}
		else{
			System.out.println("incorrect");
	
			label.setBackground(Color.red);
			
		}
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
