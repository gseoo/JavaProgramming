package days02;

/**
 * @author 이경서
 * @date 2023. 7. 14. - 오전 11:06:51
 * @subject 표준 입력(in), 표준 출력(out) -> System 클래스
 * @content 객체 == 개체 == object == 클래스 == 물건
 * 					System 클래스 안에 [표준 출력 함수]
 * 					1. println() void	println​(char x)
 * 					2. printf() PrintStream	printf​(String format, Object... args)
 * 					3. print() void	print​(int i)
 */

public class Ex05 {
	public static void main(String[] args) {
		//System.out.printf("홍길동").printf("20");
		
		System.out.println("ㅇㅇㅇ");
		System.out.println("ㄴㄴㄴ");
		System.out.println("ㅁㅁㅁ");
		
		//개행 방법
		System.out.print("ㅇㅇㅇ" + '\n');
		System.out.print("ㄴㄴㄴ\n");
		System.out.print("ㅁㅁㅁ");
		System.out.println(); //개행
		System.out.print("ㅂㅂㅂ");
		
	}

}
