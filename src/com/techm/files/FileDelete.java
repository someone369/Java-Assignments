package com.techm.files;

import java.io.File;

/**
 * Program for Delete File
 * @author CP00421684
 *
 */
public class FileDelete {

	
	static void fileDelete(){
		File file = null;
		String currentDir = System.getProperty("user.dir")+File.separator+"SampleFiles"+File.separator+"demo.txt";
		System.out.println("Current File Availability Path-->"+currentDir);
	    boolean isFileAvailable = false;
	      try{
	    	 file = new File(currentDir);
	         isFileAvailable = file.exists();
	         System.out.println("File exists: "+isFileAvailable);
	         if(isFileAvailable == true)
	         {
	        	 file.delete();
	             System.out.println("File Deleted");
	         }
	         else{
	        	 System.out.println("\'"+file.getName()+"\'"+" File is Not Available to Delete");
	         }
	 }catch(Exception e){
        e.printStackTrace();
     }
	}
	
	public static void main(String[] args) {
		fileDelete();
	}

}
