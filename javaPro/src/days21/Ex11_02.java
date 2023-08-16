package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex11_02 {
	public static void main(String[] args) {
		// DateTimeFormatter.parse( )
		
		String source = "2023년 08월 10일 (목)";
		
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println(d);
	}
}
