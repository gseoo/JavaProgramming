package days04;

import java.util.Scanner;

public class Pra {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		String s = n + "";
		String regex = "^[0~9]+$";

		if(n%2==0) {
			if(s.matches(regex)) {
				System.out.printf("n=%d 짝수",n);
			}
		}
	}

}
