import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		
		Random r = new Random();
		int ran = r.nextInt(200) + 100;
		
		Tortoise.setX(10);
		Tortoise.setY(400);
		Tortoise.show();
		Tortoise.setSpeed(10);
		
for(int i = 0; i<40;i++){
			house();
}
	}

	public static void house() {
		Random rrr = new Random();
		int rr = rrr.nextInt(2);
		Random r = new Random();
		int ran = r.nextInt(100) + 100;
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.setAngle(0);
		Tortoise.move(ran);
		if (rr >= 1) {
			Tortoise.setAngle(45);
			Tortoise.move(20);
			Tortoise.setAngle(140);
			Tortoise.move(20);
			
		} else  {
			Tortoise.setAngle(90);
			Tortoise.move(20);
			
		}
		Tortoise.setAngle(180);
		Tortoise.move(ran);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(20);
	}
}
