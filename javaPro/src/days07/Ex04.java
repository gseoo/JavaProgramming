package days07;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*
		System.out.println(Character.toUpperCase('y'));
		System.out.println(Character.toUpperCase('Y'));
		
		System.out.println(Character.toLowerCase('y'));
		System.out.println(Character.toLowerCase('Y'));
		
		String str = "aBc";
		System.out.println(str.toUpperCase());
		*/
		
		int user=0;
		String inputData = "";
		String regex = "[1-3]";
		boolean flag = false;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);

		// 내 풀이: 이거는 반복문만 빠져나감
		miss:do {
			if(flag) {
				System.out.print("> 입력 잘못(1~3)!!!  ");
				count++;
				System.out.printf("%d번 잘못 입력\n", count);
			}
			if(count>=5) {
				System.out.printf("프로그램 종료");
				break miss;
			}
			System.out.print("> user 가위(1) 바위(2) 보(3) 선택 ? ");
			inputData = sc.next();
			flag = true;
		} while(!inputData.matches(regex));
		user = Integer.parseInt(inputData);
		System.out.println(user);
	}
}
