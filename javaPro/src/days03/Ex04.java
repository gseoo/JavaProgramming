package days03;

public class Ex04 {

	public static void main(String[] args) {
		int n = 10;
		
		// 2진수로 바꾸기
		System.out.printf("%s \n", Integer.toString(n, 2));
		System.out.printf("%s \n", Integer.toBinaryString(n));
		
		// 8진수로 바꾸기
		System.out.printf("%s \n", Integer.toString(n, 8));
		System.out.printf("%s \n", Integer.toOctalString(n));
				
		// 16진수로 바꾸기
		System.out.printf("%s \n", Integer.toString(n, 16));
		System.out.printf("%s \n", Integer.toHexString(n));

		
		// 00000000 00000000 00000000 00001010 형태로 출력되게 만들어 보기
		System.out.printf("%0bd",n);
	}

}
