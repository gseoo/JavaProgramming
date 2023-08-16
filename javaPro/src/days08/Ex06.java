package days08;

/**
 * @author 이경서
 * @date 2023. 7. 24. - 오후 12:16:38
 * @subject 재귀함수 (recursive function)
 * @content	재귀 : 순환, 되풀이되는
 * 				재귀함수: 함수 안에서 자기 자신을 다시 호출하는 함수
 */

public class Ex06 {
	public static void main(String[] args) {
		disp();
	}

	// 재귀함수
	private static void disp() {
		System.out.println("> disp() 호출됨...");
		
		disp();
	}
}
