import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ImageIcon img;
	public static void main(String[] args) {
		new WhackAMole();
	}

	public WhackAMole() {
		
		Random rann = new Random();
		int ran = rann.nextInt(24);
		try {
			BufferedImage molePic = ImageIO.read(this.getClass().getResourceAsStream("screen.png"));
		img= new ImageIcon(molePic);
		}
		catch(Exception e){
			
		}
	
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.setPreferredSize(new Dimension(100, 100));
			panel.setBackground(Color.green);
			button.setOpaque(true);
			button.setBackground(Color.BLACK);

			panel.add(button);
			if (i == ran) {
				button.setIcon(img);
				button.setText("a");
				
			}
			button.addActionListener(this);

		}
		
		frame.setSize(500, 700);
		frame.add(panel);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("a")) {
			frame.dispose();
			new WhackAMole();
		}
	}
}
