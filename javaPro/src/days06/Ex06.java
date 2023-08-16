package days06;

public class Ex06 {
	public static void main(String[] args) {
		
		// 구구단 출력
		// 2단
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("[%d단]\n", dan);
			for(int i=1; i<=9; i++)
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			System.out.println();
		}
	}
}
