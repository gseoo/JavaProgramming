package days20;

import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.printf("년도를 입력하세요 >> ");
			int year = sc.nextInt();
			int month = 1;
			Date d = new Date(year-1900,month-1,1);

			for(int i=1; i<=12; i++) {
				int lastDay = getLastDay(year,month++);
				System.out.printf("%d월 : %d일\n", i, lastDay );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month, 1);
		int date = d.getDate() - 1;
		d.setDate(date);
		return d.getDate();
	}
}
