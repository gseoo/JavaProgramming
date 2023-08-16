package days05;
/**
 * 
 * @author 이경서
 * @date 2023. 7. 19. - 오후 3:18:09
 * @subject while, do~while 반복문
 * @content for 반복문 : 반복 횟수가 정해져 있을 때
 *					while 조건반복문 : 반복 조건이 정해져 있을 때
 */
public class Ex05 {
	public static void main(String[] args) {
		
		/* [열거자] 반복해서 처리
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}
		*/

		/* [반복자] 반복해서 처리
		while (it.hasNext()) {
			type type = (type) it.next();
			
		}
		*/
		
//		while (condition) {
//			//조건식이 참일 동안 { } 블럭 실행
//			
//		}
		
		/*
		// [문제] 1~10 합 - while
		int i=1, sum=0;
		while(i <= 10) {
			System.out.printf("%d+", i);
			sum+=i;
			i++;
		}
		System.out.printf("=%d", sum);
		*/
		
		/*
		// [2] i의 초기값을 0으로 줬을 때 1~10 합 출력 - 위치, 범위 변경
		int i=0, sum=0;
		while( i < 10) {
			i++;
			System.out.printf("%d+", i);
			sum+=i;
		}
		System.out.printf("=%d", sum);
		*/
		
		// [3] i의 초기값을 0으로 줬을 때 1~10 합 출력 - 전위형 사용
		int i=0, sum=0;
		while(++i <= 10) {
			System.out.printf("%d+", i);
			sum+=i;
		}
		System.out.printf("=%d", sum);
		// i++로 하면 한 번 더 돌음
		
		
	}
}
