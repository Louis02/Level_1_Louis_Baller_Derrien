import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	String[] jokes = {"why did the golfer bring two pairs of pants",
			"Why dont you play poker in the jungle", 
			"How many tickles does it take to tickle an octopus"};
	String[]punchline = {"in case he got a hole in one",
			"too many cheetas", "Ten-Tickles"
	};
	int index = 0;
	public static void main(String[] args) {
		new ChuckleClicker().makeButton();
	}

	JButton button = new JButton("Punchline");
	JButton buton = new JButton("Joke");
	JLabel label = new JLabel();
	JPanel pannel = new JPanel();
	JPanel panel = new JPanel();
	public void makeButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(pannel);
		button.addActionListener(this);
		buton.addActionListener(this);
		button.setEnabled(false);
		frame.add(panel);
		frame.add(pannel);
		panel.add(buton);
		panel.add(button);
		pannel.add(label);
		label.setVerticalAlignment(JLabel.BOTTOM);

		button.setBackground(Color.MAGENTA);
		buton.setBackground(Color.RED);
		button.setOpaque(true);
		frame.setLayout(new GridLayout(2, 1));
		buton.setOpaque(true);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (buton == e.getSource()) {
			button.setEnabled(true);
			label.setText(jokes[index]);
		}
		if(button == e.getSource()){
			label.setText(punchline[index]);
			index++;
			button.setEnabled(false);
		}
		if(index>=jokes.length){
			index=0;
		}
	}
}
