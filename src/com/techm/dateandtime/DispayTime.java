package com.techm.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Program for Display time in 24 hour Format
 * @author CP00421684
 *
 */
public class DispayTime {

	public static void displayTime(){
		Date date = new Date();
	    SimpleDateFormat simpDate;
	    simpDate = new SimpleDateFormat("hh:mm:ss");
	    System.out.println("Time in 24 hr Format-->"+simpDate.format(date));
	}
	
	
	public static void main(String[] args) {
		displayTime();
	}

}
