package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
	public static void main(String[] args) {
		// 정규표현식(Regular Expression) = 정규식
		// 문자열 속에서 원하는 패턴과 일치하는 문자열을 찾아내기 위해 사용
		// 미리 정의된 기호 사용
		// 자바에서 정규표현식 관련 클래스는 2개
		// String.matches(regex)
		// 1) Pattern 클래스
		// 2) Matcher 클래스
		
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
		// 1) data 배열에 들어 있는 단어 중에 c로 시작하는 단어를 모두 찾아서 출력
		String regex = "c[a-zA-Z]*";
		
		// 2) c + 소문자 1개 -> (2문자)
		//String regex = "c[a-z]";
		
		// 3) '\w' = [a-zA-Z0-9]
		//String regex = "c\\w"; 
		//String regex = "c[a-zA-Z0-9]"; 
		
		// 4) 문자로 이루어진 단어 모두 찾아서 출력
		//String regex = ".*";
		
		// 5) c로 시작, t로 끝나는 모든 문자
		//String regex = "c.*t";
		
		// 6) c + 숫자
		//String regex = "c[0-9]";
		//String regex = "c\\d";
		
		// 7) c + 숫자 아닌 것
		//String regex = "c[^0-9]";
		//String regex = "c\\D";
		
		// 8) b or c로 시작
		//String regex = "(b|c).*";
		//String regex = "[bc].*";
		
		//String regex = "[bcd].*";
		//String regex = "[b-d].*";
		
		// 9) 알파벳 대소문자 중에 소문자 bcd를 제외한 문자로 시작하는 모든 문자
		//String regex = "[a-zA-Z&&[^b-d]].*";
		
		// 10) 
		//String regex = "[bcd].{2}*"; // 2개 이상
		//String regex = "[bcd].{2,3}*"; // 2, 3개
		//String regex = "[bcd].+"; // 1개 이상
		//String regex = "[bcd].?"; // 1개 or 0개
		
		
		//   \\s : 공백, \\S : 공백이 아닌 것
		
		
		
		Pattern p = Pattern.compile(regex);
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.printf("%s ", data[i]);
		}
		
		
	}
}
