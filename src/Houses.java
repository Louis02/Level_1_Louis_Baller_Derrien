import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Random r = new Random();
		int ran = r.nextInt(100) + 100;
		Tortoise.setX(10);
		Tortoise.setY(400);
		Tortoise.show();
	}

	public void house() {
		Random r = new Random();
		int ran = r.nextInt(100) + 100;
		Tortoise.setAngle(0);
		Tortoise.move(ran);
		if (ran >= 150) {
			Tortoise.setAngle(95);
			Tortoise.move(20);
			Tortoise.setAngle(180);
		} else if (ran < 150) {
			Tortoise.setAngle(angle);
		}
	}
}
