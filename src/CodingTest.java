import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CodingTest implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();

	public static void main(String[] args) {
		CodingTest code = new CodingTest();

	}

	public CodingTest() {
		frame.setVisible(true);

		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button.setBackground(Color.YELLOW);
		button.setOpaque(true);
		button.addActionListener(this);
		button2.setBackground(Color.red);
		button2.setOpaque(true);
		button2.addActionListener(this);
		button3.setBackground(Color.blue);
		button3.setOpaque(true);
		button3.addActionListener(this);
		button4.setBackground(Color.GREEN);
		button4.setOpaque(true);
		button4.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			speak("yellow");
		}
		if (e.getSource() == button2) {
			speak("red");
		}
		if (e.getSource() == button3) {
			speak("blue");
		}
		if (e.getSource() == button4) {
			speak("green");
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
