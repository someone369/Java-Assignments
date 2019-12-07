package com.techm.files;

import java.io.File;

/**
 * Program for Rename File
 * @author CP00421684
 *
 */
public class FileRename {

	
	static void fileRename(){
		File file = null;
		String currentDir = System.getProperty("user.dir")+File.separator+"SampleFiles"+File.separator+"test.txt";
		System.out.println("Current File Availability Path-->"+currentDir);
		File renameFileDir =new File(System.getProperty("user.dir")+File.separator+"SampleFiles"+File.separator+"testRename.txt");
		
	    boolean isFileAvailable = false;
	      try{
	    	  file = new File(currentDir);
	         isFileAvailable = file.exists();
	         System.out.println("File exists: "+isFileAvailable);
	         if(isFileAvailable == true)
	         {
	        	 file.renameTo(renameFileDir);
	        	System.out.println("Renamed File");
	         }
	         else{
	        	 System.out.println("\'"+file.getName()+"\'"+" File is Not Available to Rename");
	         }
	         
	 }catch(Exception e){
        e.printStackTrace();
     }
	}
	
	public static void main(String[] args) {
		fileRename();
	}

}
