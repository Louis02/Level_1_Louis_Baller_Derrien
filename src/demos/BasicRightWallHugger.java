package demos;

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class BasicRightWallHugger extends IRobotAdapter {
	Sonar sonar = new Sonar();
	
	public BasicRightWallHugger(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		BasicRightWallHugger rob = new BasicRightWallHugger(base);
		rob.setup();
		while(rob.loop()){}
		rob.shutDown();
		
	}

	
	
	private void setup() throws Exception {
		//SETUP CODE GOES HERE!!!!!
	}
	
	private boolean loop() throws Exception{
		//LOOP CODE GOES HERE!!!!!
		readSensors(100);
//<--gotta read them sensors
		
		//getLightBumps() returns an array of length 6 (elements 0 - 5)
		//element 0 is the far left light sensor
		//element 5 is the far right light sensor
		//elements 1-4 are the sensors inbetween from left to right
		int[] lightBumpReadings = getLightBumps();
		driveDirect(150, 50);
		
		if(lightBumpReadings[4] > 0){
			driveDirect(200, -200);
			sleep(500);
			driveDirect(100, 100);
		}else if(lightBumpReadings[5] > 0){
			driveDirect(-100, 100);
			sleep(300);
			driveDirect(100, 100);
			sleep(500);
		}
		else if(lightBumpReadings[3] > 0){
			driveDirect(-200, -200);
			sleep(500);
			driveDirect(-100, 100);
			sleep(300);
		
		
		}
		
		return true;
	}
	
	private void sleep(int amt){
		try {
			Thread.sleep(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void shutDown() throws IOException {
		reset();
		stop();
		closeConnection();
	}
}
