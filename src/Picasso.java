import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Picasso {
	public void drawPic(colorPallete colr) {
		Robot cc = new Robot();

		cc.penDown();
		cc.setSpeed(10);
		cc.hide();
		for (int a = 0; a < 23; a++) {
			for (int i = 0; i < 5; i++) {
				cc.setPenColor(colr.getcolor1());
				cc.move(3);
				cc.turn(1);

			}
			for (int b = 0; b < 5; b++) {
				cc.setPenColor(colr.getcolor2());
				cc.move(3);
				cc.turn(1);

			}
			for (int c = 0; c < 5; c++) {
				cc.setPenColor(colr.getcolor3());
				cc.move(3);
				cc.turn(1);

			}
		}
		cc.turn(90);
		cc.move(5);
		cc.turn(-90);
		for (int a = 0; a < 24; a++) {
			for (int z = 0; z < 5; z++) {
				cc.setPenColor(colr.getcolor1());
				cc.move(2);
				cc.turn(1);

			}
			for (int f = 0; f < 5; f++) {
				cc.setPenColor(colr.getcolor2());
				cc.move(2);
				cc.turn(1);

			}
			for (int n = 0; n < 5; n++) {
				cc.setPenColor(colr.getcolor3());
				cc.move(2);
				cc.turn(1);

			}
		}
		cc.turn(90);
		cc.move(5);
		cc.turn(-90);
		for (int a = 0; a < 24; a++) {
			for (int z = 0; z < 5; z++) {
				cc.setPenColor(colr.getcolor1());
				cc.move(1);
				cc.turn(1);

			}
			for (int f = 0; f < 5; f++) {
				cc.setPenColor(colr.getcolor2());
				cc.move(1);
				cc.turn(1);

			}
			for (int n = 0; n < 5; n++) {
				cc.setPenColor(colr.getcolor3());
				cc.move(1);
				cc.turn(1);

			}
		}
	}
}