package days03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "홍길동";
		System.out.printf("%s\n", name);
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name); // 10자리 중에 우측정렬
		System.out.printf("[%-10s]\n", name); // 10자리 중에 좌측정렬
		
		int n = 50;
		System.out.printf("%d\n", n);  // 50 - 10진수
		System.out.printf("%o\n", n);  // 62 - 8진수
		System.out.printf("%x\n", n);  // 32 - 16진수
		// %#o, %#x로 출력하면 062, 0x32로 나옴 -> flag가 붙어서 출력
		
		double pi = 3.141592;
		System.out.printf("%f\n", pi);
		System.out.printf("%.3f\n", pi); // 3.142 -> 자동 반올림 처리
		System.out.printf("[%10.3f]\n", pi);
		System.out.printf("[%-10.3f]\n", pi);
		
		int no = 1;
		System.out.printf("%d\n", no);
		System.out.printf("%04d\n", no); // 0001 형태로 출력 ***
		
		System.out.printf("%d(%c)\n", 65, 65);
		// java.util.MissingFormatArgumentException: Format specifier '%c'
		//System.out.printf("%d(%c)\n", 65);
		System.out.printf("%1$d(%1$c)\n", 65); // 1$ : 첫 번째 매개변수를 뜻함
		
	}
}
