
public class Ice {
	private String flavor;
	private String name;
	private static int vote;
	public Ice(String flavor, String name){
		vote++;
		this.flavor = flavor;
		this.name = name;
		
	}
	public String getFlavor(){
		return flavor;
	}
	public String getName(){
		return name;
	}
	public int getVote(){
		return vote;
	}
}