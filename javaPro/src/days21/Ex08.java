package days21;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Ex08 {
	public static void main(String[] args) {
		// 이번 달이 마지막 날짜 며칠까지 있는지?
		// 1. Date
		Date d = new Date();
		Date d2 = new Date(d.getYear(),d.getMonth()+1,1);
		d2.setDate(d2.getDate()-1);
		System.out.println(d2.getDate());
		
		// 2. Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		// 3. LocalDate
		LocalDate ld = LocalDate.now();
		System.out.println(ld.lengthOfMonth());
		
		LocalDate lastDay = ld.withDayOfMonth(ld.lengthOfMonth());
		System.out.println(lastDay);
		
		LocalDate l = LocalDate.now();
		LocalDate last = l.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(last);
		
		String source = "2009-12-30";
		LocalDate dd = LocalDate.parse(source);
		System.out.println(dd);
	}
}
