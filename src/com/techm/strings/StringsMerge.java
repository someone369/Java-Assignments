package com.techm.strings;

/**
 * Program for Merge two Strings
 * @author CP00421684
 *
 */
public class StringsMerge {

	static void mergeStrings(String s1, String s2){
		String s3=s1.concat(s2);
		System.out.println("Merged two Strings-->"+s3);
	}
	
	public static void main(String[] args) {
		String str1="tech";
		String str2="mahindra";
		mergeStrings(str1,str2);		
	}

}
