package util;

public class Draw2D {

	public static void drawLine() {
		System.out.println("---------------");
	}

	// Duplicate method drawLine() in type Ex08_02 : Ex08_02안에서 메소드 중복
	// 함수명이 똑같아도 매개변수의 갯수, 자료형이 다르면 다른 함수로 인식함 (리턴은 의미없음)
	public static void drawLine(int n) {
		for(int i=1; i<=n; i++)
			System.out.print("-");
		System.out.println();
	}

	public static void drawLine(int n, char style) {
		for(int i=1; i<=n; i++) {
			System.out.print(style);
		}
		System.out.println();
	}
	
	

}
