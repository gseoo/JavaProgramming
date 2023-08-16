package days05;

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		int n=0, m=0, sum=0;

		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" n, m 입력 >> ");
			n = sc.nextInt();
			m = sc.nextInt();
			
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			
			if(min%2==0) min++;                                
			
			while(min <= max) {
				sum+=min;
				System.out.printf(min==max ? "%d" : "%d+", min);
				min+=2;
			}
			System.out.printf("=%d", sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
