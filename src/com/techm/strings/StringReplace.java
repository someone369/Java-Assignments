package com.techm.strings;

/**
 * Program for Find 5 letters from 1 string and replace that with 5 characters of another string
 * @author CP00421684
 *
 */
public class StringReplace {

	static void strReplace(){
		String str1="techmahindra";
		String str2="javaselenium";
		String str1Replacement=str1.replace(str1.substring(0, 5), str2.substring(0, 5));
		System.out.println("str1 5 Characters Replaced with Another String 5 Characters "+str1Replacement);
	}
	
	public static void main(String[] args) {
		strReplace();

	}

}
