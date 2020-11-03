package JavaBasics;
import java.util.ArrayList;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "javatraining";
		String b = "madam";
		String c = "Hey Boo";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(b.substring(1,3));
		System.out.println(a.concat(b));
		System.out.println(c.trim());
		
		String d[] = c.split("B");
		
		//WHy can't I print the entire array together
		System.out.println(d[0]);
		String e = a.replace("j", "a");
		System.out.println(e);
		
		for(int i = 0; i<a.length(); i++) {
			System.out.println(a.charAt(i) + "\n");
		}
		
	String g = "";
		
		for(int i = b.length()-1; i >= 0 ; i--) {
			System.out.println(b.charAt(i));
			g += b.charAt(i);
		}
		
		if(g.equals(b)) {
			System.out.println("We have a palindrome");
		}
		
		

	}

}
