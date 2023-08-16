package days02;

public class Ex03 {

	public static void main(String[] args) {
		
		//한 문자를 저장하는 자료형 : char
		//자바에서 문자를 나타낼 때는 '한 문자' 사용
		
		
		//코드영역(블럭) {} 영역(범위) 연산자
		
		//grade cannot be resolved to a variable
		//grade라고 하는 변수를 인식할 수 없음
		{
			char grade = 'A'; //이 블록 안에서만 사용되는 지역변수
			System.out.printf("등급: '%c'", grade);
		}
		
		//System.out.printf("등급: '%c'", grade); //그래서 이거 인식 불가
	}

}
