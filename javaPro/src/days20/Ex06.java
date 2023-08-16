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
public class Ex06 {
	public static void main(String[] args) {
		// 2023.8 달력 그리기
		Calendar c = new GregorianCalendar(2023, 8-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 8월 1일의 요일
		c.add(Calendar.DATE, -dayOfWeek+1);
		
		
		System.out.println(getPatternDate(c, "yyyy-MM-dd"));
	}
	
	public static String getPatternDate(Calendar c, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = c.getTime();
		return sdf.format(d);
	}
}
