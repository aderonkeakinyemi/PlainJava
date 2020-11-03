package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Africa");
		hs.add("Europe");
		hs.add("Asia");
		System.out.println(hs);
		hs.add("Europe");
		hs.add("Asia");
		hs.add("Afghanistan");
		System.out.println(hs);
		System.out.println(hs.remove("Africa"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator <String> it = hs.iterator();
		System.out.println(it.next());
		System.out.println(hs);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
