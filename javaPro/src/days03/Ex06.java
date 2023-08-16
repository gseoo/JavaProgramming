package days03;

/**
 * @author 이경서
 * @date 2023. 7. 17. - 오후 3:11:45
 * @subject 삼항연산자 ?:
 * @content 항1 ? 항 2 : 항 3    -- 항1은 true/false로 판단될 수 있는 수식
 * 				항1 true >> 항2
 * 				항1 false >> 항3
 * 
 */
public class Ex06 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = x> 20 ? 100 : 200;
		
		System.out.printf("x = %d, y = %d\n", x, y);
	}
}
