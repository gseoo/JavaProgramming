package days07;

public class Ex10 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		int result = sum(a,b);
		int result2 = sum(a,b,c);
		int result3 = sum(a,b,c,d);
		
		System.out.printf("%d+%d=%d\n",a,b,result);
		System.out.printf("%d+%d+%d=%d\n",a,b,c,result2);
		System.out.printf("%d+%d+%d+%d=%d\n",a,b,c,d,result3);
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
}
