
public class HarryPotterRunner {
	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter hp = new HarryPotter();
		// 2. become invisible
		hp.makeInvisible(true);
		// 3. spy on professor snape
		hp.spyOnSnape();
		// 4. become visible again
		hp.makeInvisible(false);
		// 5. cast a “stupefy” spell
		hp.castSpell("stupefy");
		hp.playQuiditch();
	}
}
