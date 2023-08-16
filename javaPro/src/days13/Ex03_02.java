package days13;

public class Ex03_02 {
	public static void main(String[] args) {
		
		// 배열 에러
		// java.lang.ArrayIndexOutOfBoundsException
		//int []m = new int[2];
		
		// java.lang.NullPointerException
		int m[] = null;
		m[2] = 100;
		System.out.println(m[2]);
	}
}
