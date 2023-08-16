package days04;

import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 7. 18. - 오후 3:12:45
 * @subject switch 분기문
 * @content default 구문은 생략 가능
 * 				key : 변수, 수식 (정수, 문자열, 문자)
 * 				case : 변수 설정 불가
 */				
 
public class Ex08 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);){
			int n = sc.nextInt();
			
			String result = null;
			switch (n%2) {
				case 0:
					result = "짝수";
					break;
				case 1:
					result = "홀수";
					break;
			}
			
			System.out.println(result);
			
		} catch (Exception e) {
		}
		System.out.println(" end ");
	}
}
