import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	static JFrame frame = new JFrame();
	static JLabel label = new JLabel();
	char c = generateRandomLetter();
	int counter = 0;

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

		if (c == e.getKeyChar()) {
			System.out.println("correct");
			label.setBackground(Color.GREEN);
			counter++;
		} else {
			System.out.println("incorrect");

			label.setBackground(Color.red);
			counter -= 2;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		if (counter > 10) {

			JOptionPane.showMessageDialog(null, c);
			showTypingSpeed(10);
			System.exit(0);
			

		} else if (counter < -16) {
			JOptionPane.showMessageDialog(null, "you need to restart score is " + counter);
			System.exit(0);

		}

		c = generateRandomLetter();
		System.out.println(c);
		System.out.println("you pressed: " + e.getKeyChar());
		label.setText(String.valueOf(c));
		label.setOpaque(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();



}