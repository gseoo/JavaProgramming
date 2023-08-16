package days03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 나이 국어 영어 수학 입력 ? ");
		
		String name = sc.next();
		byte age = sc.nextByte();
		byte kor = sc.nextByte();
		byte eng = sc.nextByte();
		byte mat = sc.nextByte();
		
		short total = (short) (kor + eng + mat);
		double avg = (double)total/3;
		
		System.out.printf("\"%s\" %d살 %d %d %d %d %2.2f", name, age, kor, eng, mat, total,avg);

		sc.close();
	}
}