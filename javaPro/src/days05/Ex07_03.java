package days05;

/**
 * @author 이경서
 * @date 2023. 7. 19. - 오후 4:36:14
 * @subject            **** 내일 시험
 * @content 조건문 if
 * 				분기문 switch
 * 				반복문 for          [foreach]
 * 				조건반복문 while, do~while
 * 				기타 break. continue
 */
public class Ex07_03 {
	public static void main(String[] args) {
		
		// 정수 10개를 저장할 배열 m 선언
		// 2. 임의의 정수(1~100)를 각 배열 요소에 저장
		// 		1 <= (int)(Math.random()*100)+1 <101
		// 3. for문을 사용해서 각 배열 요소 출력
		
		int [] m = new int[10];
		
		for(int i=0; i<10; i++) 
			m[i] = (int)(Math.random()*100)+1;
		
		/*
		  3. for문을 사용해서 각 배열 요소 출력
		for(int i=0; i<10; i++) 
			System.out.printf("m[%d]=%d\n", i, m[i]);
		*/
		
		// foreach 문을 사용해서 출력
		for ( int n : m) {
			System.out.println(n);
			
		}
		
			
		
	}
}
