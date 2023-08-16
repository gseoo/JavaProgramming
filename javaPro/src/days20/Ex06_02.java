package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 이경서
 * @date 2023. 8. 9. - 오후 12:46:46
 * @subject add() set() roll() 차이점
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		// 2023.8 달력 그리기
		Calendar c = new GregorianCalendar(2023, 8-1, 1);
		
		/*
		// 해당 숫자로 날짜를 설정
		c.set(Calendar.DATE, -1); // 2023-07-30
		c.set(Calendar.DATE, 0); // 2023-07-31
		c.set(Calendar.DATE, 10); // 2023-08-10
		c.set(Calendar.DATE, 33); // 2023-09-01
		*/
		
		// c 날짜 기준으로 감소, 증가
		c.add(Calendar.DATE, -1); // c 날짜 - 1
		c.add(Calendar.DATE, 1); // c 날짜 + 1
		
		c.roll(Calendar.DATE, -1); // 월은 변하지 않고 날짜만 변함
		
		System.out.println(getPatternDate(c, "yyyy-MM-dd")); 
		
	}
	
	public static String getPatternDate(Calendar c, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = c.getTime();
		return sdf.format(d);
	}
}
