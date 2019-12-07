package com.techm.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Program for 
 * 1.Create another arrays of States of various countries
 * 2.Merge Country array with State Array
 * 3.Remove an element from State Array
 * @author CP00421684
 *
 */
public class ArrayCreateMergeRemove {

	static void arrayCreateMerge(){
		String[] countries = new String[] { "India", "China", "US", "UK",
				"Japan", "Pak", "SriLanka", "RSA", "Austrilia", "NZ" };
		
		String[] states = new String[] { "AP", "KAR", "TN", "KERALA",
				"GOA", "MH", "GJ", "TS", "MP", "UP" };
		List<String> list=new ArrayList<String>(Arrays.asList(countries));
		list.addAll(Arrays.asList(states));
		Object []statesCountries=list.toArray();
		System.out.println("States and Countries");
		for(Object ob:statesCountries){
			System.out.println(ob);
		}
	}
	
	static void removeArrayElement(String elementToRemove){
		String[] states = new String[] { "AP", "KAR", "TN", "KERALA",
				"GOA", "MH", "GJ", "TS", "MP", "UP" };
		List<String> list=new ArrayList<String>(Arrays.asList(states));
		if(list.contains(elementToRemove)){
			list.remove(elementToRemove);
			System.out.println(elementToRemove+" State is Removed");
			System.out.println("****Current Array after "+elementToRemove+ " State Removed****");
			for(String li:list){
				System.out.println(li);
			}
		}
		else{
			System.out.println("Entered Array State not available to Remove");
		}
		
	}
	
	public static void main(String[] args) {
		arrayCreateMerge();
		removeArrayElement("GOA");
	}

}
