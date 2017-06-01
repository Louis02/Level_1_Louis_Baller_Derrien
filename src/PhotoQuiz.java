
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String image = "https://s-media-cache-ak0.pinimg.com/736x/91/b4/24/91b42427cea4c2f6b29877a25f6839cf.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component Image1;
		// 3. use the "createImage()" method below to initialize your Component
		Image1 = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(Image1);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("how many spokes are there");
		int x = Integer.parseInt(ans);
		// 7. print "CORRECT" if the user gave the right answer
		if (x == (1)) {
			JOptionPane.showMessageDialog(null, "Seriously.  That's not funny.  You are wrong!!!!!");
		} else if (x == (2)) {
			JOptionPane.showMessageDialog(null, "Seriously.  That's not funny.  How did you penetrate my mind?!?!?!?");
		} else if (x == (3)) {
			JOptionPane.showMessageDialog(null, "That's what I thought but nope.");
		} else if (x >= (4)) {
			JOptionPane.showMessageDialog(null, "youre just messing with me");

		} else {
			JOptionPane.showMessageDialog(null, "please put a number");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(Image1);
		// 10. find another image and create it (might take more than one line
		// of code)
		String Imaget = ("https://richardwiseman.files.wordpress.com/2013/07/moving.jpg");
		// 11. add the second image to the quiz window
Image1= createImage(Imaget);
		// 12. pack the quiz window
quizWindow.add(Image1);
quizWindow.pack();
		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
