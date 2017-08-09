import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		new FortuneCookie();

	}

	public FortuneCookie() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton button = new JButton("Press this for fortune");
		frame.add(button);
		button.addActionListener(this);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Wooohoooo");
		Random ran = new Random();
		int r = ran.nextInt(5);
		if (r == 0) {
			JOptionPane.showMessageDialog(null, "You will never succeed <3");
		} else if (r == 1) {
			JOptionPane.showMessageDialog(null, "Great friends wil give you more great friends");
		} else if (r == 2) {
			JOptionPane.showMessageDialog(null, "Never worry.  Everything you know will soon be demolished");
		} else if (r == 3) {
			JOptionPane.showMessageDialog(null, "You will prosper.  I didn't vote for this");
		} else if (r == 4) {
			JOptionPane.showMessageDialog(null, "You are a big big big big big happy ball of human");
		}
	}
}
