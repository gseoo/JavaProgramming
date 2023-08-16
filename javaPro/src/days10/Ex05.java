package days10;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int m[] = new int[10];
		for(int i=0; i<m.length; i++) {
			m[i] = i+1;
		}
		System.out.println(Arrays.toString(m));
		
		// 0~9 번째 방 중 랜덤 두 수 선택 -> 자리 바꾸기 -> 10번 실행
		shuffle(m);
	}

	
	
	/*
	private static void shuffle(int[] m) {
	int a; int b; int temp;
		for(int i=0; i<10; i++) {
			int a; int b;

			a = (int)(Math.random()*m.length);
			b = (int)(Math.random()*m.length);

			if(a==b) {
				i--;
				continue;
			}
			
			temp = m[a];
			m[a] = m[b];
			m[b] = temp;

		}
		System.out.println(Arrays.toString(m));
	}
	*/
	
	private static void shuffle(int[] m) {
		int ridx1, temp;
		for(int i=0; i<10; i++) {
			ridx1 = (int)(Math.random()*9)+1;

			temp = m[0];
			m[0] = m[ridx1];
			m[ridx1] = temp;

		}
		System.out.println(Arrays.toString(m));
	}
}
