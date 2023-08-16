package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex07 {
	public static void main(String[] args) {
		/*
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); // 2023-08-10T11:19:47.368257100

		// 날짜만 사용하고 싶으면?
		// truncate 절삭하다(내림)
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt); // 2023-08-10T00:00
		*/
		
		/*
		// LocalDate와 LocalTime을 활용해서 LocalDateTime 만들기 (3)
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d,t);
		
		LocalDateTime dt2 = d.atTime(t);
		
		LocalDateTime dt3 = t.atDate(d);
		*/
		
		
		LocalDateTime dt = LocalDateTime.now();
		// LocalDateTime -> LocalDate 변환
		LocalDate d = dt.toLocalDate();
		
		// LocalDateTime -> LocalTime 변환
		LocalTime t = dt.toLocalTime();
		
	}
}
