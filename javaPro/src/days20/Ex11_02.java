package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11_02 {
	public static void main(String[] args) {
		// java.time 핵심 클래스 사용
		
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // 2023-08-09
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt); // 15:49:08.677466900
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2023-08-09T15:49:45.090921200
		*/
		
		LocalDate ld = LocalDate.of(2015,11,23);
		System.out.println(ld); // 2015-11-23
		
		LocalTime lt = LocalTime.of(12, 30);
		System.out.println(lt); // 12:30
		
		LocalDateTime ldt = LocalDateTime.of(2023,03,29, 12,30);
		System.out.println(ldt); // 2023-03-29T12:30
	}
}
