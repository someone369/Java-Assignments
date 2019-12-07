package com.techm.dateandtime;

import java.util.Calendar;

/**
 * Program for Difference in Dates
 * @author CP00421684
 *
 */
public class DateDiff {

	
	public static void diffInDate(){
		Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        
        cal1.set(2014, 06, 24);
        cal2.set(2015, 06, 24);
        
       // Get the represented date in milliseconds
        long milis1 = cal1.getTimeInMillis();
        long milis2 = cal2.getTimeInMillis();
        
        // Calculate difference in milliseconds
        long diff = milis2 - milis1;
        
        // Calculate difference in seconds
        long diffSeconds = diff / 1000;
        
        // Calculate difference in minutes
        long diffMinutes = diff / (60 * 1000);
        
        // Calculate difference in hours
        long diffHours = diff / (60 * 60 * 1000);
        
        // Calculate difference in days
        long diffDays = diff / (24 * 60 * 60 * 1000);
        
        System.out.println("In milliseconds: " + diff + " milliseconds.");
        System.out.println("In seconds: " + diffSeconds + " seconds.");
        System.out.println("In minutes: " + diffMinutes + " minutes.");
        System.out.println("In hours: " + diffHours + " hours.");
        System.out.println("In days: " + diffDays + " days.");
	}
	
	public static void main(String[] args) {
		diffInDate();
	}
}
