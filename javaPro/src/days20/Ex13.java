package days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex13 {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d); // 2023-08-09
		
		d.withYear(2020); // 변경 안 됨 - 불변 객체
		System.out.println(d); // 2023-08-09
		
		d = d.withYear(2021);
		d = d.withMonth(5);
		d = d.withDayOfMonth(11);
		System.out.println(d); // 2021-05-11
		
		d = d.with(ChronoField.YEAR,2025);
		d = d.with(ChronoField.MONTH_OF_YEAR,12);
		d = d.with(ChronoField.DAY_OF_MONTH,25);
		System.out.println(d); // 2025-12-25
		
		String a = "xyzz";
		String b = a.replace('x', 't');
		System.out.println(b);
	}
}
