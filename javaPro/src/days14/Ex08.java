package days14;

public class Ex08 {
	public static void main(String[] args) {
		Math.random();
		Math.abs(0);
		Math.pow(0, 0);
		Math.max(0, 0);	
		Math.min(0, 0);
		
		// Math 클래스의 모든 필드, 메소드는 static 필드, 메소드이다.
		// 객체를 생성하지 않고 클래스명.필드명, 클래스명.메소드명()으로 사용 가능
		
		// 인스턴스 변수, 인스턴스 메소드를 사용할 일이 없음
		
		// 메소드 안에서 인스턴스 변수, 인스턴스 메소드를 사용하지 않는다면 static을 붙일지 고려해야 됨
		// 객체가 공유할지 여부 판단 ? 클래스명. 공유해서 사용...
	}
}
