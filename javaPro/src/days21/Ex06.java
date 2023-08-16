package days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex06 {
	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		
		System.out.println(t.getHour()); // 11(시)
		System.out.println(t.getMinute()); // 15(분)
		System.out.println(t.getSecond()); // 50(초)
		System.out.println(t.getNano()); // 63107300(ns)
		System.out.println(t.get(ChronoField.MILLI_OF_SECOND)); // 660(ms)
	
		// 30분 후에 점심 -> 30분 후의 시간 찾기
		//t = t.plusMinutes(30);
		System.out.println(t); // 11:45:50.636683300
		
		// 10분 전 찾기
		//t = t.minusMinutes(10);
		System.out.println(t); // 11:05:50.636683300
		
		// 1시간 30분 후 찾기
		t= t.plusMinutes(90);
		System.out.println(t); // 12:35:50.636683300
	}
}
