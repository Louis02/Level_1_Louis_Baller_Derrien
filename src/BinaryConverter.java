import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JPanel panel = new JPanel();
	JTextField textt = new JTextField(10);
	JTextField text = new JTextField(10);

	public static void main(String[] args) {

		new BinaryConverter();

	}

	BinaryConverter() {
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		text.setVisible(true);
		textt.setVisible(true);
		panel.add(text);
		panel.add(button);
		panel.add(textt);
		button.setText("C0nvert");
		button.addActionListener(this);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	int convertint(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	String convertstring(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	String converted= convertstring(text.getText());
	textt.setText(textt.getText() + converted);

	
	}

}
