package days13;

public class Ex04 {
	public static void main(String[] args) {
		
		// Tv 클래스와 Ex04 클래스는 같은 패키지 안에 있다
		Tv tv1 = new Tv();
		System.out.println(tv1.channel);
		
		// [패키지 외부] 상속 + 참조 가능한지 테스트
		
		
		// [접근지정자] 설명
		// 1. 클래스 앞의 접근지정자
		// 1) public : 패키지 내부 or 외부 어디서든 상속, 참조 가능
		// 2) default : 패키지 내부에서만 상속, 참조 가능
		
		// 독립적인 클래스로 선언할 때는 사용할 수 없는 접근지정자
		// 중접 클래스로 선언할 때 사용 가능
		// (내부 클래스 4가지 종류)
		// 3) private : 비활성 - 같은 파일 내에서만 상속, 참조 가능
		// 4) protected : 비활성 - default 기능 + 패키지 외부에서는 상속만 가능
		
		// 1-2. 클래스 앞의 기타제어자
		// abstract : 추상클래스
		// final : 최종클래스
		// static : 비활성 - 중첩클래스 선언할 때만 사용 가능
		
		
		// 2. 멤버(필드, 메소드) 앞의 접근지정자
		// 1) public
		// 2) default
		// 3) private
		// 4) protected
		
	}
}
