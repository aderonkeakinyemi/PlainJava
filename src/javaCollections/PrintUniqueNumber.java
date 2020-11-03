package javaCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the unique numbers and how many times the number is repeateed
		int a[] = {4,4,9,9,9,9,9,9,5,5,6,0,0,0};
		
		// out put: 4 -4, 5 - 6; and print the unique number;
		/* Steps
		 * counter, storage(hashMAp)
		 * find each number
		 * store the number as key in a hash map
		 * find the count of each number, store the result as a value
		 * convert the map to a set
		 * extract your values
		 * 
		 */
		

		int hval =0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i< a.length; i++) {
			if(!hm.containsKey(a[i]))
			{
				hm.put(a[i], 1);
			}
			else
			{
				hval = hm.get(a[i]) + 1;
				hm.replace(a[i], hval);
			}
				
		}
		
		//convert the hashmap to a set
		Set<Entry<Integer, Integer>> sm = hm.entrySet();
		System.out.println(sm);
		
		//Get your iterator
		int val = 0;
		int highest = 0;
		Iterator<Entry<Integer, Integer>> it = sm.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,Integer> me = (Entry<Integer, Integer>) it.next();
			System.out.println(me.getKey() + " - " + me.getValue());
			if(me.getValue() > val) {
				val = me.getValue();
				highest = me.getKey();
				
			}
			
			//System.out.println(me);
		}
		System.out.println();
		System.out.println("The highest number is: " + highest + " and it's coutn is: "+ val);
	}

}
