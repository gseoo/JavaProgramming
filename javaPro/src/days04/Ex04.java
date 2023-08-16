package days04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		//국어 점수를 kor 변수에 입력받아서 등급 출력
		// grade
		// 0~59 가/ 60~69 양/ 70~79 미/ 80~89 우/ 90~100 수
		
		int kor;
		String grade = null;
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("국어 점수를 입력하세요 >> ");
			kor = sc.nextInt();
			
			if(kor >= 0 && kor <=0) {
				if(kor>=90) {
					System.out.println("수");
				}
				if(kor>=80 && kor<=89) {
					System.out.println("우");
				}
				if(kor>=70 && kor<=79) {
					System.out.println("미");
				}
				if(kor>=60 && kor<=69) {
					System.out.println("양");
				}
				if(kor>=59) {
					System.out.println("가");
				}
				
			}
			else {
				System.out.println("국어 점수 입력을 잘못 하셨습니다.");
			}
		} catch (Exception e){
			e.printStackTrace(); // 에러 메세지 출력되게 함
		}	
	}
}
