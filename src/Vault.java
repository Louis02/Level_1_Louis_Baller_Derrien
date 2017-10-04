import java.util.Random;

public class Vault {
	Random rann = new Random();
	int ran = rann.nextInt(1000000);
	public Vault(){
	
}
public boolean TryCode(int quess){
	if(quess==ran){
		return true;
	}
	else{
		return false;
	}
	
}
}
