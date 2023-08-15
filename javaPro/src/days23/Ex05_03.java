package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ex05_03 {
	public static void main(String[] args) {
		int score[] = {80,95,50,85,45,65,10,100};
		
		/*
		// [1] 
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<score.length; i++) {
			ts.add(score[i]);
		}
		*/
		
		// [2] int [] -> ArrayList -> TreeSet (봐두기만 하기)
		// IntStrean -> Integer Stream 변환
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());
		TreeSet<Integer> ts = new TreeSet<Integer>(list);
		
		// 1) 75보다 큰 점수를 얻어와서 출력
		NavigableSet<Integer> ss = ts.tailSet(75, false);
		System.out.println(ss); // [80, 85, 95, 100]
		
		// 2) 50보다 작은 점수를 얻어와서 출력
		NavigableSet<Integer> ss2 = ts.headSet(50, false);
		System.out.println(ss2); // [10, 45]
		
		// 3) 50~75 사이의 점수를 얻어와서 출력
		NavigableSet<Integer> ss3 = ts.subSet(50, false, 75, false);
		System.out.println(ts.subSet(50, 75)); // [50, 65]
	}
}
