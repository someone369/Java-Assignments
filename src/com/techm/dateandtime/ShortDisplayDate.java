package com.techm.dateandtime;

import java.text.DateFormat;
import java.util.Date;

/**
 * Program For Display Date in Short Format
 * @author CP00421684
 *
 */
public class ShortDisplayDate {

	public static void shortDate() {
		Date now = new Date();
		System.out.println("Date in Short Format-->"+DateFormat.getDateInstance(DateFormat.SHORT).format(now));
	}
	
	public static void main(String[] args) {
		shortDate();
	}
}
