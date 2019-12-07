package com.techm.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * Program for Add days to Current date
 * @author CP00421684
 *
 */
public class DateAddition {

	public static void addDaysToCurrentDate( int daysToAdd){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		
		c.add(Calendar.DATE, daysToAdd); 
		String output = sdf.format(c.getTime());
		System.out.println(daysToAdd+" days added to Current Date "+output);
	}
	public static void main(String[] args) {
		addDaysToCurrentDate(45);
	}

}
