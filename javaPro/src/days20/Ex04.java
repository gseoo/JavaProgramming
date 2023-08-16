package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex04 {
	public static void main(String[] args) {
		// jdk 1.1 Calendar 추상클래스 - 날짜, 시간
		// Calendar c = new Calendar(); -> 불가능(추상클래스라서)
		
		// Calendar c = new GregorianCalendar();
		Calendar c = Calendar.getInstance();
		//c.add(int field, -2);
		// c.clear(시간, 분, 초); == d.setHours(0);
		
		System.out.println(c.get(Calendar.YEAR));// 2023(년)
		System.out.println(c.get(Calendar.MONTH) + 1); // 8(월)
		
		System.out.println(c.get(Calendar.DATE));// 9(일)
		System.out.println(c.get(Calendar.DAY_OF_MONTH));// 9(일) - 그 달에서 몇 번째 날이냐
		
		System.out.println(c.get(Calendar.HOUR));// 11(시) - 12시간 기준(0-11)
		System.out.println(c.get(Calendar.HOUR_OF_DAY));// 11(시) - 24시간 기준(0-23)
		
		System.out.println(c.get(Calendar.MINUTE));// 46(분)
		System.out.println(c.get(Calendar.SECOND));// 6(초)
		System.out.println(c.get(Calendar.MILLISECOND));// 728(ms)
		
		// 1(일), 2(월), 3(화), 4(수), 5(목), 6(금), 7(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));// 4(요일) - 수
		
		System.out.println(c.get(Calendar.AM)); // 1 - 오전 맞음
		System.out.println(c.get(Calendar.AM_PM)); // 0 - 오전(0)인지 오후(1)인지 확인
		
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 221 - 올해에서 며칠째인지
		System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // 2 - 해당 월의 몇째 주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR)); // 32 - 해당 년의 몇째 주
	}
}
