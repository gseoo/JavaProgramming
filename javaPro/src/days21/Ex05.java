package days21;

import java.time.LocalDate;

public class Ex05 {
	public static void main(String[] args) {
		// plusXXX(), plus(), minusXXX(), minus()
		// 날짜와 시간 비교 : isAfter(), isBefore(), isEqual()
		
		// 오늘이 생일인지 확인 (1999.8.10)
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1999, 8, 10);
		birth = birth.withYear(today.getYear());
		
		System.out.println(today.isBefore(birth)); // false
		System.out.println(today.isEqual(birth)); // true
		System.out.println(today.isAfter(birth)); // false
		
		// 양수, 같으면 0, 음수
		System.out.println(today.compareTo(birth)); 
	}
}
