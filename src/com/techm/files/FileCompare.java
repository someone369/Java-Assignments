package com.techm.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Program for Compare 2 files
 * @author CP00421684
 *
 */
public class FileCompare {

	String strLine1=null;
	String strLine2=null;
	boolean isSameContentAvailable=true;
	
	@SuppressWarnings("resource")
	 void compareTwoFiles(String file1,String file2) throws IOException{
		File f1 = new File(file1);
		FileReader fR1 = new FileReader(f1);
		
		File f2 = new File(file2);
		FileReader fR2 = new FileReader(f2);

		BufferedReader br1 = new BufferedReader(fR1);
		BufferedReader br2 = new BufferedReader(fR2);
		 
		strLine1=null;
		strLine2=null;
		
		
		while ((strLine1 = br1.readLine()) != null && (strLine2 = br2.readLine()) != null) {
		      if(!(strLine1.equalsIgnoreCase(strLine2))){
		    	  isSameContentAvailable=false;
		          break;
		      }
		}
		
		if(isSameContentAvailable){
	    	  System.out.println("Two Files are having Same content");
	      }
	      else{
	    	  System.out.println("Content is different in Two Files");
	      }
	}
	
	public static void main(String[] args) throws IOException {
		String file1 = System.getProperty("user.dir")+File.separator+"SampleFiles"+File.separator+"compare1.txt";
		String file2 = System.getProperty("user.dir")+File.separator+"SampleFiles"+File.separator+"compare2.txt";
		FileCompare fc=new FileCompare();
		fc.compareTwoFiles(file1, file2);
	}

}
