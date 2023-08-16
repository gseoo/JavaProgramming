package days24;

public class Ex04 {
	public static void main(String[] args) {
		
		/*
		[중첩 클래스와 중첩 인터페이스]
		1. 클래스와 클래스들 간의 관계 : has-a, is-a(상속)
		2. 어떤 클래스가 특정 클래스와 관계가 있다면
			  A    		B
		   B라는 클래스 내부에 A 클래스를 선언한다.
		3. 중첩 클래스(Nested Class)
		4. 장점
		   - 두 클래스의 멤버들에 서로 쉽게 접근할 수 있음
		   - 불필요한 관계의 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있음
		5. 예
		   class A {
		     // 필드
		   	 // 메소드
		   	 // 생성자
		   	 // getter, setter
		   	 
		   	 class B { // 중첩 클래스
		   	 }
		   	 
		   	 interface IC { // 중첩 인터페이스
		   	 }
		   }
		   
		6. 중첩 클래스의 종류 : 선언 위치에 따라 구분(중첩 클래스가)
		   1) 클래스의 멤버로 선언
		   	  (1) 인스턴스 멤버 클래스 : A 객체를 생성해야 B 중첩 클래스 사용 가능
		   	  (2) 정적(static) 멤버 클래스 : A 클래스로 객체 생성 없이 바로 C 클래스 사용 가능
		   	  중첩클래스도 A(외부)$B(내부).class 클래스 파일 생성
		   	  
		   2) 메소드 내부에 선언
		      (3) 로컬 클래스 : 메소드가 실행될 때만 사용 가능, 접근지정자 사용 불가
		      A(외부)$1B(로컬클래스명).class 클래스 파일 생성
		
		6-2. 예
		     class A {
		     
		       void disp() { // 메소드
		       
		         class D { // (3) 로컬 클래스
		           // static 필드, 메소드는 선언 불가
		           
		           D() {}
		           int d1;
		           void test() {}
		         }
		         예)
		         D obj = new D();
		         obj.d1;
		         obj.test();
		         
		       }
		       
		       class B { // (1) 인스턴스 멤버 클래스
		         B() {} // 생성자 선언 가능
		         int b1; // 인스턴스 필드 생성 가능
		         void test() {} // 인스턴스 메소드 선언 가능
		         
		         // static 필드, 메소드 선언 불가
		       }
		       예)
		       A a = new A(); // 외부 객체 먼저 생성
		       A.B b = a.new B(); // 내부 객체 생성
		       
		       static class C { // (2) 정적(static) 멤버 클래스
		         // 모든 필드, 메소드 선언 가능
		         int c1; // 인스턴스 변수
		         static sc1; // static 변수
		         void test1() {} // 인스턴스 메소드
		         static void test2(){} // static 메소드
		         C() {} // 생성자
		       }
		       예) 외부 객체 생성 X
		       A.C c = new A.C();
		       c.c1 = 100;
		       c.test1();
		       
		       A.C.sc1 = 100; // 객체 생성 없이 호출
		       A.C.test2(); // 객체 생성 없이 호출
		       
		     }
		     
		     
		*/
	}
}

