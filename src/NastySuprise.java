import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
JFrame framee = new JFrame();
JButton button = new JButton();
JButton buttonn = new JButton();
JPanel panel = new JPanel();
private BufferedImage hi;
private BufferedImage bye;

	
	public static void main(String[] args) {
	new NastySuprise();
}
	public NastySuprise() {
		framee.setVisible(true);
		framee.add(panel);
		panel.add(button, BorderLayout.NORTH);
		panel.add(buttonn, BorderLayout.SOUTH);
		
		button.setText("Trick");
		buttonn.setText("Treat");
		button.addActionListener(this);
		buttonn.addActionListener(this);
		framee.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		showPictureFromTheInternet("https://media1.popsugar-assets.com/files/thumbor/vktTXInprMN8SOMDzAIjPTUPOrQ/fit-in/1024x1024/filters:format_auto-!!-:strip_icc-!!-/2017/09/21/822/n/1922283/2f0da29d59c40875efabc8.08982197_edit_img_cover_file_14344989_1506018943/i/Scary-Movies-Netflix-October-2017.jpg");
//		if(e.getSource()==button) {
//			try {
//				bye = ImageIO.read(this.getClass().getResourceAsStream("bye.jpg"));
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			System.out.println("hi");
//		}
//		else if(e.getSource()==buttonn) {
//			try {
//				hi = ImageIO.read(this.getClass().getResourceAsStream("hi.jpg"));
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		System.out.println("bye");
//		}
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
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



