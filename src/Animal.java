
public class Animal {
	private String type;
	private String name;
	private int age;
	private int numhunt;
	private static int counter = 0;

	public Animal(String type, String name, int age, int numhunt) {
		counter++;
		this.type = type;
		this.name = name;
		this.age = age;
		this.numhunt = numhunt;
	}

	public int getAge() {
		return age;
	}

	public int getNumhunt() {
		return numhunt;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public static int getCounter() {
		return counter;
	}
}
