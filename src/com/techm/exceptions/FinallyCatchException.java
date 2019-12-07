package com.techm.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyCatchException {

	public static void openFile(){
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\CP00421684\\Desktop\\demo3.txt");
            int i=0;
            while(i != -1){
                i = reader.read();
                System.out.println("file data"+(char) i );
            }
        }catch (FileNotFoundException fe) {
            System.out.println("Exp Msg-->"+fe.getMessage());
            fe.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("*****File Operation Done*******");
        }
	}
	
	public static void main(String[] args) {
		openFile();

	}

}
