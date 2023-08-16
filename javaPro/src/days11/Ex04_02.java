package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04_02 {
	public static void main(String[] args) {
		// 문제) int m[] 30개
		// 0~9 랜덤 정수 채우기
		// 각 숫자가 몇 개 있는지 출력
		
		int m[] = new int[30];
		int n;
		
		// count[0] = 0의 갯수
		// count[1] = 1의 갯수
		//      ...
		// count[9] = 9의 갯수
		int [] counts = new int[10];
		
		for(int i=0; i<m.length; i++) {
			n = getRandomInt(0,9);
			m[i] = n;
			counts[n]++;
		}
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(counts));
	}
	
	public static int getRandomInt(int min, int max) {
		return (int)(Math.random()*(max-min+1)) + min;
	}
}
