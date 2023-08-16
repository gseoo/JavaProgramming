package days05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02_05 {
	public static void main(String[] args) {
		String s = null;
		String result = null;
		
		try (Scanner sc = new Scanner(System.in)){

			System.out.print("한 문자를 입력하세요 >> ");
			String inputData = sc.next();
			
			//알파벳 입력받은 것 중에 모음이냐? [aeiouAEIOU]
			// 자음이냐? [^aeiouAEIOU]
			
			String regex = "[#@$!]"; 
			if(inputData.matches(regex)) {
				System.out.println("특수문자");
			}
			
			
			
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
		//System.out.printf("'%s'은(는) %s입니다.", s, result);
	}
}