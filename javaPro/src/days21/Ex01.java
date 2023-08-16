package days21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) throws ParseException {
		String source = "2023/08/10 (목) 12:23:01";
		
		String regex = "yyyy/MM/dd (E) hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(regex);
		Date d = sdf.parse(source);

		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		regex = "yyyy년 M월 d일 (E)";
		sdf = new SimpleDateFormat(regex);

		System.out.println(sdf.format(d));
	}
}