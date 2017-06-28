import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuealingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuealingButtons().createUI();
	}

	JButton lB = new JButton();
	JButton rB = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		lB.setText("Click Me"); // 3. Set the text of the leftButton to "Click
								// me!
		// 4. Set the text of the rightButton to "Click me!"
		rB.setText("Click Me");
		// 5. Add an action listener to the leftButton
		lB.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rB.addActionListener(this);
		// 7. Add the leftButton to the panel
		panel.add(lB);
		// 8. Add the rightButton to the panel
		panel.add(rB);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL
		if (lB == buttonPressed) {
			rB.setText("No Click Me");
			rB.setPreferredSize(BIG);
			lB.setText("Click Me");
			lB.setPreferredSize(SMALL);
		}

		/* If the buttonPressed was the rightButton, do the opposite. */
		else if (rB == buttonPressed) {
			lB.setText("No Click Me");
			lB.setPreferredSize(BIG);
			rB.setText("Click Me");
			rB.setPreferredSize(SMALL);
		}

		frame.pack();
	}
}
