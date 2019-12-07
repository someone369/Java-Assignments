package com.techm.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	
	FileReader fileRead=null;
	FileWriter fileWrite = null;
	BufferedReader bufReader=null;
	BufferedWriter bufWriter=null;
	
	void copyExistFileToAnother(String inputFile){
		
		try {
			File srcFile =new File(inputFile);
			fileRead = new FileReader(srcFile);
			bufReader = new BufferedReader(fileRead);
			File dir=new File(System.getProperty("user.dir")+File.separator+"SampleFiles");
			if(!dir.exists()){
			    dir.mkdir();}
			
			String fileName="NewlyCreated";
			File tagFile=new File(dir,fileName+".txt");
			System.out.println("targetFile-->"+tagFile);
			if(!tagFile.exists()){
			tagFile.createNewFile();
			}
			
			fileWrite = new FileWriter(tagFile);
			bufWriter = new BufferedWriter(fileWrite);
			String srcContent=null;
			while ((srcContent = bufReader.readLine()) != null) {
				bufWriter.write(srcContent);
				bufWriter.flush();
			}
			System.out.println("File Copied Successfully");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Available-->"+e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
    	    try {
    	    	if(bufWriter!=null){
    	    		bufWriter.close();
    	    	}
    	    	
    	    	if(fileWrite!=null){
    	    		fileWrite.close();
    	    	}
    	    	
    	    	if(bufReader!=null){
    	    		bufReader.close();
    	    	}
    	    	
    	    	if(fileRead!=null){
    	    		fileRead.close();
    	    	}
    	    	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		String inputFile=System.getProperty("user.dir")+File.separator+"SampleFiles"+File.separator+"source.txt";
		FileCopy existToAnother=new FileCopy();
		existToAnother.copyExistFileToAnother(inputFile);
	}

}
