package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 8. 3. - 오후 4:29:06
 * @subject [멀티 catch문]
 * @content
 */
public class Ex14_02 {
	public static void main(String[] args) {
		int a = 0; int b = 0;
		
		InputStream source = System.in;
		Scanner sc = new Scanner(source);

		try {
			System.out.print("> a, b 두 정수 입력 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			double c = a/b;
			System.out.printf("%d/%d = %.2f\n", a, b, c);
			System.out.println("- 정상 종료 -");
			
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println("[1]\n" + e.toString());
			System.out.println("[2]\n" + e.getMessage());
			System.exit(-1); 
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		} finally {
			System.exit(-1);
			sc.close();
		}
		
	}
}
