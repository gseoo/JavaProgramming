package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		// 본인의 이름을 입력받아서 출력
		// 1. 키보드(표준입력장치)로부터 입력받음 -> 표준 입력 스트림
		
		// 바이트 스트림
		//InputStream is = System.in;
		System.out.print("> 한글 한 문자 입력 ? ");
		//InputStreamReader isr = new InputStreamReader(is);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int code = isr.read();
		System.out.println((char)code);
		
		/*
		int code;
		System.out.print("> name input ? ");
		code = is.read();
		System.out.println((char)code);
		*/
		
		/*
		byte[] cbuf = new byte[3];
		System.out.print("> name input ? ");
		is.read(cbuf);
		// byte[] cbuf -> char one 변환
		
		// InputStreamReader 보조문자스트림
		// byte -> char로 변환해주는
		*/
	}
}
