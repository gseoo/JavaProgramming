package days07;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author 이경서
 * @date 2023. 7. 21. - 오전 9:46:39
 * @subject 사용자-컴퓨터 가위바위보 + 진행 여부 묻기 + 범위 외의 값 입력 시 재입력
 * @content 다른 풀이
 */

public class Ex03_02 {
	public static void main(String[] args) {
		int com, user;
		char c = 0;
		String regex = "^[1~3]$";
		boolean flag = false;
		int count = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			do {
				do {
					if(flag) {
						count++;
						System.out.printf("잘못 입력(1~3)!!!! 다시 입력하세요\n");
						if(count>=5) {
							System.out.println("[5번 실패] 프로그램 종료!");
							// return;
							System.exit(-1);
						}
					}
					System.out.print(" > user 가위(1) 바위(2) 보(3) 선택 ? ");

					user = sc.nextInt();

					com = (int)(Math.random()*3)+1;
					String[] r = {"", "가위", "바위", "보"};

					System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n", r[com], r[user]);
					switch(user-com) {
					case 1: case -2:
						System.out.println("사용자 승리"); break;
					case 2: case -1:
						System.out.println("컴퓨터 승리"); break;
					default:
						System.out.println("무승부"); break;
					}
				} while (Pattern.matches(regex, c+""));
				
				
				System.out.printf("계속하시겠습니까? ");
				c = sc.next().charAt(0);

			} while(Character.toUpperCase(c) == 'Y');

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
