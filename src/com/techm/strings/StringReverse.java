package com.techm.strings;

/**
 * Program for Reverse the string using built in and not build 
 * @author CP00421684
 *
 */
public class StringReverse {

	static void strReverse(StringBuffer s1){
		System.out.println("****Using Buitin Method****");
		System.out.println(s1.reverse());
	}
	
	static void strReverseNotUsingBuiltInMethod(String revString){
		String s1 = null;
		System.out.println("****Not Using Buitin Method****");
		for ( int i = (revString.length() - 1) ; i >= 0 ; i-- ){
	         s1+=revString.charAt(i);}
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		strReverse(new StringBuffer("TechMahindra"));
		strReverseNotUsingBuiltInMethod("javaselenium");
	}

}
