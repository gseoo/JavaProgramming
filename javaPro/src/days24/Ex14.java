package days24;

public class Ex14 {
	public static void main(String[] args) {
		// [열거형(enums)]
		// : 서로 관련된 상수를 편리하게 사용하기 위한 것
		// 2. 표준화가 되어 있지 않으면 유지보수가 어려움
		// 3. 선언 형식
		// 	  enum 열거형이름 { 상수명, 상수명, ... };
		// 4. 열거형 -> 컴파일 될 때 -> 일종의 클래스
		// 5. 열거형의 부모클래스는 java.lang.Enum 클래스
		// 6. 열거형을 사용하는 방법 : 열거형 이름.상수명
		
		// 7. Enum 클래스의 메소드
		//	  1) name() : 열거형 상수 이름을 문자열로 반환
		//    2) ordinal() : 열거형 상수가 정의된 순서 반환
		// 	  3) valueOf() : 열거형의 이름과 일치하는 열거형 상수 반환
		//    4) getDeclaringClass() : 열거형의 class 객체 반환
		
		Card[] cards = Card.values();
		for (Card card : cards) {
			System.out.printf("%s\t%d\n", card.name(), card.ordinal());
		}
		
		System.out.println(Card.valueOf("HEART"));
		
		switch (Card.valueOf("HEART")) {
		case CLOVER: break;
		case DIAMOND: break;
		case HEART: System.out.println("하트"); break;
		case SPADE: break;
		}
	}
}
