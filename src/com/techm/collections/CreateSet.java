package com.techm.collections;

import java.util.HashSet;
import java.util.Set;


/**
 * Program for Creating Set
 * @author CP00421684
 *
 */
public class CreateSet {

	public static void setCreation(){
		Set<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("one");
		hs.add("three");
		hs.add("four");
		for(String ele:hs){
			System.out.println("Set Elements-->"+ele);
		}
	}
	public static void main(String[] args) {
		setCreation();

	}

}
