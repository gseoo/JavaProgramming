package days18;

public class Ex08_06 {
	public static void main(String[] args) {
		String s = "TODO method";
		
		// String -> char[]
		char sArr[] = s.toCharArray();
		for(char c : sArr) {
			//System.out.println(c);
		}
		
		
		// char[] -> String
		//s = String.valueOf(sArr);
		s = new String(sArr);
		//System.out.println(s);
		
		// String -> byte[]
		// byte : -128 ~ 127 정수
		byte bArr[] = s.getBytes();
		for(byte b : bArr) {
			//System.out.println(b);
		}
		
		// byte[] -> String
		s = new String(bArr); // valueof는 없음
		//System.out.println(s);
		
		
		// ----------------------------------------
		System.out.println("-".repeat(40));
		
		
		// trim() : 앞뒤 공백 제거
		String name = "     홍길동    ".trim();
		System.out.printf("[%s]", name);
	}
}
