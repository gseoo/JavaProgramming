package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Scanner 사용

public class Ex17_02 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동 님은 국: 89 영: 78 수: 56 총점: 000 평균:000.00 이다.
		String name; byte kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 국어 영어 수학");
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		math = sc.nextByte();
		
		
		short sum = (short) (kor + eng + math);
		double avg = (double)sum/3;
		
		System.out.printf("%s님은 국: %d 영: %d 수: %d 총점: %d 평균:%2.2f 이다.", name, kor, eng, math, sum, avg);

		sc.close();

	}

}
