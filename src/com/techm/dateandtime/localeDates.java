package com.techm.dateandtime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Program for Dates in Different locale
 * @author CP00421684
 *
 */
public class localeDates {

	public static void datesLocale(Locale ob) {
		DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM, ob);
		String text = format.format(new Date());
		System.out.println(ob+"-->"+text);
		
	}
	public static void main(String[] args) {
		datesLocale(Locale.US);
		datesLocale(Locale.CANADA);
		datesLocale(Locale.GERMAN);
		datesLocale(Locale.TAIWAN);
	}

}
