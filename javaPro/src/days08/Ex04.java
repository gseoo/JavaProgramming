package days08;

/**
 * @author 이경서
 * @date 2023. 7. 24. - 오전 11:18:39
 * @subject 지역변수 개념
 * @content 함수 호출 + 매개변수				ex)
	 * 			1) Call By Name				drawLine();
	 * 			2) Call By Value					sum(1,2);
 * 				3) Call By Reference
 * 				4) Call By Point   -> c언어
 */

public class Ex04 {

	public static void main(String[] args) {
		 int x = 10;
		 int y = 20;
		System.out.printf("> x=%d, y=%d\n" , x, y);

		swap(x, y);
		
		System.out.printf("> x=%d, y=%d\n" , x, y);
	}
	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
}
