package com.techm.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Program for Reverse the array of countries
 * @author CP00421684
 *
 */
public class ReverseArray {

	static void arrayReverse(String ar[]){
		
			List<String> searArr=Arrays.asList(ar);
			System.out.println("******Courtries Before Sort******");
			for(String country:searArr){
				System.out.println(country);
			}
			Collections.sort(searArr);
			System.out.println("******Courtries After Sort******");
			for(String country:searArr){
				System.out.println(country);
			}
		
		
	}
	public static void main(String[] args) {
		String[] countries = new String[] { "India", "China", "US", "UK",
				"Japan", "Pak", "SriLanka", "RSA", "Austrilia", "NZ" };
		arrayReverse(countries);
	}

}
