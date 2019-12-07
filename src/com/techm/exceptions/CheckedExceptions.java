package com.techm.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Program for code to handle the checked exceptions
 * @author CP00421684
 *
 */
public class CheckedExceptions {

	public static void checkdExp(){
		FileInputStream fis = null;
		try{
		    fis = new FileInputStream("B:/myfile.txt"); 
		}catch(FileNotFoundException fnfe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		 }
		
		int k; 
		try{
		    while(( k = fis.read() ) != -1) 
		    { 
			System.out.print((char)k); 
		    } 
		    fis.close(); 
		}catch(NullPointerException np){
		    System.out.println("No File available to read  "+np);
		}catch(IOException ioe){
		    System.out.println("I/O error occurred: "+ioe);
		 }
	}
		
	
	public static void main(String[] args) throws Exception {
		checkdExp(); 
	}

}
