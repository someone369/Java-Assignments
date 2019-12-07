package com.techm.collections;

import java.util.ArrayList;
import java.util.List;


/**
 * Program for Creating Set
 * @author CP00421684
 *
 */
public class CreateList {

	public static void listCreation(){
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("four");
		for(String ele:list){
			System.out.println("Set Elements-->"+ele);
		}
	}
	public static void main(String[] args) {
		listCreation();

	}

}
