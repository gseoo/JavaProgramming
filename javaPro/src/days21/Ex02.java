package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar(2023,7-1,13);
		System.out.printf("%d년 %d월 %d일\n",c.get(Calendar.YEAR),
				c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		
		c.add(Calendar.DATE, 100);
		System.out.printf("%d년 %d월 %d일\n",c.get(Calendar.YEAR),
				c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
		
		LocalDate ld = LocalDate.of(2023, 7, 13);
		//ld = ld.plusDays(100);
		ld = ld.plus(100, ChronoUnit.DAYS);
		System.out.println(ld.toString());
	}
}
