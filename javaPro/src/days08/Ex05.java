package days08;

import java.util.Calendar;

// 년도를 입력받아서 윤년/평년을 체크하는 코딩
// 년도를 매개변수로 받아서 윤년/평년을 boolean으로 반환하는 함수 선언

public class Ex05 {
	public static void main(String[] args) {
		
		// 2000~올해까지 윤년/평년 체크 (캘린더 함수 암기)
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);
		for(int i=2000; i<=thisYear; i++) {
			System.out.printf("%d(%s) ", i, isLeapYear(i) ? "윤년" : "평년");
		}

	}
	
	// 윤년 true	LeapYear
	// 평년 false	CommonYear
//	1. 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. 
//	2. 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. 
//	3. 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. 
	public static boolean isLeapYear(int year) {
		if (year%4==0 && year%100!=0 || year%400==0)
			return true;
		else
			return false;
	}
	
}

