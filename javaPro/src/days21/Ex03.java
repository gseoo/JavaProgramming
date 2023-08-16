package days21;

import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		Date eday = new Date(2023-1900,12-1,27);
		Date today = new Date();
		
		dispDiffDays(today, eday);	
	}
	
	public static void dispDiffDays(Date sday, Date today) {
		long diff = today.getTime() - sday.getTime();
		
		long 몫 = diff/(1000*60*60*24);
		System.out.printf("%d일 ", 몫);
		diff %= (1000*60*60*24);
		
		몫 = diff/(1000*60*60);
		System.out.printf("%d시간 ", 몫);
		diff %= (1000*60*60);
		
		몫 = diff/(1000*60);
		System.out.printf("%d분 ", 몫);
		diff %= (1000*60);
		
		몫 = diff/(1000);
		System.out.printf("%d초 ", 몫);
		diff %= (1000);
		
		몫 = diff/1;
		System.out.printf("%d밀초\n", 몫);
	}
}
