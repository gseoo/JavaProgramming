package days03;

/**
 * @author 이경서
 * @date 2023. 7. 17. - 오후 3:04:25
 * @subject [ 전위형, 후위형, 증감연산자 설명]
 * @content 
 */
public class Ex05_07 {
	public static void main(String[] args) {
		
		int x = 10;
		//int y = ++x; // 전위형 > x = 11, y = 11
		int y = x--; // 후위형 > x = 9, y = 10
		
		// 단독으로 사용될 때는 전/후위형은 같은 결과
		// 대입 연산자를 같이 사용할 경우 결과가 달라짐
		
		System.out.printf(" x = %d, y = %d\n", x, y);
	}
}
