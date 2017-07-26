import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame frame = new JFrame();
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
frame.pack();
	Random ran = new Random();
	
	// 4. Instantiate a Turtle
	int r = ran.nextInt(200);
for(int i = 0; i<50000;i++){
Turtle tut = new Turtle();
 r = ran.nextInt(600);
 
 tut.setX(r);
 r = ran.nextInt(400);
 tut.setY(r);
// 5. Add the turtle to the panel 
		panel.addTurtle(tut);
	
		}
		// 6. Put 50 Turtles on the beach
	
}}
