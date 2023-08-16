package days01;

import days13.Time;

public class Ex07_TimeTest {
	public static void main(String[] args) {
		
		// days13.Time + days01.Ex07_TimeTest
		// 패키지 외부
		Time t = new Time();
		t.hour = 1; // public - 패키지 내부, 외부 어디서나
		// t.second - X protected - 패키지 내부 or 상속관계
		// t.minute; - X default
		// t.milisecond - X private
	}
}
