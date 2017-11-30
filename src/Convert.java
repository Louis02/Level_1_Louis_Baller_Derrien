
public class Convert {
	Double d = 3.14;
	int i = 13;
public static void main(String[] args) {
 Convert con = new Convert();
 System.out.println(con.toString());
}
public Convert() {
String s = Double.toString(d);	
System.out.println(s);
String s2 = Integer.toString(i);	
System.out.println(s2);
int i = d.intValue();
String s3 = String.valueOf(true);
System.out.println(i+d);

}
@Override
public String toString() {
	return "Your number is " + (i+d);
}

}
