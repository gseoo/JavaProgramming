package days08;

public class Ex01 {
	public static void main(String[] args) {
		int fTerm = 1;
		int sTerm = 1;
		int nextTerm=0;
		int sum = fTerm + sTerm;
		System.out.printf("%d+%d+", fTerm, sTerm);
		
		for(int i=3; i<=10; i++) {
			nextTerm = fTerm + sTerm;
			System.out.printf(i==10 ? "%d" : "%d+", nextTerm);
			sum+=nextTerm;
			fTerm = sTerm;
			sTerm = nextTerm;
		}
		System.out.printf("=%d",sum);
	}
}
