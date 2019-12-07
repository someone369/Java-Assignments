package com.techm.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Program for Creating Set
 * @author CP00421684
 *
 */
public class ListIteration {

	public static void listIteration(){
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("four");
		Iterator<String> itr=list.iterator();  
		System.out.println("Printing Element using Iterator");  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}
	public static void main(String[] args) {
		listIteration();

	}

}
