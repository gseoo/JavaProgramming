package days04;

import java.util.Scanner;

public class Ex03_02 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);){
			int n = sc.nextInt();
			
			
			if(n%2==0) {
				System.out.printf("n=%d 짝수",n);
			}
			else {
				System.out.printf("n=%d 홀수",n);
			}
			
		} catch (Exception e) {
		}
		
		
	}

}

