package com.techm.dateandtime;

import java.text.DateFormat;
import java.util.Date;

/**
 * Program for Display date in Long Format
 * @author CP00421684
 *
 */
public class LongDisplayDate {

	public static void longDisplayDate(){
		Date now = new Date();
		System.out.println("Date in Long Format with AM/PM Added-->"+DateFormat.getDateTimeInstance().format(now));
	}
	
	public static void main(String[] args) {
		longDisplayDate();

	}

}
