package days07;

import java.util.Scanner;

public class Ex05_02 {
	public static void main(String[] args) {
		// 국어점수(kor)를 입력받아서
		// 0<=kor<=100
		// 올바른 국어 점수, 잘못된 국어 점수 출력
		
		String kor ="";
		//String regex = "100|[1-9]\\d|\\d"; // 내 풀이
		String regex = "100|[1-9]?\\d"; // 이거랑 위에랑 같은 의미 ?는 있거나 없거나라는 뜻
		
		try (Scanner sc = new Scanner(System.in)){
			kor = sc.next();
			if(kor.matches(regex))
				System.out.println("올바른 국어점수");
			else
				System.out.println("잘못된 국어점수");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
