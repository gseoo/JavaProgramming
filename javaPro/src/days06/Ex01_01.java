package days06;

import java.util.Arrays;
import java.util.Random;


//[문제] 10개의 정수를 임의의 값(5~15)으로 저장하고 가장 큰값 구하기

public class Ex01_01 {
	public static void main(String[] args) {
		
		Random rnd = new Random();

		int m[] = new int[10];
		for(int i=0; i<10; i++) {
			m[i] = (int)(Math.random()*11)+5;
			m[i] = rnd.nextInt(11)+5; // 0 <= rnd.nextInt(100) < 100
		}
		
		System.out.println(Arrays.toString(m));
		
		int max=m[0],min=m[0];
		for(int j=1; j<m.length; j++) {
			if(m[j]>max)
				max = m[j];
			else if(m[j]<min)
				min = m[j];
				
		}
		System.out.printf("max : %d, min : %d",max, min);
	}
}
