package days10;

import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		
		/*
		 * 1. 1차원, 2차원, 3차원 배열(다차원 배열)
		 * 2. 정렬(Sort)
		 * 3. 검색(Search) - binary search, sequence search
		 * 4. 다차원 배열 활용 예제
		 * 
		 * (클래스 5, 6장 읽기)
		 */
		
		// 문제) int m[] 30개
		// 0~9 랜덤 정수 채우기
		// 각 숫자가 몇 개 있는지 출력
		
		int m[] = new int[30];
		int count[] = new int [10];
		
		for(int i=0; i<m.length; i++) {
			m[i] = (int)(Math.random()*10);
			for(int j=0; j<=9; j++) {
				if(m[i]==j)count[j]++;
			}
		}
		
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(count));

	}
}
