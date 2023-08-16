package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 이경서
 * @date 2023. 7. 26. - 오후 4:43:12
 * @subject
 * @content
 */
public class Ex08_02 {
	public static void main(String[] args) {
		// 0~100까지의 수 중 20개를 랜덤 생성해서 배열 만들기
		int score[] = new Random().ints(20,0,101).toArray(); 
		
		System.out.println(Arrays.toString(score));

	}
}
