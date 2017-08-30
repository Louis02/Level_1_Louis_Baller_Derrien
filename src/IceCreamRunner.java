
public class IceCreamRunner {
	public static void main(String[] args) {
		Ice[] votes = { new Ice("vanilla", "Louis"), new Ice("chocolate", "Cole"), new Ice("strawberries", "Ryan"),
				new Ice("mint", "Luke")

		};
		System.out.println(Ice.getVote() + " Votes");
		for (int i = 0; i < votes.length; i++) {
			System.out.println(votes[i].getFlavor());
		}
		votes[2].setFlavor("cappuccino");
		System.out.println(Ice.getVote() + " Votes");
		for (int i = 0; i < votes.length; i++) {
			System.out.println(votes[i].getFlavor());
		}
	}
}
