package com.techm.exceptions;


/**
 * Program for Write code to handle the exception hierarchies
 * @author CP00421684
 *
 */
public class ExceptionHierachies {

	public static void expHandTryCatch(){
		 int a = 10;
		 int  b = 0;
		  try {
		   int result  = a / b;
		    System.out.println("Result = " + result);
		  }
		  catch (ArithmeticException e) {
		    System.out.println("Exception caught: Division by zero.");
		  }
	}
	
	public static int getStringSize(String str) throws Exception{
        if(str == null){
            throw new Exception("String input is null");
        }
        return str.length();
    }

	
	public static void main(String[] args) throws Exception {
		expHandTryCatch();
		getStringSize(null);
		
	}

}
