
public class Athlete {
private static int count = 0;
private String name;
private double speed;
public Athlete (double speed, String name){
count++;
	this.speed=speed;
this.name=name;
}
public static int getCount(){
	return count;
}
public double time ( ){
	return 26/speed;
}
}
