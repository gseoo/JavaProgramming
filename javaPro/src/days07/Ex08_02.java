package days07;

import util.Draw2D;

public class Ex08_02 {
	public static void main(String[] args) {
		
		//구분선 긋기
		Draw2D.drawLine();
		System.out.println("부서명 : 사원명");
		Draw2D.drawLine(30);
		System.out.println("영업부 : 고경림");
		System.out.println("생산부 : 김성준");
		System.out.println("개발부 : 김정주");
		System.out.println("기획부 : 김호영");
		Draw2D.drawLine(25, '^');
		
		
		// 중복 함수
		// funtion overloading (오버로딩)
		// System.out.println();
		
	}
	
	// 함수 선언 3가지
	// 1) 기능 : 선 긋기 (함수 이름: drawLine)
	// 2) 매개변수 : x
	// 3) 리턴값(리턴자료형) : x -> void
	// 접근지정자 기타제어자 리턴자료형 함수명([매개변수...]) {  }
	
	
}
