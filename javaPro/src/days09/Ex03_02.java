package days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03_02 {
	public static void main(String[] args) {

		// 주민등록번호 -> 나이 구하기
		// 세는 나이 countingAge 
		// 만나이 AmericanAge
		
		String rrn = "990123-1700001";
		int age = 0;
		age = getCountingAge(rrn);
		System.out.println("> 세는 나이 : " + age);
		age = getAmericanAge(rrn);
		System.out.println("> 만 나이 : " + age);
		
		// 2019.12.31
		// 세는 나이 : 
		
		
	}
	
	private static int getAmericanAge(String rrn) {
		// 생일이 지남 여부 체크
		// 생일이 지나지 않았다면 -1
		// 만나이 = 올해년도 - 생일년도 (-1)
		//          = 세는 나이 -1         생일?(-1)
		
		// 오늘날짜(725) - 생일(123) >= 0  -> 생일 지남
		// 										else     -> -1
		
		int birthMMdd = Integer.parseInt(getBirth(rrn).substring(4).replace(".", ""));
		
		/*
		// [1] Calender 클래스 사용
		Calendar c = Calendar.getInstance();
		int thisMonth = c.get(Calendar.MONTH);
		int thisDay = c.get(Calendar.DATE);
		int thisMMdd = thisMonth * 100 + thisDay;
		*/
		
		/*
		// [2] Date 클래스 사용
		Date d = new Date();
		int thisMonth = d.getMonth() + 1; //1월(0)  12월(11)
		int thisDay = d.getDate();
		int thisMMdd = thisMonth * 100 + thisDay;
		*/
		
		
		// [3] SimpleDateFormat
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
		int thisMMdd = Integer.parseInt(sdf.format(d));
		
		
		boolean flag = thisMMdd - birthMMdd >= 0; // true -> 생일 지남
		
		int americanAge = getCountingAge(rrn) -1 + (flag ? 0 : -1);

		return americanAge;
	}

	private static int getCountingAge(String rrn) {
		// 올해 년도(2023), 생일 년도(1999) 필요
		// 세는 나이 = 올해년도 - 생일년도 + 1
		
		/*
		// [1] calendar 클래스 활용
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);
		*/
		
		// [2]
		Date d = new Date();
		int thisYear = d.getYear() + 1900;
		
		// 생일 1999년도
		int birthYear = Integer.parseInt(getBirth(rrn).substring(0,4));
		
		int countingAge = thisYear - birthYear + 1;
		return countingAge;
	}

	// 성별에 해당되는 ㅅ을 돌려주는 함수
	public static int getGender(String rrn) {
		//return Integer.parseInt(rrn.substring(7,8));
		return rrn.charAt(7)-'0';  // '0' = 48
	}

	public static String getBirth(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));
		int month =Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));
		int ㅅ = getGender(rrn);
		
		int centry = 1800;
		switch (ㅅ) {
		case 1: case 2: case 5: case 6:
			centry = 1900; break;
		case 3: case 4: case 7: case 8:
			centry = 2000; break;
		case 9: case 0:
			centry = 1800; break;
		}
		year = centry + year;
		String birthday = String.format("%d.%d.%d", year, month, day);
		
		return birthday;
	}
}
