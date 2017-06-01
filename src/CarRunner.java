
public class CarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat Cat1 = new Cat("bob");

		// 1. Make the Cat meow
		Cat1.meow();
		// 2. Get the Cat to print it's name
		Cat1.printName();
		// 3. Kill the Cat!
		for (int i = 0; i < 9; i++) {
			Cat1.kill();
		}
	}
}
