package days10;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author 이경서
 * @date 2023. 7. 26. - 오후 4:43:12
 * @subject
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		int score[] = new int[20];
		// 0~100 임의의 수
		int max=0, min=100;
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*101);
			if(score[i]>max)
				max = score[i];
			else if(score[i]<min)
				min = score[i];
		}
		
		// [람다식과 스트림]
		max = IntStream.of(score).max().getAsInt();
		min = IntStream.of(score).min().getAsInt();
		int sum = IntStream.of(score).sum();
		double avg = IntStream.of(score).average().getAsDouble();

		
		System.out.println(Arrays.toString(score));
		// 출력
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
	}
}
