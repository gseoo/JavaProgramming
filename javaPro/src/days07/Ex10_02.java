package days07;

public class Ex10_02 {
	public static void main(String[] args) {
		int result = 0;
		
		result = sum(1,2);
		System.out.println(result);
		
		result = sum(1,2,3);
		System.out.println(result);
		
		result = sum(1,2,3,4,5,6,7);
		System.out.println(result);
		
		int [] m = {100, 200, 300, 400};
		result = sum(m);
		System.out.println(result);
	}
	
	// 가변인자 사용
	
	public static int sum(int... n) {
		int result=0;
		for(int i=0; i<n.length; i++) {
			result+=n[i];
		}
		return result;
	}
}
