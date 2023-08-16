package days04;

/**
 * @author 이경서
 * @date 2023. 7. 18. - 오후 12:28:23
 * @subject for 반복문 *** 암기
 * @content 반복되는 규칙을 찾아야 됨
 */

public class Ex05 {
	public static void main(String[] args) {
		
		// i : 반복 횟수
		// for( 초기식; 조건식; 증감식) {
		//  }
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			System.out.printf("%d + ", i);
			sum += i;
		}
		System.out.printf(" = %d",sum);
	}
}
