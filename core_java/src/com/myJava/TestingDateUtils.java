package com.myJava;

import java.util.Calendar;
import java.util.Date;

class TestingDateUtils{
	public static final int ANNIVDATELENGTH = 5;

	public static final int LASTDATE = 31;

	public static final int LASTMONTH = 12;

	
	
	public static void main(String []args) {
		/*DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		 
		String d1="2011/02/27";
		Date d = new Date(d1);
		//System.out.println(d);
		String tod = df.format(d);*/
		String d1="2008/03/29";
		Date d = new Date(d1);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.DATE, -(numOfDays)); // subtract x day
		Date newDAte= cal.getTime();
		
		 
		System.out.println(getAnniversaryDateFromDDMM("29/03", newDAte));
		
		
	}
	
	private static Date getAnniversaryDateFromDDMM(String annvDate, Date processingDate) {

		if (annvDate == null || annvDate.length() != ANNIVDATELENGTH) {
			return null;
		}
		int indexOfSlash = annvDate.indexOf('/');
		if (indexOfSlash == -1 || indexOfSlash != 2) {
			return null;
		}

		String dayString = annvDate.substring(0, indexOfSlash);
		String monthString = annvDate.substring(indexOfSlash + 1);

		int currentYear = processingDate.getYear();
		Date newTriggerDate = null;
		try {
			int date = Integer.parseInt(dayString);
			int month = Integer.parseInt(monthString);
			int monthProcessingDate = processingDate.getMonth();
			// int dateProcessingDate =processingDate.getDate();
			if (date < 1 || date > LASTDATE) {
				return null;
			}

			if (month < 1 || month > LASTMONTH) {
				return null;
			}

			if ((monthProcessingDate + 1 > month)) {

				newTriggerDate = new Date(currentYear + 1, month - 1, date);

			} else if ((monthProcessingDate + 1 < month)) {

				newTriggerDate = new Date(currentYear, month - 1, date);

			} else if ((monthProcessingDate + 1 == month)) {

				if (processingDate.getDate() > date) {

					newTriggerDate = new Date(currentYear + 1, month - 1, date);

				} else {
					
					newTriggerDate = new Date(currentYear, month - 1, date);
					
				}

			}

			return newTriggerDate;
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
}