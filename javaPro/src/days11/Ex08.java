package days11;

import java.io.IOException;
import java.util.Random;

/**
 * @author 이경서
 * @date 2023. 7. 27. - 오후 4:17:38
 * @subject 다차원 배열은 배열의 배열이다
 * @content	
 */
public class Ex08 {
	public static void main(String[] args) throws IOException {

		final int STUDENT_COUNT = 30;

		String names[] = new String[STUDENT_COUNT];
		/*
		int kors[] = new int[STUDENT_COUNT]; // 0열
		int engs[] = new int[STUDENT_COUNT]; // 1열
		int mats[] = new int[STUDENT_COUNT]; // 2열
		int tots[] = new int[STUDENT_COUNT];  // 3열
		int ranks[] = new int[STUDENT_COUNT];  // 4열
		*/
		int infos[][] = new int[STUDENT_COUNT][5]; //2차원 배열로 선언
		
		double avgs[] = new double[STUDENT_COUNT]; 

		int count = 0;
		char con = 'y';

		do {
			System.out.printf("> 이름, 국어, 영어, 수학 입력? ");
			String name = getName();
			int kor = getScore();
			int eng = getScore();
			int mat = getScore();
			int tot = kor + eng + mat;
			double avg = (double)tot/3;
			int rank = 1;
			
			names[count] = name;
			infos[count][0] = kor;
			infos[count][1] = eng;
			infos[count][2] = mat;
			infos[count][3] = tot;
			infos[count][4] = rank;
			avgs[count] = avg;
			

			count ++; 

			System.out.print("> 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while(Character.toUpperCase(con)=='Y');
		
		infos[1][0] = 100;
		
		procRank(infos, count);
		printStudentInfo(infos, names, avgs, count);
	}

	private static void printStudentInfo(int[][] infos, String[] names, double[] avgs, int count) {
		for(int i=0; i<count; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", i+1, names[i], infos[i][0], infos[i][1], infos[i][2], infos[i][3], avgs[i], infos[i][4]);
		}
		
	}

	private static void procRank(int[][] infos, int count) {
		for(int i=0; i<count; i++) {
			infos[i][4] = 1;
			for(int j=0; j<count; j++) {
				if(infos[i][3]<infos[j][3]) {
					infos[i][4]++;
				}
			}
		}
		
	}

	private static String getName() {
		Random rnd = new Random();
		char nameArr[] = new char[3];
		for(int i=0; i<nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가' +1) + '가');
		}
		String name = String.valueOf(nameArr);
		return name;
	}

	private static int getScore() {
		return(int)(Math.random()*101);
	}
	
	private static void procRank(int[] tots, int[] ranks, int count) {
		for(int i=0; i<count; i++) {
			ranks[i] = 1;
			for(int j=0; j<count; j++) {
				if(tots[i]<tots[j]) {
					ranks[i]++;
				}
			}
		}
	}

	private static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs, int[] ranks, int count) {
		for(int i=0; i<count; i++) {
			System.out.printf("%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
		
	}
}
