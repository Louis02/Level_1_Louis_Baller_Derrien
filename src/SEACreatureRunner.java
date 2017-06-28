
public class SEACreatureRunner {
	/*
	 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
	 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	 */
	public static void main(String[] args) {
		SeaCreatures spongeBob = new SeaCreatures("Spongebob");
		SeaCreatures Patrick = new SeaCreatures("patrick");
		SeaCreatures Squidward = new SeaCreatures("squidward");
		spongeBob.eat();
		spongeBob.laugh();
		Patrick.eat();
		Patrick.laugh();
		Squidward.eat();
		Squidward.laugh();
	}
}
