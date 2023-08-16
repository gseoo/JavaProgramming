package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동 님은 국: 89 영: 78 수: 56 총점: 000 평균:000.00 이다.
		String name; byte kor, eng, math;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();
		
		System.out.print("국어 점수 : ");
		String kors = br.readLine();   //
		kor = Byte.parseByte(kors); //이 두 줄 대신에 kor = Byte.parseByte(br.readLine()); 대체 가능
		
		System.out.print("영어 점수 : ");
		String engs = br.readLine();
		eng = Byte.parseByte(engs);
		
		System.out.print("수학 점수 : ");
		String mats = br.readLine();
		math = Byte.parseByte(mats);
		
		short sum = (short) (kor + eng + math);
		double avg = (double)sum/3;
		
		System.out.printf("%s님은 국: %d 영: %d 수: %d 총점: %d 평균:%2.2f 이다.", name, kor, eng, math, sum, avg);

		

	}

}
