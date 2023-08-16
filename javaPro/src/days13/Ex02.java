package days13;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// modifier(수정자) = 접근지정자 + 기타제어자
		// Illegal modifier for parameter age; only final is permitted
		// 함수 안에 선언된 지역 변수 앞에는 접근지정자, 기타제어자 사용 불가
		//public int age = 20;
		
		// 클래스명 객체명
		Scanner sc = null;
		// new 객체 생성 -> new 연산자에 의해 힙 영역에 생성된 객체를 인스턴스라 함
		// 인스턴스화 하는 작업(new 객체생성;)
		// 객체 생성하는 코딩 = 인스턴스화 (new Random(), new Scanner(System.in))
		sc = new Scanner(System.in);
		
		System.out.printf("> 이름 입력 ? ");
		
		// The local variable sc may not have been initialized
		// 지역변수는 반드시 초기화해야 사용할 수 있음
		// null로 초기화 시 실행에러 : java.lang.NullPointerException
		String name = sc.next();
		System.out.println(name);
		
		
		Random rnd = new Random();
		
		System.out.println("이경서");
		
		// The constructor System() is not visible
		
		// System은 인스턴스화 할 수 없는 클래스
		//System s = new System();
		
		
		// [클래스 선언] Tv
		
		
	}
}
