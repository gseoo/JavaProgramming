package days20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class Ex12 {
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		//LocalDate d = LocalDate.of(2023,8,9);
		//LocalDate d = LocalDate.ofYearDay(2023, 365); // 2023년 중에 365일째 날짜 구하기
		System.out.println(d); // 2023-08-09
		
		// 년
		System.out.println(d.getYear()); // 2023
		System.out.println(d.get(ChronoField.YEAR)); // 2023
		
		// 월
		// Type mismatch: cannot convert from Month to int
		// Month : Enum 자료형
		Month emonth = d.getMonth();
		System.out.println(emonth); // AUGUST
		
		int month = d.getMonthValue();
		System.out.println(month); // 8
		
		month = d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month); // 8
		
		// 일
		int day = d.getDayOfMonth();
		System.out.println(day); // 9
		
		day = d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day); // 9
		
		
		LocalTime lt = LocalTime.now();
		// 시간
		int hour = lt.getHour();
		System.out.println(hour); // 16
		
		hour = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println(hour); // 16
		
		// 분
		int min = lt.getMinute();
		System.out.println(min); // 37
		
		min = lt.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(min); // 37
		
		// 초
		int sec = lt.getSecond();
		System.out.println(sec); // 13
		
		sec = lt.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(sec); // 13
		
		// 나노세컨드
		int n = lt.getNano();
		System.out.println(n); // 368136400
		
		// 요일
		DayOfWeek dof = d.getDayOfWeek();
		System.out.println(dof); // WEDNESDAY
		System.out.println(dof.getValue()); // 3
	}
}
