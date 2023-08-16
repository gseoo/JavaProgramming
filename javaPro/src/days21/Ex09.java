package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

public class Ex09 {
	public static void main(String[] args) {
		// [TemporalAdjusters 클래스]
		// 자주 사용되는 날짜, 시간 변경 메소드들을 미리 구현해 놓은 클래스
		// ex) 다음 달의 첫날, 올해의 첫날, 이번 달의 첫날,
		// 올해의 마지막 날, 이번 달의 마지막 날짜,
		// 다음(지난) 주 ?요일이 언제인지, 이번 달 n 번째 ?요일이 언제인지 etc.
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		// 다음 달의 첫 날 : 2023-09-01
		System.out.println(d.with(firstDayOfNextMonth())); 
		
		// 이번 달의 첫 날 : 2023-08-01
		System.out.println(d.with(firstDayOfMonth()));
		
		// 이번 달의 첫 번째 월요일 : 2023-08-07
		System.out.println(d.with(firstInMonth(MONDAY)));
		
		// 지난주 화요일(오늘 포함 x) : 2023-08-08
		System.out.println(d.with(previous(TUESDAY)));
		// 지난주 화요일(오늘 포함 O) : 2023-08-08
		System.out.println(d.with(previousOrSame(TUESDAY)));
		
		// 다음주 금요일(오늘 포함 x) : 2023-08-11
		System.out.println(d.with(next(FRIDAY)));
		// 다음주 금요일(오늘 포함 O) : 2023-08-11
		System.out.println(d.with(nextOrSame(FRIDAY)));
		
		// 이번 달 4번째 화요일 : 2023-08-22
		System.out.println(d.with(dayOfWeekInMonth(4,TUESDAY)));
		
		// 3일 뒤
		// d = d.plusDays(3);
		d = d.with(new DayAfter3일());
		System.out.println(d); // 2023-08-13
	}
	
	static class DayAfter3일 implements TemporalAdjuster {
		@Override
		public Temporal adjustInto(Temporal temporal) {
			return temporal.plus(3, ChronoUnit.DAYS);
		}
	}
}
