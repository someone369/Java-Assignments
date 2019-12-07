package com.techm.arrays;

import java.util.TreeSet;

/**
 * Program for Create array with Duplicate values and them print the common elements to the console
 * @author CP00421684
 *
 */
public class ArrayCommon {
	
	static void arrayCommon(String strArr[]) {
		boolean commonElement=false;
		TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Common Elements Are: "+str);
                commonElement=true;
            }//if
        }//for
        if(!commonElement){
        	System.out.println("There is no common Elements in the list");
        }
	}
	
	public static void main(String[] args) {
		String[] countries = new String[] { "India", "China", "US", "RSA",
				"Japan", "Pak", "NZ", "RSA", "Austrilia", "NZ" };
		arrayCommon(countries);
	}

}
