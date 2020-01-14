package Easy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeForMilkAndCookies(new GregorianCalendar(2013, 11, 24)));
	}

	public static boolean timeForMilkAndCookies(GregorianCalendar date) {
		boolean flag = false;
		System.out.println("Date: " + date.get(Calendar.MONTH) + " " +date.get(Calendar.DATE)  + " " + date.get(Calendar.YEAR) );
		if (date.get(Calendar.MONTH) == 11 && date.get(Calendar.DATE) == 24) {
			flag = true;
		}
		return flag;
	}
}
