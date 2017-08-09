
public class Family {
	public static void main(String[] args) {
		Person p1 = new Person(46, "Pancakes");
		Person p2 = new Person(34, "Wasabi");
		System.out.println(p1.getAge());
		p1.setAge(87);
		System.out.println(p1.getAge());
		p1.setAge(74);

		System.out.println(p2.getFavfood());
		p2.setFavfood("Pancakes");
		System.out.println(p2.getFavfood());
		p2.setFavfood("wasabi");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("There are " + Person.getMemb() + " people in this family");
	}

}
