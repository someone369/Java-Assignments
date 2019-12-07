package com.techm.strings;

/**
 * Program for String Equality
 * @author CP00421684
 *
 */
public class StringEquals {
	
	public static void equalStrings(String str, String str2){
		int compareOutput=str.compareTo(str2);
		if(compareOutput==0){
			System.out.println("String are equal");
		}
		else{
			System.out.println("String are not equal");
		}
		
	}
	
	public static void main(String[] args) {
		String s1="tech";
		String s2="mahindra";
		equalStrings(s1, s2);
	}

}
