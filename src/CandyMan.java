import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyMan extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JButton button = new JButton();
	int counter = 0;

	public CandyMan() {
		add(panel);
		panel.add(button);
		setVisible(true);
		pack();
		button.setText("CandyMan");
		button.addActionListener(this);
	}

	public static void main(String[] args) {
		new CandyMan();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		counter++;
		if (counter == 5) {
showPictureFromTheInternet("https://vignette.wikia.nocookie.net/candy-land/images/0/01/%21plumpy.jpg/revision/latest?cb=20151212194206");
		counter=0;
		}
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL("https://vignette.wikia.nocookie.net/candy-land/images/0/01/%21plumpy.jpg/revision/latest?cb=20151212194206");
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
