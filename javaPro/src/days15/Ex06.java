package days15;

import static java.lang.Math.random;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 1. 패키지(package)
		 	1) 서로 관련된 클래스들, 인터페이스들의 묶음
		 	2) 클래스를 효율적으로 관리하기 위함
		 	3) 클래스의 이름이 충돌하는 것을 막아줌
		 		다른 개발자가 클래스 라이브러리의 클래스와 이름이 충돌되는 것을 피할 수 있음
		 	4) 자신만이 사용할 패키지 체계가 있어야 함
		 	5) 클래스 -> 물리적으로 -> ???.class
		 		패키지 -> 물리적으로 -> 디렉토리 생성
		 	6) 선언형식 : package 패키지명.패키지명;
		 		소스파일의 첫 번째 라인에 단 한 번 선언
		 	7) 패키지명은 소문자로 작명
		 	
		 2. import문
		 	1)소스파일에서 다른 패키지의 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 함
		 	2) 패키지이름 + 클래스이름 = 풀네임
		 	3) 풀네임 예) java.lang.System.out.prinln();
		 	4) import문을 사용해서 미리 풀네임을 명시 : import java.lang.System;
		 	5) import문 생성 : Ctrl + Shift + O
		 	6) * : 모든 클래스 사용 (import java.io.*;)
		 	7) static import문 : 메소드 사용 시 클래스명 안 붙여도 됨
		 */
		
		// static random(), PI (클래스명.메소드명(), 클래스명.필드명)
		//System.out.println(Math.random());
		//System.out.println(Math.PI);
		
		System.out.println(random());
	}
}
