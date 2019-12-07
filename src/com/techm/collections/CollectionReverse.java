package com.techm.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Program for Collection Reverse
 * @author CP00421684
 *
 */
public class CollectionReverse {
	
	public static void reverseCollection(String []input){
		List<String> alphabets=Arrays.asList(input);
		System.out.println("Before Collection Reverse");
		for(String albhabet:alphabets){
			System.out.println(albhabet);
		}
		Collections.reverse(alphabets);
		System.out.println("After Collection Reverse");
		for(String albhabet:alphabets){
			System.out.println(albhabet);
		}
	}
	
	public static void main(String[] args) {
		String[] alphabets = { "A", "B", "C", "D", "E" };
		reverseCollection(alphabets);
	}

}
