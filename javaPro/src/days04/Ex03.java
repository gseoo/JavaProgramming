package days04;

import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 7. 18. - 오전 10:48:24
 * @subject 제어문
 * @content 1. 정의 : 프로그램의 실행 순서를 제어하는 문 (건너뛰기, 반복 처리 등)
 * 				2. 종류
 * 					1) 조건문 : if    if ~ else    if ~ else if
 * 					2) 분기문 : switch
 * 					3) 반복문 : for    for each
 * 					4)	 조건반복문 : do ~ while    while
 * 					5) 기타 : break    continue
 */
public class Ex03 {
	public static void main(String[] args) {
		/*
		// condition(조건식) 참/거짓 판가름할 수 있는 식 boolean
		if (condition) {
			// 조건식이 참일 때만 여기 수행
		}
		*/
		
		//정수를 입력받아서 n 변수에 저장하고 출력
		// 입력값에 대한 유효성 검사 추가
		try (Scanner sc = new Scanner(System.in);){
			int n = sc.nextInt();
			
			String result = "짝수";
			/*
			if(n%2==0) {
				//System.out.printf("n=%d 짝수",n);
				result = "짝수";
			}
			
			if(n%2!=0) {
				//System.out.printf("n=%d 홀수",n);
				result = "홀수";
			}
			*/
			
			if(n%2!=0) {
				result = "홀수";
			} // 시험에는 이렇게 간결하게 쓰기
			
			System.out.printf("n=%d %s",n, result);
			
		} catch (Exception e) {
		}
		
		
	}

}

// if(^[0~9]+$)
