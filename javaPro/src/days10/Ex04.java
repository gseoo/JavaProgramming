package days10;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 추가[append]  : 제일 마지막 요소에 추가
		// 삽입[insert]
		// 삽입 과정 : 배열 크기 증가 -> 원하는 index 이후 값들 뒤로 밀기 -> 삽입
		
		int index = 2;
		int n = 100;
		
		/*
		// 내 풀이 - 미완성
		if(index==m.length) {
			int temp[] = new int[m.length+1];
			System.arraycopy(m, 0, temp, 0, m.length);
			m = temp;
		}
		System.out.println(Arrays.toString(m));
		for(int i=m.length-1; i>3; i--) {
			m[i] = m[i-1];
		}
		m[2] = n;
		*/
		
		/*
		// [1] 함수 활용 - 가독성 ▼ 성능 ▲
		int [] temp = new int[m.length+1];
		
		System.arraycopy(m, 0, temp, 0, index);
		temp[index] = 100;
		System.arraycopy(m, index, temp, index+1, m.length-index);
		m = temp;
		System.out.println(Arrays.toString(m));
		*/
		
		// [2] 로직 구현 - 가독성 ▲ 성능 ▼
		int temp[] = new int[m.length+1];
		for(int i=0; i<m.length; i++) {
			if(index>i) temp[i] = m[i];
			else if(index<=i) temp[i+1] = m[i];	
		}
		temp[index] = 100;
		m=temp;
		System.out.println(Arrays.toString(m));
		
	}
}
