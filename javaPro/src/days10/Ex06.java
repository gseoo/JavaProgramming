package days10;

import java.util.Scanner;

// 내일 시험

public class Ex06 {
	public static void main(String[] args) {
		// 한 반에 30명의 학생
		// 성적처리(이름, 국어, 영어, 수학, 총점, 평균, 등수)
		// 1. 학생 정보 입력
		// 2. 총점, 평균 계산
		// 3. 등수 매기기
		// 4. 학생 정보 출력
		// 5. 파일에 저장 or DB에 저장 -> 나중에

		final int STUDENT_COUNT = 30;  // 총 학생수를 상수로 선언

		String names[] = new String[STUDENT_COUNT];
		int kors[] = new int[STUDENT_COUNT];
		int engs[] = new int[STUDENT_COUNT];
		int mats[] = new int[STUDENT_COUNT];
		int tots[] = new int[STUDENT_COUNT]; // kors+engs+mats
		double avgs[] = new double[STUDENT_COUNT]; //(double)tots/3
		int ranks[] = new int[STUDENT_COUNT]; //avgs 정렬 -> 입력이 다 끝나고 한번에 매김(아니면 계속 바뀜)

		Scanner sc = new Scanner(System.in);
		int count = 0; // 입력받은 학생수를 저장할 변수
		char con = 'y'; // 입력을 계속할지 물어볼 변수

			System.out.printf("> 이름, 국어, 영어, 수학 입력? ");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			int tot = kor + eng + mat;
			double avg = (double)tot/3;
			int rank = 1;


			count ++; // 입력받은 학생수가 하나 증가
	}
}
