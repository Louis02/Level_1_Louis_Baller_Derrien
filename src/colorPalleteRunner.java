import java.awt.Color;

public class colorPalleteRunner {
public static void main(String[] args) {
	
colorPallete color =	new colorPallete(new Color(0,8,255), new Color(0,255,0), new Color(234,19,70));
Picasso pic= 	new Picasso();
pic.drawPic(color);
}
}
