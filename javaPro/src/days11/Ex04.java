package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// 문제) int m[] 30개
		// 0~9 랜덤 정수 채우기
		// 각 숫자가 몇 개 있는지 출력
		
		int m[] = new Random().ints(30,0,10).toArray();
		System.out.println(Arrays.toString(m));
		
		for(int i=0; i<=9; i++) {
			int count = 0;
			for(int j=0; j<m.length; j++) {
				if(m[j]==i) count++;
			}
			System.out.printf("%d - %d\n", i, count);
		}
	}
}
