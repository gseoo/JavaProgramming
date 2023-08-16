package days22;

import java.time.LocalDateTime;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2023,8,10, 9,00,00);
		LocalDateTime end = LocalDateTime.of(2023,8,15, 18,00,00);
		LocalDateTime now = LocalDateTime.now();
		
		if(now.isAfter(end) || now.isBefore(start))
			System.out.println("불가능");
		else
			System.out.println("가능");	
	}
}
