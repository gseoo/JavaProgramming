package days06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int a, b, c=0;

		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			int max = Math.max(Math.max(a, b), c);
			int min = Math.min(Math.min(a, b), c);

			System.out.printf("가장 큰 수 : %d, 가장 작은 수 : %d", max, min);

		}catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
