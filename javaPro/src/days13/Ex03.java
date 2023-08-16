package days13;

public class Ex03 {
	public static void main(String[] args) {
		// 1. Tv 클래스 선언 - Tv.java
		// 2. Tv 객체 생성
		Tv tv1 = null; // 객체 생성
		tv1 = new Tv(); // 생성된 객체에 주소 할당
		// 클래스 사용할 때 NullPointException 많이 발생
		// java.lang.NullPointerException
		
		// 멤버를 가리킬 때
		// 객체명.필드명 or 객체명.메소드명();
		tv1.powerOnOff();
		System.out.println("Tv : " +( tv1.power ? "ON" : "OFF"));
		tv1.channelUp();
		System.out.println("현재 채널 : " + tv1.channel);
		tv1.powerOnOff();
		System.out.println("Tv : " +( tv1.power ? "ON" : "OFF"));
		System.out.println("end");
	}
}
