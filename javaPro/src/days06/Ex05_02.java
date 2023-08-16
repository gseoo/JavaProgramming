package days06;

import java.util.Scanner;

public class Ex05_02 {
	public static void main(String[] args) {
		int n = 0;
		
		try (Scanner sc = new Scanner(System.in)){

			System.out.print("> 정수(n) 입력 ? ");
			String inputData = sc.nextLine();
			
			boolean flag = false;
			
			// 정규 표현식 (regular expression)
			// ^[] : 이 꺽새는 문자 시작을 뜻함
			// + : 앞의 문자가 한 번 이상
			// $ : 문자 끝
			// String regex = "^[0-9]+$";
			
			//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
			String regex = "^[0-9]+$";
			flag = inputData.matches(regex);
			
			// 비밀번호 8~15, 숫자 1. 알대 1. 알소1. 특수문자 1 >> 만들어보기
			
			if(flag) {
				System.out.println("잘못 입력");
			} else {
				n = Integer.parseInt(inputData);
				System.out.println(n);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
