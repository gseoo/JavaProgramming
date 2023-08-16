package days04;

import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 7. 18. - 오후 4:17:57
 * @subject 컴퓨터 - 사용자 가위바위보
 * @content ***배열***
 */

public class Ex10_04 {
	public static void main(String[] args) {
		
		int com, user;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" > user 가위(1) 바위(2) 보(3) 선택 ? ");
			user = sc.nextInt();
			com = (int)(Math.random()*3)+1;
			
			String[] r = new String[4];
			r[0] = null;
			r[1] = "가위";
			r[2] = "바위";
			r[3] = "보";
				
			System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n", r[com], r[user]);
			switch(user-com) {
			case 1: case -2:
				System.out.println("사용자 승리"); break;
			case 2: case -1:
				System.out.println("컴퓨터 승리"); break;
			default:
				System.out.println("무승부"); break;
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


