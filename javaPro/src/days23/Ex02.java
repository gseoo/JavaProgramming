package days23;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days10.Ex06_04;

public class Ex02 {
	public static void main(String[] args) throws IOException {

		ArrayList<Student> class1List = new ArrayList<>();
		ArrayList<Student> class2List = new ArrayList<>();
		ArrayList<Student> class3List = new ArrayList<>();

		ArrayList<ArrayList<Student>> sistList = new ArrayList<>();
		sistList.add(class1List);
		sistList.add(class2List);
		sistList.add(class3List);

		char con = 'y';

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner sc = new Scanner(System.in);

		int ban;

		do {
			System.out.printf("> 반 입력 ? ");
			ban = sc.nextInt();

			ArrayList<Student> classList = sistList.get(ban-1);

			System.out.printf("> %d반의 [%d]번 학생의 이름, 국어, 영어, 수학 입력? ",ban, classList.size()+1);
			int no = classList.size()+1;
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			wrank = 1;

			Student s = new Student(ban, name, kor, eng, mat, tot, avg, rank, wrank);
			classList.add(s);

			System.out.print("> 입력 계속? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		// 출력
		//int cSize = class1List.size() + class2List.size() + class3List.size();
		//System.out.printf("\t\t학생 정보 출력(%d명)\n", cSize);

		//sistList.stream().mapToInt(classList->classList.size()).forEach(학생수->System.out.println(학생수));

		// 메소드 참조
		sistList.stream().mapToInt(ArrayList::size).forEach(System.out::println);

		int totalStudents = sistList.stream().mapToInt(ArrayList::size).sum();
		System.out.printf("\t\t학생 정보 출력(%d명)\n", totalStudents);

		Iterator<ArrayList<Student>> ir = sistList.iterator();
		ban = 1;
		while (ir.hasNext()) {
			ArrayList<Student> classList = (ArrayList<Student>) ir.next();
			System.out.printf("[%d반 학생 : %d명]\n",ban++,classList.size());

			Iterator<Student> ir2 = classList.iterator();
			while (ir2.hasNext()) {
				Student s = (Student) ir2.next();
				System.out.println(s);
			}
		}




	}
}
