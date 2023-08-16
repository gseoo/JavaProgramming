package days05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int user = 0, com = 0;
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(">> 가위(1) 바위(2) 보(3) 입력 >> ");
			user = sc.nextInt();
			com = (int)(Math.random()*3)+1;
			String[] r = {"", "가위", "바위", "보"};
			
			System.out.printf("컴퓨터: %s, 사용자: %s\n",r[com], r[user]);
			
			switch(user-com) {
				case 1: case -2: System.out.println("사용자 승리!"); break;
				case -1: case 2: System.out.println("컴퓨터 승리!"); break;
				default : System.out.println("무승부"); break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}  
