package days02;


import java.util.Scanner;

// Scanner 사용

public class Ex17_03 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동 님은 국: 89 영: 78 수: 56 총점: 000 평균:000.00 이다.
		// 콤마로 구분하기
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("(\\s*,\\s*)|\r\n");
		// \s : 공백 1개
		// * : 앞의 값이 없거나 한 번 이상 나옴
		// | : or
		// \r\n : 개행문자 (윈도우에서 사용하는)
		// --> 공백이 있거나 없거나 > 콤마가 나옴 > 공백이 있거나 없거나 or 개행문자 입력 시에 
		
		System.out.print("이름 국어 영어 수학 >> ");
		
		//sc = new Scanner(sc.next()).useDelimiter(",");
		String name = sc.next();
		byte kor = sc.nextByte();
		byte eng = sc.nextByte();
		byte math = sc.nextByte();
		
		short sum = (short) (kor + eng + math);
		double avg = (double)sum/3;
		
		System.out.printf("%s님은 국: %d 영: %d 수: %d 총점: %d 평균:%2.2f 이다.", name, kor, eng, math, sum, avg);

		sc.close();

	}

}
