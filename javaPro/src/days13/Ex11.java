package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// 한 반에 30명 학생의 성적 처리 -> 클래스를 사용해서 수정
// 한 학생의 성적을 관리하는 Student 클래스 선언

public class Ex11 {
	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		final int STUDENT_COUNT = 30;
		int no = 1;

		Student [] students = new Student[STUDENT_COUNT]; 
		

		Scanner sc = new Scanner(System.in);
		int count = 0;
		char con = 'y';

		do {
			System.out.printf("> 이름, 국어, 영어, 수학 입력? ");
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;

			students[count] = new Student(); // 객체 생성: 이거 안 하면 null 에러
			students[count].no = no++;
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;

			count++;

			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while(Character.toUpperCase(con)=='Y');
		
		// 등수처리
		
		for(int i=0; i<count; i++) {
			students[i].printStudentInfo();
		}
	}

	public static String getName() {
		Random rnd = new Random();
		char nameArr[] = new char[3];
		for(int i=0; i<nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가' +1) + '가');
		}
		String name = String.valueOf(nameArr);
		return name;
	}

	public static int getScore() {
		return(int)(Math.random()*101);
	}
}
