package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 이경서
 * @date 2023. 7. 17. - 오후 5:19:49
 * @subject BufferedReader br을 사용해서 동시에 이, 국, 영, 수 입력 -> 총, 평 정리
 * @content
 */
public class Ex12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 홍길동,90,78,99 엔터
		System.out.print("> 이름, 국어,영어, 수학 입력 ?  ");
		String inputData = br.readLine();
		
		// 구분자 콤마(,)로 잘라내기
		String [] datas = inputData.split(",");
		
		String name = datas[0];
		int kor = Integer.parseInt(datas[1]);
		int eng = Integer.parseInt(datas[2]);
		int mat = Integer.parseInt(datas[3]);
		
		int total = kor + eng + mat;
		double avg = (double)total/3;
		
		System.out.printf("%s님은 국: %d 영: %d 수: %d 총점: %d 평균:%2.2f 이다.", name, kor, eng, mat, total, avg);
		
		
	}

}
