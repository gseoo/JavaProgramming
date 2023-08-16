package days08;

public class Ex11 {
	public static void main(String[] args) {
		/* 내 풀이
		int money = 125760;
		int count = 0;
		// 5만원 : 2개
		// 1만원 : 2개
		// 5천원 : 1개
		// 1천원 : 0개
		// 5백원 : 1개
		// 1백원 : 2개
		// 50원 : 1개
		// 10원 : 1개
		// 5원 : 0개
		// 1원 : 0개
		
		int a = money/50000;
		int b = (money%50000)/10000;
		int c = (money%10000)/5000;
		int d = (money%5000)/1000;
		int e = (money%1000)/500;
		int f = (money%500)/100;
		int g = (money%100)/50;
		int h = (money%50)/10;
		int i = (money%10)/5;
		int j = (money%5)/1;
		
		System.out.printf("5만원: %d개\n1만원: %d개\n5천원: %d개\n1천원: %d개\n"
				+ "5백원: %d개\n1백원: %d개\n50원: %d개\n10원: %d개\n5원: %d개\n"
				+ "1원: %d개\n",a,b,c,d,e,f,g,h,i,j);
		*/
		
		 int money = 125760;
	      int count = 0; // 화폐수량
	      
	      // 5만원 : 2개
	      count = money/50000;
	      System.out.printf("5만원 : %d개\n", count);      
	      money %= 50000;   // 25760
	      
	      // 1만원 : 2개
	      count = money/10000;
	      System.out.printf("1만원 : %d개\n", count);      
	      money %= 10000; 
	      
	      // 5천원 : 1개
	      count = money/5000;
	      System.out.printf("5천원 : %d개\n", count);      
	      money %= 5000; 
	      
	      // 1천원 : 0개
	      count = money/1000;
	      System.out.printf("1천원 : %d개\n", count);      
	      money %= 1000;
	      
	      // 5백원 : 1개
	      count = money/500;
	      System.out.printf("5백원 : %d개\n", count);      
	      money %= 500; 
	      
	      // 1백원 : 2개
	      count = money/100;
	      System.out.printf("1백원 : %d개\n", count);      
	      money %= 100; 
	      
	      // 5십원 : 1개
	      count = money/50;
	      System.out.printf("5십원 : %d개\n", count);      
	      money %= 50;
	      
	      // 1십원 : 1개
	      count = money/10;
	      System.out.printf("1십원 : %d개\n", count);      
	      money %= 10; 
	      
	      //   5원 : 0개
	      count = money/5;
	      System.out.printf("5원 : %d개\n", count);      
	      money %= 5;
	      
	      //   1원 : 0개
	      count = money/1;
	      System.out.printf("1원 : %d개\n", count);      
	      money %= 1; 

	}
}
