import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;



public class Tweet implements ActionListener {

	JFrame frame = new JFrame();
JTextField text = new JTextField(20);
JButton button = new JButton();
JTextPane tpane = new JTextPane();
JPanel panel = new JPanel();
JPanel panell = new JPanel();


Tweet(){
	frame.setVisible(true);
	frame.add(panel,BorderLayout.NORTH);
	frame.add(panell,BorderLayout.SOUTH);
	panel.add(text,BorderLayout.EAST);
	panel.add(button);
	button.setText("press for tweet");
	panell.add(tpane);
	text.setForeground(Color.cyan);
	panell.setBackground(Color.red);
	tpane.setForeground(Color.PINK);
	tpane.setPreferredSize(new Dimension(500,500));
	tpane.setEditable(true);
	button.addActionListener(this);
	JScrollPane scroll = new JScrollPane(tpane);
	panell.add(scroll);
	frame.pack();
	
	
	
}
public static void main(String[] args) {
	new Tweet();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

String s =	getLatestTweet1(text.getText());
System.out.println(s);
tpane.setText(s);

}


	private String getLatestTweet1(String searchingFor) {
	

			Twitter twitter = new TwitterFactory().getInstance();
			AccessToken accessToken = new AccessToken(
					"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
					"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
			twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
					"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
			twitter.setOAuthAccessToken(accessToken);

			Query query = new Query(searchingFor);
			try {
				QueryResult result = twitter.search(query);
				String s = "";
				for(int i  = 0; i <14; i++){
					s+=   result.getTweets().get(i).getText() +"\n";
				
				}
			return s;
			} catch (Exception e) {
				System.err.print(e.getMessage());
				return "What the heck is that?";
				
			}
		}













}
