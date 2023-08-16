package days04;

public class Ex07_02 {
	public static void main(String[] args) {
		int sum = 0;
		
		// for문은 세미콜론으로 끝남
		// 뒤에 괄호는 for문의 괄호가 아니라 아래처럼 됨
		// {
		//  System.out.println("test");
		// }
		// if, else, for문은 괄호 안이 한 줄이면 괄호 생략 가능
		for(int i =10; i>=1; i--); {
			System.out.println("test");
		}
		System.out.printf("\b = %d",sum);
	}
}
