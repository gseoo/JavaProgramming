package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int a = 0; int b = 0;
		
		InputStream source = System.in;
		Scanner sc = new Scanner(source);
		// java.util.InputMismatchException 예외 객체 생성 -> 개발자가 파악해서 예외 처리
		
		// try 안에서 예외가 발생하며 해당 코드 밑에는 실행 X -> catch로 넘어감
		// try 안에서 예외가 발생하지 않으면 catch는 실행 X
		// catch문을 여러 개 쓸 때 : 부모에 해당되는 catch문을 제일 마지막에 씀
		
		// 다중 catch문
		// (주의사항) 부모 예외 클래스를 제일 밑에 코딩한다.
		// JDK 1.7 ~ 멀티 catch문
		try {
			System.out.print("> a, b 두 정수 입력 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			double c = a/b;
			System.out.printf("%d/%d = %.2f\n", a, b, c);
			System.out.println("- 정상 종료 -");
			
		} catch (InputMismatchException e) {
			System.out.println("> [알림] 정수만 입력하세요.");
			System.exit(-1); // 프로그램 종료
		} catch (ArithmeticException e) {
			System.out.println("> [알림] 0으로 나눌 수 없습니다.");
			System.exit(-1);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		} finally {
			// 예외 발생 유무에 상관없이 처리할 구문
			System.exit(-1);
			sc.close();
		}

		
		/*
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		*/
		
		
	}
}
