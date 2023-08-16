package days05;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		int code;
		char one;
		
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", code);
		//one = (char) code;
		//System.out.printf("one = %c\n", one);
		
		//System.in.read(); // 13(엔터값)
		//System.in.read(); // 10(\n 값)
		System.in.skip(System.in.available()); //읽어가고 남아 있는 건 버림
		
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read(); 
		System.out.printf("code = %d\n", code);
		//one = (char) code;
		//System.out.printf("one = %c\n", one);
	}
}

