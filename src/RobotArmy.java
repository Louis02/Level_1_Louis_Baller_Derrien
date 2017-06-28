

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
Human Steve = new Human("Steve");
		//2. create a new Robot army of good and evil robots.
Robot bad = new Robot("bad", true);
Robot bad2 = new Robot("bad2", true);
Robot bad3 = new Robot("bad3", true);
Robot bad4 = new Robot("bad4", true);
		Robot good = new Robot("good", false);
		//3. command your robot army to destroy a human
	bad.destroy(Steve);
	good.destroy(Steve);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
	if(man.isAlive==false){
		System.out.println("We found his corpse");
	}
		else if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}


