
public class Marathon {
	public static void main(String[] args) {
		Athlete a1 = new Athlete(10,"rob");
		Athlete a2 = new Athlete(7,"dan");
		Athlete a3 = new Athlete (17, "rik");
		System.out.println(Athlete.getCount() +" competers");
		System.out.println("rob's time is " + a1.time() + " hours");
		System.out.println("dan's time is " + a2.time() + "hours");
		System.out.println("rik's time is " + a3.time() + " hours");
	}
}
