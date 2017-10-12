

public class JamesBond {
public JamesBond(){
	
}
public void guess (Vault V){
	
			for(int i = 0; i<1000000;i++){
				if(V.TryCode(i) == true){
					System.out.println("yaaay" + i);
					
				}
				
			}
			
}
}