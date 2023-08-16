package days07;

import java.util.Scanner;

// 행의 갯수를 입력받아 트리 찍기

public class Ex02 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.printf("행의 갯수를 입력하세요 >> ");
			int n = sc.nextInt();
			int col = 2*n-1;
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=col; j++) {
					if(i+j>=n+1 && j-i<=n-1) System.out.printf("*");
					else System.out.printf("_");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
