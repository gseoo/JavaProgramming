package days14;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//[static 없을 때]
		//Ex09 obj = new Ex09();
		//obj.sum(0, 0);
		
		//클래스명.static명();
		//같은 클래스라 클래스명 생략
		sum(1,2);
		
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
}
