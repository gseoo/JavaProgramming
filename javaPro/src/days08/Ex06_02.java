package days08;

//1~n 합 재귀함수

public class Ex06_02 {
	public static void main(String[] args) {
		int n = 10;
		int result=sum(n);
		System.out.printf("1~%d=%d\n", n, result);
		
		result = recursiveSum(n);
		System.out.printf("1~%d=%d\n", n, result);
	}

	private static int recursiveSum(int n) {
		if(n==1) return n;
		else	return n+recursiveSum(n-1);
	}
	
	private static int sum(int n) {
		int result = 0;
		for(int i=1; i<=n; i++) 
			result += i;
		return result;
	}
}
