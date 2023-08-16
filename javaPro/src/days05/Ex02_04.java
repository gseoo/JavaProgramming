package days05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02_04 {
	public static void main(String[] args) {
		String s = null;
		char c = 0;
		String result = null;
		
		try (Scanner sc = new Scanner(System.in)){

			System.out.print("한 문자를 입력하세요 >> ");
			c = sc.next().charAt(0);
			s = c + "";
			
			
			if(Character.isDigit(c)) //[0-9]
				result = "숫자";
			else if(Character.isAlphabetic(c)) //[a-zA-Z]
				result = "알파벳";
			
			// 정규표현식 [#$!%@]
			else if(c == '#' || c == '$' || c == '!' ||c == '%' ||c == '@')
				result = "특수문자";
			else if(c >= '가' && c >= '힣')
				result = "한글";
			else result = "err";
			
			
			/*
			if(Pattern.matches("^[0-9]*$",s))
				result = "숫자";
			else if(Pattern.matches("^[a-zA-Z]*$",s))
				result = "알파벳";
			else if(Pattern.matches("^[ㄱ-ㅎ가-힣]*$",s)) 
				result = "한글";
			else if(Pattern.matches("[#$!%@]",s))
				result = "특수문자";		
			*/
		}	
		catch (Exception e) {
			e.printStackTrace();
		}	
		System.out.printf("'%c'은(는) %s입니다.", c, result);
	}
}