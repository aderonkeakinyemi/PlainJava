package javaCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>  hs =new Hashtable<Integer, String>();
		hs.put(1, "Aderonke");
		hs.put(2, "Akinyemi");
		hs.put(2, "Akinyemi");
		hs.put(3, "Hello");
		hs.put(4, "Hi");
		//hs.put(null, null);
		hs.put(5, "Bye");
		System.out.println(hs);
		System.out.println(hs.get(2));
		System.out.println(hs.remove(2));
		System.out.println(hs.get(2));
		
		// convert a hasmap to a set
		Set sm = hs.entrySet();
		System.out.println(sm);
		
		Iterator it = sm.iterator();		
		while(it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry  hy = (Map.Entry)it.next();
			System.out.println(hy.getKey()+ " " + hy.getValue());
		}
		

	}

}
