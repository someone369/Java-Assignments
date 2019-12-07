package com.techm.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Program for HashMap Operations
 * @author CP00421684
 *
 */
public class HashMapImpl {

	public static void hashMapCreation(){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
	      hm.put("KDP", 40);
	      hm.put("TPT", 30);
	      hm.put("CTR", 28);
	      hm.put("ATP", 21);
	      hm.put("KNL", 25);
	      
	      Set<Entry<String, Integer>> set = hm.entrySet();
	      Iterator<Entry<String, Integer>> i = set.iterator();
	      
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      int temp = hm.get("KDP").intValue();
	      hm.put("KDP", new Integer(temp + 5));
	      System.out.println("KDP's new temparture: " +
	      hm.get("KDP"));
	}
	
	public static void main(String[] args) {
		hashMapCreation();
	}

}
