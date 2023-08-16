package days24;

public class Ex06 {
	public static void main(String[] args) {
		/*
		[익명 클래스] (=무명, Annonymous)
		1. 익명 클래스 : 클래스 이름이 없음
		2. 사용 형식
		   부모타입 객체명 = new 부모타입(매개변수...){
		     @Override 재정의 함수 구현
		     // 필드, 메소드도 가능
		   }
		   - 부모타입은 클래스, 인터페이스 다 가능
		   	
		3. 자식 클래스가 재사용하지 않고 해당 필드의 초기값으로면 사용될 경우일 때 사용
		
		예) days22.Ex13.java 설명
		4. 부모 타입으로 필드나 변수를 선언하고, 자식 객체를 초기값으로 대입할 경우
		*/
		
		// 2. 객체 생성 후 필드, 메소드 사용
		Sample s = new Sample();
		System.out.println(s);
	}
}

// 1. 클래스 선언
class Sample {
	
}