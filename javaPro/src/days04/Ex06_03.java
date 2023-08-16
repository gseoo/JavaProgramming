package days04;


// \b : 출력할 때 마지막 문자 지움
public class Ex06_03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.printf( i==10 ? "%d" : "%d+", i);	
			sum += i;
		}
		
		System.out.printf("\b = %d",sum);
	}
}