package days06;

import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		int code;
		
		// Syntax error on token "continue", invalid VariableDeclaratorId
		// continue : 예약어 -> 변수명으로 사용 불가
		char con = 'y';
		
		do {
			System.out.print("> 한 문자 입력 ? ");
			code = System.in.read();
			System.out.printf("code = %c\n", (char)code);
			
			System.in.skip(System.in.available());
			
			System.out.print("\n\n 계속하시겠습니까? (y or n) ");
			code = System.in.read();
			con = (char)code;
			
			System.in.skip(System.in.available());
			
		} while (con=='y' || con=='Y');
		
		System.out.println("end");
		
		/*
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %c\n", (char)code);

		System.in.skip(System.in.available()); //읽어가고 남아 있는 건 버림
		
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read(); 
		System.out.printf("code = %c\n", (char)code);
		*/

	}
}
