package days16;

public class Ex03 {
	public static void main(String[] args) {
		final double PI = 3.141592;
		
		FinalTest obj = new FinalTest();
		System.out.println(obj.PI);
		
		// The final field FinalTest.PI cannot be assigned : 할당될 수 없음
		// 상수로 선언되었기 때문에
		// obj.PI = 3.14; 
	}
}

/*
class Parent {
	// 재정의할 수 없는 최종 메소드
	final void dispA() {
		
	}
}

class Child extends Parent {
	
//	// Cannot override the final method from Parent
//	@Override
//	void dispA() {
//		
//	}
	
}
*/

class FinalTest {
	
	// 상수 필드
	//public final double PI = 3.141592; // 명시적 초기화
	
	// public static final double PI = 3.141592; 
	// 객체를 생성하지 않고도 클래스명으로 접근할 수 있게 함 + 상수 선언
	
	// The blank final field PI may not have been initialized : 초기화되지 않음
	final double PI;
	/*
	{ // 인스턴스 초기화 블럭
		PI = 3.14;
	}
	*/
	
	public FinalTest() { // 생성자 초기화
		PI = 3.14;
	}
	
	// int value : (이 함수 안에서 사용하는)지역변수, 매개변수 다 가능
	public void finalTest(final int value) {
		// value++; X
		// value = 1000; X
	}
}


