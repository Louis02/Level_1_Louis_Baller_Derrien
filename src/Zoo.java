import org.w3c.dom.css.Counter;

public class Zoo {
	public static void main(String[] args) {
		Animal cow = new Animal("calf", "Sal", 1, 3);
		Animal pigeon = new Animal("pigeon", "Larry", 99, 99);
		Animal owl = new Animal("Owlet", "Q", 2, 1);
		Animal ferret = new Animal("ferret", "Murr", 15, 1);
		Animal pig = new Animal("pig", "Joe", 40, 0);
		System.out.println("Hiya I'm a " + pig.getType() + " named " + pig.getName() + ".  My age is " + pig.getAge()
				+ " and " + pig.getNumhunt() + " people " + "want to kill me.");
		System.out.println("There are " + Animal.getCounter() + " animals in the zoo.");

	}
}
