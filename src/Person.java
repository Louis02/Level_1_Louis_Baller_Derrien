
public class Person {
	private static int Memb = 0;
	private int age;
	private String favfood;

	public Person(int age, String favfood) {
		Memb++;
		this.age = age;
		this.favfood = favfood;
	}

	public int getAge() {
		return age;
	}

	public String getFavfood() {
		return favfood;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFavfood(String favfood) {
		this.favfood = favfood;
	}

	@Override
	public String toString() {
		return "I am " + age + " years old.  I love to eat " + favfood + "!";
	}

	public static int getMemb() {
		return Memb;
	}

}
