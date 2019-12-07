package com.techm.strings;

/**
 * Program for Convert one string to Upper Case and the other to Lower Case
 * @author CP00421684
 *
 */
public class StringLettersCase {

	static void lettersSensitivity(String s1, String s2){
		System.out.println("String1 In Uppercase -->"+s1.toUpperCase());
		System.out.println("String2 In Lowercase -->"+s2.toLowerCase());
	}
	
	public static void main(String[] args) {
		String str1="tech";
		String str2="MAHINDRA";
		lettersSensitivity(str1,str2);

	}

}
