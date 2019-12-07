package com.techm.exceptions;

/**
 * Program for
 * 1.handle multiple exceptions (divide by zero)
 * 2.handle multiple exceptions (Array out of bound)
 * @author CP00421684
 *
 */
public class MultipleExceptions {

	static void handleDivideByZeroExp() {
		try{
	         int num1=30,num2=0;
	         int output=num1/num2;
	         System.out.println ("Result = " +output);
	      }catch(ArithmeticException e){
	         System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
	      }catch (NullPointerException ne) {
	    	  System.out.println ("Inputs does not be Null");
		}
	}
	
	static void handleArrayExp() {
		int a[]=new int[10];
		try{
	        a[11]=25;
	      }catch(ArrayIndexOutOfBoundsException aibe){
	         System.out.println ("ArrayIndexOutOfBoundsException: Array Declared Size Should not be Exceed");
	      }catch (NullPointerException ne) {
	    	  System.out.println ("Inputs does not be Null");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		handleDivideByZeroExp();
		handleArrayExp();

	}

}
