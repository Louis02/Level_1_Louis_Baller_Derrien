
public class Arrays {
	public static void main(String[] args) {
		String[] list = { "Master", "My", "Sister's", "Guest", "Office", "GameRoom" };
		Integer[] imp = new Integer[list.length];
		imp[0] = 10;
		imp[1] = 9;
		imp[2] = 5;
		imp[3] = 8;
		imp[4] = 3;
		imp[5] = 4;
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " bed has imprtance level of " + imp[i]);
		}
	}
}
