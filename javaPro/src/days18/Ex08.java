package days18;

public class Ex08 {
	public static void main(String[] args) {
		// [문자열 다루는 클래스]
		// String
		// StringBuffer
		// StringBuilder
		// StringTokenizer
		
		String name = "홍길동";
		name += "님";
		name += " 안녕!!";
		System.out.println(name);
		
		System.out.println(name.length());
		
		// name.length -> 필드
		// name.length() -> 메소드 (문자열의 길이를 가져오는)
		for(int i=0; i<name.length(); i++) {
			System.out.printf("name[%d]='%c'\n", i, name.charAt(i));
		}
		
		System.out.println(name.substring(5));
		
		System.out.println(name.substring(5,7));
		
		String rrn = "971208-2003866";
		String regex = "\\d{6}-\\d{7}";
		System.out.println(rrn.matches(regex));
		
		String s = "ㅁㅁㅁ".concat("ㅠㅠㅠ").concat("xxx");
		System.out.println(s);
		
		System.out.println("hello".compareTo("hello"));
		System.out.println("Hello".compareTo("hello"));
		System.out.println("HELlo".compareToIgnoreCase("hello"));
		
		System.out.println("hello".equals("hello"));
		System.out.println("Hello".equals("hello"));
		System.out.println("HELlo".equalsIgnoreCase("hello"));
		
		boolean result = "안녕하세요. 홍길동입니다.".contains("홍길동");
		System.out.println(result);
		boolean result2 = "안녕하세요. 홍길동입니다.".contains("김길동");
		System.out.println(result2);
		
		String url = "http://www.naver.com/test.jsp";
		String prefix = "http://";
		String suffix = ".jsp";
		System.out.println(url.startsWith(prefix));
		System.out.println(url.endsWith(suffix));
		
		

		
	}
}
