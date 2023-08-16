package days18;

public class Ex08_04 {
	public static void main(String[] args) {
		
		String s = "안녕하세요. 홍길동입니다. 홍길동이고, 홍길동입니다.";
		/*
		// "홍길동" -> "hong.gildong"
		// String regex 정규표현식 사용
		s = s.replaceFirst("홍길동", "hong.gildong");
		System.out.println(s);
		
		s = s.replaceAll("홍길동", "hong.gildong");
		System.out.println(s);
		*/
		
		// "홍길." = 홍길 + 아무 문자 1개
		// "홍길\\." = 홍길.
		// "홍길[가-힣]" = 홍길+[가-힣] 사이의 아무 문자 1개
		String s1 = "안녕하세요. 홍길동입니다. 홍길도이고, 홍길둥입니다. 홍길.입니다.";
		s1 = s1.replaceAll("홍길\\.", "hong.gildong");
		System.out.println(s1);
		
		s = s.replace('홍', '강');
		System.out.println(s);
		
		// CharSequence에 문자열 들어가도 됨 -> 업캐스팅
		s1 = s1.replace("홍길도", "XYZ");
		System.out.println(s1);
	}
}
