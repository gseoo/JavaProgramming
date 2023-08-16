package days13;

// Tv 클래스 선언
public class Tv {

// private class Tv {
// Illegal modifier for the class Tv; only public, abstract & final are permitted

	// 멤버
	// 멤버변수(필드) - 초기화하지 않으면 각 자료형의 기본값으로 초기화되어져 있음
	// 선언 형식 : [접근지정자] [기타제어자] 자료형 필드명 [=초기화];
	public String color = null;
	public boolean power = false;
	public int channel = 0;;
	
	// 멤버함수 (메소드)
	public void powerOnOff() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
}
