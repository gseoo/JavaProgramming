package days08;

/**
 * @author 이경서
 * @date 2023. 7. 24. - 오전 11:18:39
 * @subject 지역변수 개념
 * @content 함수 호출 + 매개변수				ex)
	 * 			1) Call By Name				drawLine();
	 * 			2) Call By Value					drawLine(x, y);
 * 				3) Call By Reference			기억공간 참조(매개변수 참조타입 사용)
 * 				4) Call By Point   -> c언어
 */

public class Ex04_02 {
	public static void main(String[] args) {
		int m[] = {10,20};

		System.out.printf("> x=%d, y=%d\n" , m[0], m[1]);
		
		// Call by Reference : .main 함수의 x, y 참조
		// 매개변수의 참조타입을 사용하겠다 - 배열, 클래스, 인터페이스
		swap(m);
		
		System.out.printf("> x=%d, y=%d\n" , m[0], m[1]);
	}
	
	public static void swap(int m[]) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}
}
