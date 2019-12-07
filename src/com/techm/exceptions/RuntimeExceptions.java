package com.techm.exceptions;


/**
 * Program for code to handle the checked exceptions
 * @author CP00421684
 *
 */
public class RuntimeExceptions {

	public static void runTimeExp(){
		int a[]= new int[2];
		    a[0]=10;
		    a[1]=20;
	try 
	  {
	   System.out.println("Access invalid element"+ a[2]);
	  }catch(ArrayIndexOutOfBoundsException are){
		  are.printStackTrace();
	  }
	  finally 
	  {
	   System.out.println("finally is always executed.");
	  }
	}
	
	public static void main(String[] args) throws Exception {
		runTimeExp();
	}

}
