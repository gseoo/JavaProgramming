package days08;

import java.util.Random;

public class Ex09 {
	public static void main(String[] args) {
		
		// 로또 6/45
		// 1~45 정수 6개를 출력
		// 1 <= int Math.random()*45+1 > 46
		//(int)(Math.random()*45)+1
		
		for(int i=0; i<6; i++) {
			int lottoNumber = (int)(Math.random()*45)+1;
			System.out.println(lottoNumber);
		}
	}
}
