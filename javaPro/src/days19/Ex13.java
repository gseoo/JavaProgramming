package days19;

import java.util.Arrays;
import java.util.Date;

/**
 * @author 이경서
 * @date 2023. 8. 8. - 오후 4:18:16
 * @subject 달력 그리기 - Date 클래스
 * @content
 */
public class Ex13 {
	public static void main(String[] args) {
		int year = 2023;
		int month = 8;
		
		int dayOfWeek = getDayOfWeek(year, month, 1);
		int lastDay = getLastDay(year, month);
		
		Date today = new Date();
		String ntoday = today.toLocaleString().substring(0,11);
		
		Date d = new Date(year-1900, month-1, 1); // 2023.8.1
		int date = d.getDate() - dayOfWeek; 
		d.setDate(date);
		
		
		
		for(int i=1; i<=42; i++) {
			int m = d.getMonth() + 1; 
//			if(today.getYear() == d.getYear() && today.getMonth() == d.getMonth() && today.getDate() == d.getDate())
//				System.out.printf("[%d]\t", d.getDate());
//			else System.out.printf(m == month ? "%d\t" : "(%d)\t", d.getDate());
			
			String nd = d.toLocaleString().substring(0,11);
			
			if(ntoday.equals(nd)) System.out.printf("[%d]\t", d.getDate());
			else System.out.printf(m == month?"%d\t":"(%d)\t", d.getDate() );

			if(i%7==0) System.out.println();
			date = d.getDate() + 1;
			d.setDate(date);
		}
	}
	

	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month, 1); // 다음 달 1일
		int date = d.getDate() - 1; // 1일에서 하루를 뺌 - >전 달(구하려는 달)의 마지막 날짜
		d.setDate(date);
		return d.getDate();
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		return d.getDay(); // 0(일)~6(토)
	}
}
