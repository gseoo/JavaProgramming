package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Ex10 {
	public static void main(String[] args) {
		// Period : 날짜와 날짜 사이의 간격(차)
		// Duration : 시간과 시간 사이의 간격(차)
		// between() : static 메소드 → 객체 생성 없이 사용
		// until() : 인스턴스 메소드 → 객체 생성 후 사용
		// 변경하는 메소드 : of(), with(), plus(), minus()
		
		// 개강일
		LocalDate s = LocalDate.of(2023,7,13);
		
		// 오늘 날짜
		LocalDate t = LocalDate.now();
		t = t.plusDays(1);
		
		// 개강일, 오늘의 차
		// between(LocalDate startDateInclusive, LocalDate endDateExclusive)
		// between(s,t) = s <= p < t
		Period p = Period.between(s, t);
		
		System.out.println(p.getYears()); // 0
		System.out.println(p.get(ChronoUnit.MONTHS)); // 0
		System.out.println(p.getDays()); // 29
		
		
		// 오늘 수업 시작하고 얼마나 지났는지
		LocalTime st = LocalTime.of(9, 0);
		LocalTime tt = LocalTime.now();
		
		Duration d = Duration.between(st, tt);
		// 시간차
		long ss = d.getSeconds(); 
		System.out.println(ss); // 13363 (초)
		System.out.println(ss/60); // 222 (분)
		System.out.println(ss/(60*60)); // 3 ( 시간)
		
		/*
		// UnsupportedTemporalTypeException : 지원하지 않음
		long h = d.get(ChronoUnit.HOURS);
		System.out.println(h);
		*/
	}
}
