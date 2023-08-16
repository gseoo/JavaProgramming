package days07;

import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 7. 21. - 오후 2:29:05
 * @subject [문제] 피보나치 수열
 * @content 항이 100보다 같거나 작을 때까지의 수열을 출력하고 합 구하기
 */

public class Ex07_03 {
	public static void main(String[] args) {
		
		/*
		// 원하는 항의 갯수 입력받아서 피보나치 수열 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m[] = new int[n];
		int sum=0;
		
		for(int i=0; i<m.length; i++) {
			if(i<=1) 
				m[i] = 1;
			else
				m[i] = m[i-2] + m[i-1];
			if(m[i]>100) break;
			System.out.printf("%d+",m[i]);
			sum+=m[i];
		}
		*/
		
		
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		/*
		while(true) {
			nextTerm = firstTerm + secondTerm;
			if(nextTerm>100) break;
			System.out.printf("%d+",nextTerm);
			sum+=nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		 */
		
		// 위에 코드 정리한 거
		while((nextTerm = firstTerm + secondTerm) <= 100) {
			System.out.printf("%d+",nextTerm);
			sum+=nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

		System.out.printf("=%d", sum);
	}
}
