package days19;

import java.util.Date;

/**
 * @author 이경서
 * @date 2023. 8. 8. - 오후 3:28:10
 * @subject 날짜, 시간 클래스 + 형식화(formatting) 클래스
 * @content [일정관리]
 */
public class Ex11 {
	public static void main(String[] args) {
		
		// jdk 1.0	java.util.Date
		// jdk 1.1	java.util.Calendar
		// 						ㄴ GregorianCalendar
		// jdk 1.8 java.time 패키지 안에 여러 하위 패키지와 다양한 클래스 추가
		
		Date d = new Date();
		
		System.out.println(d); // Tue Aug 08 15:37:44 KST 2023
		System.out.println(d.toGMTString()); // 8 Aug 2023 06:38:08 GMT
		System.out.println(d.toLocaleString()); // 2023. 8. 8. 오후 3:40:05
		
		System.out.println(d.getYear()+1900); // 2023(년)
		System.out.println(d.getMonth()+1); // 8(월)
		System.out.println(d.getDate()); // 8(일)
		System.out.println(d.getHours()); // 15(시)
		System.out.println(d.getMinutes()); // 43(분)
		System.out.println(d.getSeconds()); // 53(초)
		System.out.println(d.getDay()); // 2(화)
		System.out.println("일월화수목금토".charAt(d.getDay())); // 화
		// 1970.1.1 00:00:00부터의 ms값을 long형으로
		System.out.println(d.getTime()); // 1691477476845
	}
}
