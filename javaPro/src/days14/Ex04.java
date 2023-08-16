package days14;

public class Ex04 {
	public static void main(String[] args) {
		/*
		[private 필드 선언]
		1. 왜 private를 사용해서 필드를 선언했는가?
		2. 이유
			1) 유효한 값만을 필드가 사용할 수 있도록 막아두기 위해
			2) 필드 읽기 전용/ 쓰기 전용 설정
			
		3. private 필드에 접근하는 방법 : getter, setter 추가
		 */
		Person p1 = new Person(true);
		
		System.out.println(p1.isGender()); // 생성자를 통해서 값 할당 - true
		
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		// 접근지정자를 사용해서 필드 [은닉화]
		// The field Person.name is not visible
		// Person 클래스의 name이 숨겨져 있음
		/*
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		*/
		
	}
}

// public class Person { }
// The public type Person must be defined in its own file
// Ex04라고 하는 자바 파일 안에는 파일명과 같은 클래스명만 public class가 될 수 있음

// 다른 패키지에서는 사용할 클래스가 아님
// 동일한 패키지에서만 사용
//class Person {
//	
//}
