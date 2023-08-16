package days05;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		int n=0, m=0, sum=0;
		
		// [문제] 두 정수 n, m을 입력받아서 두 정수 사이의 합 출력
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" n, m 입력 >> ");
			n = sc.nextInt();
			m = sc.nextInt();
			/*
			 * [1]
			if(n>m) {
				int temp = n;
				n = m;
				m = temp;
			}
			
			for(int i=n; i<=m; i++) {
				System.out.printf(i==m ? "%d" : "%d+", i);
				sum+=i;
			}
			*/
			
			/*
			 * [2]
			int min = n > m ? m : n; 
			int max = n > m ? n : m;
			
			for(int i=min; i<=max; i++) {
				System.out.printf(i==max ? "%d" : "%d+", i);
				sum+=i;
			}
			System.out.printf("=%d", sum);
			*/
			
			//[4] Math 클래스
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			
			for(int i=min; i<=max; i++) {
				System.out.printf(i==max ? "%d" : "%d+", i);
				sum+=i;
			}
			System.out.printf("=%d", sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
