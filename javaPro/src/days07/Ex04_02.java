package days07;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {

		int user=0;
		String inputData = "";
		String regex = "[1-3]";
		boolean flag = false;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);

		// 다른 풀이 : return은 메인 함수 종료시킴
		do {
			if(flag) {
				
				System.out.printf("[알림 (%d)번] 입력 잘못(1~3)!!!\n", count);
				if(count>=5) {
					System.out.println("[5번 실패] 프로그램 종료!");
					// return;
					System.exit(-1);
				}
				
			}
			
			System.out.print("> user 가위(1) 바위(2) 보(3) 선택 ? ");
			inputData = sc.next();
			flag = true;
		} while(!inputData.matches(regex));
		user = Integer.parseInt(inputData);
		System.out.println(user);
	}
}
