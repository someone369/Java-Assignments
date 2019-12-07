package com.techm.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Program for 
 * 1.Check if file exists in specified folder
 * 2.Open the file
 * 3.Read the file
 * @author CP00421684
 *
 */
public class FileOpenRead {
	
	public static String filePath="C:/Users/CP00421684/Downloads";//demo.txt file should be available under specified path
	public static File folder = new File(filePath);
	static String temp = "";
	static String fileName="demo.txt";
	static List<String> fileContent;
	
	static void fileOpenRead(){
		System.out.println("Reading files under the folder "+ folder.getAbsolutePath());
	    listFilesForFolder(folder);
	  }
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	      if (fileEntry.isDirectory()) {
	        listFilesForFolder(fileEntry);
	      } else {
	        if (fileEntry.isFile()) {
	          temp = fileEntry.getName();
	          System.out.println("Temp File name-->"+temp);
	          if(temp.equalsIgnoreCase(fileName)){
	        	  System.out.println("\'"+fileName+"\'"+" File is Availale");
	        	  System.out.println("File path-->"+folder.getAbsolutePath()+"\\"+fileName);
	        	  fileContent=readFile(folder.getAbsolutePath()+"\\"+fileName);
	        	  System.out.println("Available Content in File "+fileContent);
	        	  break;
	          }else{
	        	  System.out.println("\'"+fileName+"\'"+" File is Not Available");
	          }
	        }
	      }
	    }
	}
	
	static  List<String> readFile(String filename)
	{
	  List<String> records = new ArrayList<String>();
	  try
	  {
	    BufferedReader reader = new BufferedReader(new FileReader(filename));
	    String line;
	    while ((line = reader.readLine()) != null)
	    {
	      records.add(line);
	    }
	    reader.close();
	    return records;
	  }
	  catch (Exception e)
	  {
	    System.err.format("Exception occurred ", filename);
	    e.printStackTrace();
	    return null;
	  }
	}
	
	public static void main(String[] args) {
		fileOpenRead();
	}

}
