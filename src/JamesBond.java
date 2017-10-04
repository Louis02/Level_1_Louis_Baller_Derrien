

public class JamesBond {
public static void main(String[] args) {
	Vault vault = new Vault();
	int quess = 0;
	for(int i = 0; i<1000000;i++){
	quess++;
	System.out.println(quess);
	
	boolean vlt = vault.TryCode(quess);
	if(vlt==true){
		System.out.println("yippe");
	}
	}
	
}


}