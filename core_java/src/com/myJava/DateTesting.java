/*package com.myJava;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import com.zafinlabs.mirev.pbe.model.Holiday;

public class DateTesting {
	
	
	

}
public static Date subtractWorkingDays(Date currentDate, Long numOfDays) {
	Date previousDate = currentDate;
	if (numOfDays != null) {
		for (int i = 1; i <= numOfDays.intValue(); i++) {
			previousDate = DateTesting.subtractDays(previousDate, 1);
			while (isTodayHoliday(previousDate)) {
				previousDate = DateTesting.subtractDays(previousDate, 1);
			}
		}
	}
	return previousDate;
}

public static Date subtractDays(Date date, int numOfDays) {
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	cal.add(Calendar.DATE, -(numOfDays)); // subtract x day
	return cal.getTime();
}

private static boolean isTodayHoliday(Date dateToCheckForHoliday) {
	Calendar cal = Calendar.getInstance();
	cal.setTime(dateToCheckForHoliday);
	int weekDay = cal.get(Calendar.DAY_OF_WEEK);

	if (weekDay == Calendar.SUNDAY || weekDay == Calendar.SATURDAY) {
		return true;
	} else {
		return isHoliday(dateToCheckForHoliday, cal);
	}

}
private static boolean isHoliday(Date dateToCheckForHoliday, Calendar cal,
		Session session) {
	List<Holiday> holidayList = (List<Holiday>) session
			.createCriteria(Holiday.class)
			.add(Expression.eq("year", cal.get(Calendar.YEAR)))
			.add(Expression.eq("month", cal.get(Calendar.MONTH) + 1))
			.add(Expression.eq("day", cal.get(Calendar.DATE))).list();
	if (holidayList != null) {
		return !(holidayList.isEmpty());
	} else {
		return false;
	}

}
*/