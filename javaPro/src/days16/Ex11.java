package days16;

public class Ex11 {
	public static void main(String[] args) {
		// [default 메소드]
		// 5년 지난 후 IA 인터페이스에 testXX() 추상 메소드를 추가하려고 함
		
		// 1) 여러 인터페이스를 구현하면 디폴트 메소드 충돌
		//	  => 클래스에서 충돌되는 디폴트 메소드를 오버라이딩하면 해결
		// 2) 조상 클래스의 메소드와 인터페이스의 디폴트 메소드 충돌
		//	  => 충돌되는 디폴트 메소드는 무시 (조상 클래스의 메소드가 우선시 됨)
		
	}
}

interface IA {
	// 3개의 추상 메소드
	
	default void testXX() {
		
	}
}

// IA 인터페이스를 implement한 클래스가 200개 있음

interface IB extends IA {
	// IA의 3개의 추상 메소드
	// 2개의 추상 메소드
}

//IB 인터페이스를 implement한 클래스가 300개 있음

interface IC extends IB {
	// IA의 3개의 추상 메소드
	// IB의 2개의 추상 메소드
	// 5개의 추상 메소드
}

//IC 인터페이스를 implement한 클래스가 400개 있음

interface ID extends IC {
	// IA의 3개의 추상 메소드
	// IB의 2개의 추상 메소드
	// IC의 5개의 추상 메소드
	// 1개의 추상 메소드
}

//ID 인터페이스를 implement한 클래스가 100개 있음