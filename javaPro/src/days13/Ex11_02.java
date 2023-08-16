package days13;

import java.io.IOException;
import java.util.Scanner;

import days10.Ex06_04;

//3반 30명 학생 성적 처리 -> student 클래스를 사용해서 수정

public class Ex11_02 {
	public static void main(String[] args) throws IOException {
		

		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;
		
		// 클래스 2차원 배열
		Student students[][] = new Student[CLASS_COUNT][STUDENT_COUNT];
		
		
		char con = 'y';
		int counts[] = new int[CLASS_COUNT];

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner sc = new Scanner(System.in);

		int ban;

		do {
			System.out.printf("> 반 입력? ");
			ban = sc.nextInt(); 

			System.out.printf("> %d반의 [%d]번 학생의 이름, 국어, 영어, 수학 입력? ",ban,counts[ban-1]+1);
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();

			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			wrank = 1;

			// 객체 생성
			// 클래스(객체) 복사
			Student s = students[ban-1][counts[ban-1]] = new Student();
			
			s.no = counts[ban-1] + 1;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.rank = rank;
			s.wrank = wrank;
			s.avg = avg;

			counts[ban-1]++;

			System.out.print("> 입력 계속? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		// 등수처리

		for(int i=0; i<counts.length; i++) {
			for(int j=0; j<counts[i]; j++) {
				Student s = students[ban-1][counts[ban-1]] = new Student();
				Student a = students[i][j];
				s.rank = 1; 
				s.wrank = 1;

				for(int i2=0; i2<counts.length; i2++) {
					for(int j2=0; j2<counts[i2]; j2++) {
						Student b = students[i2][j2];
						if(b.tot>a.tot) {
							a.wrank++;
							if(i==i2) {
								a.rank++;
							}
						}
					}
				}
			}
		}

		int n = 0;
		for(int i=0; i<counts.length; i++) {
			n += counts[i];
		}
		System.out.printf("학생 정보 출력 (%d명)\n",n);
		for(int i=0; i<counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명]\n", i+1,counts[i]);
			for(int j=0; j<counts[i]; j++) {
				
				Student s = students[i][j];
				s.printStudentInfo();
			}
		}
	}
}
