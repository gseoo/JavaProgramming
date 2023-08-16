package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름, 국어, 영어, 수학 입력 >> ");
		String inputData = br.readLine();
		
		// 자바에서 \ 한 개 찍으려면 \\ 두 개를 찍어야 함
		// 콤마를 기준으로 앞뒤에 공백이 있거나 없거나
		//String regex = "\\s*,\\s*";
		String regex = "[, ]"; // 대괄호 안에 있는 모든 문자 -> 여기에서는 공백이랑 ,(콤마)
		String data[] = inputData.split(regex);
		//   \\s : whitespace를 나타내는 정규표현식
		
		String name = data[0];
		int kor = Integer.parseInt(data[1]);
		int eng = Integer.parseInt(data[2]);
		int mat = Integer.parseInt(data[3]);
		// int mat = Integer.parseInt(data

		int total = kor + eng + mat;
		double avg = (double)total/3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, total, avg);
		
		
	}
}