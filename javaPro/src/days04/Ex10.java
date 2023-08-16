package days04;

import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 7. 18. - 오후 4:17:57
 * @subject 컴퓨터 - 사용자 가위바위보
 * @content
 */

public class Ex10 {
	public static void main(String[] args) {
		
		// 가위(1), 바위(2), 보(3)   
		// 컴퓨터는 1~3 중 임의의 수를 발생시킴  --> (int)(Math.random()*3)+1
		// 사용자는 1~3 정수를 Scanner로 입력
		
		/*        [사용자 - 컴퓨터]
		 *   com/user   가위(1)    바위(2)    보(3)
		 *     가위(1)        무          사(1)     컴(2)
		 *     바위(2)      컴(-1)        무		   사(1)
		 *       보(3)       사(-2)     컴(-1)      무
		 *       
		 *       win
		 *       사용자 : 1, -2
		 *       컴퓨터 : 2, -1
		 *       그 외 : 0
		 */
		
		int com, user;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" > user 가위(1) 바위(2) 보(3) 선택 ? ");
			user = sc.nextInt();
			com = (int)(Math.random()*3)+1;
				
			System.out.printf("> 컴퓨터 : %d, 사용자 : %d\n", com, user);
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
