package days20;

import java.util.Date;

public class Ex02_02 {
	public static void main(String[] args) {
		Date d = new Date(2023-1900, 8-1, 9);
		System.out.println(d.toLocaleString()); // 2023. 8. 9. 오전 12:00:00
		
		
		Date today = new Date();
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		
		System.out.println(d.getTime()); // 1691506800000
		System.out.println(today.getTime()); // 1691506800410
		
		System.out.println(d.equals(today)); // false - ms값 비교
		System.out.println(d.after(today)); // false
		System.out.println(d.before(today)); // true
		
		long tgt = today.getTime();
		System.out.println(tgt/1000*1000); // 1691506800000
		today = new Date(tgt/1000*1000);
		
		System.out.println(d.equals(today)); // true - ms값 비교
		System.out.println(d.after(today)); // false
		System.out.println(d.before(today)); // false
		
		
		System.out.println(today.toLocaleString()); // 2023. 8. 9. 오전 12:00:00
		
		/*
		// [1]
		int index = d.toLocaleString().lastIndexOf(".");

		String s1 = d.toLocaleString().substring(0,index);
		String s2 = today.toLocaleString().substring(0,index);
		
		System.out.println(s1.equals(s2)); // true
		*/
	}
}
