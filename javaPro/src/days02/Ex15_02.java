package days02;

public class Ex15_02 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// 정수 10을 문자열 10으로 변환
		String si = String.valueOf(i);
		
		System.out.println(Integer.toBinaryString(i)); // 2진법으로
		System.out.println(Integer.toHexString(i)); // 16진법으로
		System.out.println(Integer.toOctalString(i)); // 8진법으로
		
	}

}
