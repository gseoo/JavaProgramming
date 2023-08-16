package days07;

public class Ex06_02 {
	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10 = -5 (시험)
		// [스위치 변수 선언]
		
		boolean sw = false;
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			
			/*
			if(sw) {
				sum-=i;
				System.out.printf("%d+",i);
				//sw = false; 이거 두 개 대신에 sw = !sw;
			} else {
				sum+=i;
				System.out.printf("%d-",i);
				//sw = true;
			}
			*/
			
			sum+= sw ? -i : i;
			System.out.printf(sw ? "%d+" : "%d-", i);
			sw = !sw;
		}
		System.out.printf("=%d",sum);
	}
}
