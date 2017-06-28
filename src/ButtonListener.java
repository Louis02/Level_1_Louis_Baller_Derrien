import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
	JButton btn = new JButton();

	public ButtonListener() {
		JFrame frame = new JFrame();
		JButton btn = new JButton();

		btn.setText("Click Thy Self youthest citizen");

		frame.add(btn);
		frame.setVisible(true);
		frame.pack();
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		System.out.println("Youstest madest thisest happenest");

	}
}