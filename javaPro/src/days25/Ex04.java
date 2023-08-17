package days25;

import java.util.Date;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		/*
		[어노테이션]
		1. 사전적 의미 : 주석
		2. 정의 : 프로그램의 소스코드 안에 다른 프로그램을 위한 미리 약속된 형식을 포함시킨 것
		3. jdk에서 기본적으로 제공하는 어노테이션을 표준 어노테이션이라고 함
		4. 표준 어노테이션 -> 컴파일러에 정보 제공
		   - @Override : 컴파일러에게 오버라이딩한 메소드임을 알려주는 어노테이션
		   - @SuppressWarnings : 컴파일러의 특정 경고 메시지가 나타나지 않게 사용하는 어노테이션
		   - @Deprecated : 앞으로 없어질 생성자, 필드, 메소드
		   - @FuntionInterface : 함수형 인터페이스를 알려주는 어노테이션(람다식에서 사용)
		   - @SafeVarargs : 제네릭 타입의 가변인자에 사용되는 어노테이션
		   - @Native : native 메소드에서 참조되는 상수 앞에 붙임 (c언어를 사용해서 만든 메소드)
		5. 메타 어노테이션 : 어노테이션에 사용되는 어노테이션
		   - @Target
		   - @Documented
		   - @Inherited
		   - @Retention
		   - @Repeatable
		*/
		
		// 컴파일러가 경고해줌
		// The value of the local variable sc is not used
		// The value of the local variable name is not used
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		String name = "홍길동";
		
		Date d = new Date();
		
	}

	@Override
	public String toString() {
		return "Ex04 []";
	}
	
	
}
