package days17;

import java.util.Arrays;
import java.util.Scanner;

public class CutOperation2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("막대기 갯수 입력 >> ");
		int n = sc.nextInt();
		int sticks[] = new int[n];
		int sticksLength = sticks.length;
		
		for(int i=0; i<sticksLength; i++) { // sticksLength 대신 n도 가능
			sticks[i] = sc.nextInt();
		}
		
		Arrays.sort(sticks);
		
		System.out.println(Arrays.toString(sticks));
		
		int index = 0;
		int sticksCount = n;
		System.out.println(sticksCount);
		
		for(int i=0; i<sticksLength; i++) {
			if(sticks[index] != sticks[i]) {
				index = i;
				sticksCount = sticksLength - index;
				System.out.println(sticksCount);
			}
		}
		

	}
} 