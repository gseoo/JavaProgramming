package days09;

// (1) 년, 월, 1일이 무슨 요일?
// (2) 년, 월.  마지막 날짜?

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*
		int year, month;
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("> 년도 월 입력 ? ");
			year = sc.nextInt();
			month = sc.nextInt();
			
			printCalendar(year, month);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		int year = 2023;
		for(int i=1; i<=12; i++) {
			printCalendar(year, i);
		}
	}

	private static void printCalendar(int year, int month) {
	
		// 나중에 여기 1에 day를 넣으면 원하는 날짜 요일 출력 가능
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDay(year, month);
		
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(50));
		String week = "일월화수목금토";
		for(int i=0; i<week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}
		System.out.println();
		System.out.println("-".repeat(50));
		
		for(int i=0; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {
			System.out.printf("\t%d", i);
			if((i + dayOfWeek) %7==0 )
				System.out.println();
		}
		System.out.println();
		System.out.println("-".repeat(50));
		System.out.println();
		
	}

	
	private static int getDayOfWeek(int year, int month, int day) {
		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays%7;
		return dayOfWeek;
	}

	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 0;
		
		/*
		for(int i=1; i<year; i++) {
			totalDays += days08.Ex05.isLeapYear(i) ? 366 : 365;
		}
		*/
		
		totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		
		for(int i=1; i<month; i++) {
			totalDays += getLastDay(year, i);
		}
		
		totalDays++;
		
		return totalDays;
	}

	/*
	// [1]
	private static int getLastDay(int year, int month) {
		// 31일 : 1 3 5 7 8 10 12
		// 30일 : 4 6 9 11
		// 28일/29일 : 2
		int lastDay = 0;
		switch (month) {
		case 2:
			lastDay =(days08.Ex05.isLeapYear(year)) ? 29 : 28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30; break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31; break;
		}
		return lastDay;
	}
	*/
	
	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months[month-1];
		if(month ==2 && days08.Ex05.isLeapYear(year)) lastDay++;
		return lastDay;
	}
}
