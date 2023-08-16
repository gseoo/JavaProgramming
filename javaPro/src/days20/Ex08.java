package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 이경서
 * @date 2023. 8. 9. - 오후 2:33:28
 * @subject 형식화 클래스
 * @content <DecimalFormat>
 * 			format() 숫자 -> 원하는 형식의 문자열
 * 			parse() 문자열 -> 숫자
 * 			
 * 			<SimpleDateFormat>
 * 			format() 날짜 -> 원하는 형식의 문자열
 * 			parse() 문자열 -> 날짜
 */
public class Ex08 {
	public static void main(String[] args) {
		// 23년 8월 9일 "수요일"
		// 위 문자열을 날짜(Date, Calendar)로 변환시키기
		
		
		String strDate = "23년 8월 9일 (수요일)";
		String pattern = "yy년 MM월 dd일 (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d = sdf.parse(strDate);
			System.out.println(d.toLocaleString());
			
			/*
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			System.out.println(Ex05.getPatternDate(c, pattern));
			*/
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
