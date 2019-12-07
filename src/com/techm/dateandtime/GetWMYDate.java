package com.techm.dateandtime;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Program for Get Week/ Month/ Year from the date
 * @author CP00421684
 *
 */
public class GetWMYDate {

	public static void getWeekMonthYearDate() throws ParseException{
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int week = cal.get(Calendar.WEEK_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.println("Week-->"+week);
		System.out.println("Month-->"+month);
		System.out.println("year-->"+year);
	}
	public static void main(String[] args) throws ParseException {
		getWeekMonthYearDate();
	}
}
