package days04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		//국어 점수를 kor 변수에 입력받아서 등급 출력
		// 0~59 가/ 60~69 양/ 70~79 미/ 80~89 우/ 90~100 수
		
		
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("국어 점수를 입력하세요 >> ");
			int kor = sc.nextInt();
			char grade = '가';
			
			switch(kor/10) {
				case 10:
				case 9:                                 // JDK 14부터 case 10, 9:로 사용 가능
					grade = '수'; break;
				case 8 :
					grade = '우'; break;	
				case 7 :
					grade = '미'; break;	
				case 6 :
					grade = '양'; break;		
				case 0 :
				case 1 :
				case 2 :
				case 3 :
				case 4 :
				case 5 :
					grade = '가'; break;


			}
			System.out.printf("%d(%c)", kor, grade);
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
