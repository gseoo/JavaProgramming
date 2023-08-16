package days05;

public class Ex06 {
	public static void main(String[] args) {
		int i=10, sum=0;
		while(i >= 1) {
			sum+=i;
			System.out.printf("%d+", i);
			i--;
		}
		System.out.printf("=%d", sum);
	}
}
