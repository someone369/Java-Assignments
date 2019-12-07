package com.techm.collections;

import java.util.Arrays;
import java.util.List;

/**
 * Program for Arrays Copy to List
 * @author CP00421684
 *
 */
public class ArrayCopy {

	public static void arrayCopyToArrayList(String[] citi){
		List<String> arrList=Arrays.asList(citi);
		for(String li:arrList){
			System.out.println("List elements-->"+li);
		}
	}
	
	public static void main(String[] args) {
		String citi[]={"Banglore","Hyderabad","Mumbai","Chennai"};
		arrayCopyToArrayList(citi);
	}

}
