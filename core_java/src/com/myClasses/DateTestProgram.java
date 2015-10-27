package com.myClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTestProgram {

	public static void main(String[] args) throws ParseException {
		
		//Date Formats
		//		yyyy-MM-dd           	(2015-12-31)
		//		dd-MM-YYYY           		(31-10-2015)
		//		yyyy-MM-dd HH:mm:ss  		(2015-12-31 23:59:59)
		//		HH:mm:ss.SSS         		(23:59.59.999)
		//		yyyy-MM-dd HH:mm:ss.SSS   	(2015-12-31 23:59:59.999)
		//		yyyy-MM-dd HH:mm:ss.SSS Z   (2015-12-31 23:59:59.999 +0100) 
		
		//convert Date to String
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String date = sdf.format(new Date());
		System.out.println(date); //Prints 26/10/2015
		
		//Convert String to Date
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "15-10-2015 10:20:56";
		Date date1 = sdf1.parse(dateInString);
		System.out.println(date1); //Prints Tue Oct 15 10:20:56 SGT 2015
		
		//Get Current Date
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS ");
		System.out.println(sdf2.format(new Date()));
		
		//Convert Calender to Date
		
		Calendar calendar = Calendar.getInstance();
		Date date2 = calendar.getTime();
		System.out.println(date2);
		
		//Compare two Dates
		Date d1 = new Date();
		Date d2 = new Date();
		
		System.out.println(d1.compareTo(d2));
		
		//Get year, month, day of month
		
		Calendar gregCalendar = new GregorianCalendar();
		 
		int year       = gregCalendar.get(Calendar.YEAR);
		int month      = gregCalendar.get(Calendar.MONTH);
		int dayOfMonth = gregCalendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
		int dayOfWeek  = gregCalendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = gregCalendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= gregCalendar.get(Calendar.WEEK_OF_MONTH);
		 
		int hour       = gregCalendar.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = gregCalendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = gregCalendar.get(Calendar.MINUTE);
		int second     = gregCalendar.get(Calendar.SECOND);
		int millisecond= gregCalendar.get(Calendar.MILLISECOND);

	}

}
