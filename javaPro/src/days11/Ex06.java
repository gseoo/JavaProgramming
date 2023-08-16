package days11;

/**
 * @author 이경서
 * @date 2023. 7. 27. - 오후 3:12:10
 * @subject 다차원 배열
 * @content 1차원 배열, 2차원 배열, 3차원 배열...
 * 			※ 다차원 배열은 배열의 배열이다.
 * 			
 */
public class Ex06 {
	public static void main(String[] args) {
		/*
		1) 3학년까지 있고 한 학년에 10반, 각 반마다 30명씩
			국어 점수 저장
			3*10*30 = 900
		 */
		
		// int kors[] = new int[900]; //3*10*30
		int[][][] kors = new int [3][10][30];
		// 2학년 4반 15번 학생의 국어 점수 입력 : 90
		kors[1][3][14] = 90;
		
		// 2학년 6반의 국어 평균?
		int sum = 0; double avg;
		for(int i=0; i<30; i++) {
			sum += kors[1][5][i];
		}
		avg = (double)sum/30;
	}

}
