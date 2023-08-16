package days05;

import java.util.Scanner;

public class Ex04_03 {
	public static void main(String[] args) {
		int n=0, m=0, sum=0;
		
		// [문제] 두 정수 n, m을 입력받아서 두 정수 사이의 홀수의 합 출력
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" n, m 입력 >> ");
			n = sc.nextInt();
			m = sc.nextInt();
			
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			
			if(min%2==0) min++; // 짝수면 1을 더해주면서 시작함
			
			for(int i=min; i<=max; i+=2) {
				// if(i%2==0) continue; 이것도 가능하지만 for문이 계속 돌아야 됨
				System.out.printf(i==max ? "%d" : "%d+", i);
				sum+=i;
			}
			System.out.printf("=%d", sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
