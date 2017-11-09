import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}

	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JLabel text = new JLabel();

	public Calculator() {
		frame.setVisible(true);
		panel1.add(text1);
		panel1.add(text2);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel3.add(text);
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2,  BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.SOUTH);
		button1.setText("+");
		button2.setText("-");
		button3.setText("X");
		button4.setText("/");
		button5.setText("%");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 130);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double a = 0;
		Double d = Double.parseDouble(text1.getText());
		Double dd = Double.parseDouble(text2.getText());
		if(e.getSource()==button1) {
			 a = d+dd;
		}
		else if(e.getSource()==button2) {
			 a = d-dd;
		}
		else if(e.getSource()==button3) {
			 a = d*dd;
		}
		else if(e.getSource()==button4) {
			 a = d/dd;
		}
		else if(e.getSource()==button5) {
			 a = d%dd;
		}
		
		text.setText(String.valueOf(String.format("%.6f", a)));
	}
}
