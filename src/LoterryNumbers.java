import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoterryNumbers implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton lbutton = new JButton();
	JButton buton = new JButton();
	Random rann = new Random();

	LoterryNumbers() {

		frame.setVisible(true);
		frame.setSize(300, 200);

		panel.add(buton);
		panel.add(lbutton);
		frame.add(panel);
		buton.setText("Press for number");
		panel.setLayout(new GridLayout(2, 1));
		lbutton.setBackground(Color.green);
		buton.setBackground(Color.blue);
		lbutton.setOpaque(true);
		buton.setOpaque(true);
		buton.addActionListener(this);
	}

	public static void main(String[] args) {
		new LoterryNumbers();

	}

	public void actionPerformed(ActionEvent e) {

		int ran = rann.nextInt(999999999);

		lbutton.setText(String.valueOf(ran));

	}
}
