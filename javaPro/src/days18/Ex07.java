package days18;

public class Ex07 {
	public static void main(String[] args) {

		// [객체로부터 Class 타입의 객체를 얻어오는 3가지 방법]
		
		// 1. Object의 getClass() 메소드
		Card card1 = new Card("HEART", 3);
		Class cls = card1.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		
		
		
		/*
		// 2. 클래스명.class 클래스 변수가 제공됨
		Class cls = Card.class;
		System.out.println(cls);
		
		// => Class cls를 얻어와서 객체 생성
		try {
			Card card2 = (Card) cls.newInstance();
			System.out.println(cls);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		
		/*
		// 3. Class 클래스의 static 메소드 - forName()
		String className = "days18.Card";
		try {
			Class cls = Class.forName(className);
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/

	}
}

final class Card {
	String kind; // 카드 종류
	int num; // 카드 번호
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}