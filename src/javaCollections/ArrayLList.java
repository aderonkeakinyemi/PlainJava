package javaCollections;

import java.util.ArrayList;

public class ArrayLList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		// to add items to the list
		a.add("Rahul");
		a.add("Aderonke");
		System.out.println(a);
		a.add(2, "Brilliant");
		System.out.println(a);
		
		//remove Items
		//a.remove(0);
		//a.remove("Aderonke");
		//System.out.println(a);
		
		//remove all
		//a.removeAll();
		System.out.println(a.get(1));
		System.out.println(a.contains("Rahul"));
		
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.add("Aderonke");
		a.add("Aderonke");
		System.out.println(a);
		

	}

}
