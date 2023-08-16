package days10;

import java.util.Arrays;

public class Ex04_02 {
	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		
		// 추가, 삽입
		
		/*
		// [수정]
		int index = 2;
		m[2] = 100;
		*/
		
		/*
		// [삭제] - 함수
		int index = 2;
		int temp[] = new int[m.length-1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index+1, temp, index, m.length-index-1);
		m=temp;
		*/
		
		// [삭제] - 로직
		int index = 2;
		int temp[] = new int[m.length-1];
		for(int i=0; i<m.length; i++) {
			if(index>i) temp[i] = m[i];
			else if(index<i) temp[i-1] = m[i];
		}
		m=temp;
		
		
		
		
		System.out.println(Arrays.toString(m));
	}
}
