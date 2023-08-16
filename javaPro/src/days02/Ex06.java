package days02;
/**
 * 
 * @author 이경서
 * @date 2023. 7. 14. - 오전 11:42:45
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		String name = "이경서";        // %s
		int age = 23;                    // %d
		final double PI = 3.14;      //%f double은 소수점 6자리까지 출력
		char grade = 'A';               //%c
		
		System.out.printf("이름 : %s, 나이 : %d, PI = %f, 등급 : %c\n", name, age, PI, grade);

	}

}
