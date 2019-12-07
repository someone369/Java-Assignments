package com.techm.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Program for Create an array of 10 elements (Countries), Sort that array and search an element inside it, e.g. 'China'
 * @author CP00421684
 *
 */
public class ArraySearch {

	static void searchArray(String []ar, String countrySearch) {
		List<String> searArr=Arrays.asList(ar);
		Collections.sort(searArr);
		
		if(Collections.binarySearch(searArr, countrySearch) >=0){
			System.out.println("\'"+countrySearch+"\'"+"Country Available in Countries Array");
		}
		else{
			System.out.println("\'"+countrySearch+"\'"+"Country Not Available in Countries Array");
		}
	
	}
	public static void main(String[] args) {
		String[] countries = new String[] { "India", "China", "US", "UK",
				"Japan", "Pak", "SriLanka", "RSA", "Austrilia", "NZ" };
		searchArray(countries,"China");
	}
}
