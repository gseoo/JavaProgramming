package days06;

public class Ex06_02 {
	public static void main(String[] args) {
		
		// [구구단] while문으로
		int dan = 2;
		int i=1;
		while (dan<=9) {
			System.out.printf("[%d단]\n", dan);
			while(i<=9) {
				System.out.printf("%d*%d=%d\n",dan, i, dan*i);
				i++;
			}
			i=1;
			dan++;
		}
	}
}
