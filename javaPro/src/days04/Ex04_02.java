package days04;
 
/**
 * else if
 */
import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		
		//국어 점수를 kor 변수에 입력받아서 등급 출력
		// grade
		// 0~59 가/ 60~69 양/ 70~79 미/ 80~89 우/ 90~100 수
		
		int kor;
		
		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("국어 점수를 입력하세요 >> ");
			kor = sc.nextInt();
			char grade = '가';
			
			// 위에서부터 처리하고 내려가서 else if는 위 조건들을 무조건 만족시킴
			if(kor >= 0 && kor <=100) {
				if(kor>=90) {
					//System.out.println("수");
					grade = '수';
				}
				else if(kor>=80) {
					//System.out.println("우");
					grade = '우';
				}
				else if(kor>=70) {
					//System.out.println("미");
					grade = '미';
				}
				else if(kor>=60) {
					//System.out.println("양");
					grade = '양';
				}
				else{
					//System.out.println("가");
				}
				System.out.printf("kor = %d(%c)", kor, grade);
				
			}
			else {
				System.out.println("국어 점수를 잘못 입력하셨습니다.");
			}
		} catch (Exception e){
			e.printStackTrace(); // 에러 메세지 출력되게 함
		}
	}
}
