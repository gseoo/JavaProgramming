package days03;

public class Ex07 {

	public static void main(String[] args) {
		
		char lowerCase, upperCase;
		lowerCase = 'x';
		
		//upperCase라는 변수에는 loserCase의 대문자를 저장해서 출력하는 코딩
		//소문자 - 32 = 대문자
		upperCase = (char) (lowerCase - 32);
		System.out.printf("%c", upperCase);
		
		lowerCase = (char) (upperCase + 32);
		System.out.printf("%c", lowerCase);
		
		// '0' = 48
		// '2' = 50
		// '4' = 52
		//                          52 - 50
		System.out.println('4' - '2');  //2

	}

}
