package days15;

import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 단일 상속
		// 다중 상속 : 자바는 다중 상속 지원 x -> 인터페이스로 대체
		
		/*
		// [오버라이딩 주의사항]
		1. 정의 : 부모클래스로부터 상속받은 메소드를 재정의하는 것
		2. override 사전적 의미 = overwrite = 위에 덮어쓰다
		3. 오버라이딩의 조건
			1) 메소드명 수정 X
			2) 매개변수 동일
			3) 리턴타입 동일
			4) 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 된다.
			5) 부모의 메소드보다 많은 수의 예외를 선언할 수 없다.
			6) 인스턴스 메소드 <-> static 메소드 변경 X
		*/
	}
}

class Parent {
	public int print(String n, int a) throws IOException, NullPointerException {
		return 100;
	}
	
}

class Child extends Parent {
	// The method print(String) of type Child must override or implement a supertype method
	// Cannot reduce the visibility of the inherited method from Parent
	@Override
	public int print(String n, int a) throws IOException, NullPointerException {
		return 200;
	}
}