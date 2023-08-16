package days11;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int m[] = {3,5,2,4,1};

		// 버블정렬
		// 0-0 0-1 0-2 0-3 
		// 1-0 1-1 1-2 
		// 2-0 2-1 
		// 3-0
		bubbleSort(m);

		// 선택정렬
		// 0-1 0-2 0-3 0-4
		// 1-2 1-3 1-4
		// 2-3 2-4
		// 3-4
		selectionSort(m);
		
		selectionSort2(m);
		
		// 삽입정렬
		// 1-0
		// 2-1 2-0
		// 3-2 3-1 3-0
		// 4-3 4-2 4-1 4-0
		insertionSort(m);
		
		// 병합정렬
		
	}
	
	private static void insertionSort(int[] m) {
		for(int i=1; i<m.length; i++) {
			int temp = m[i];
			for(int j=i-1; j>0; j--) {
				if(m[j]>temp) {
					m[i]=m[j];
					m[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(m));
	}

	// 그냥 선택 정렬보다 향상된 성능을 가짐
	// 한 회전이 다 끝난 후에 최솟값과 m[i] 자리 바꿈
	private static void selectionSort2(int[] m) {
		for(int i=0; i<m.length-1; i++) {
			int index = i;
			for(int j=i+1; j<m.length; j++) {
				if(m[j]<m[index]) index = j;
			}
			int temp = m[i];
			m[i] = m[index];
			m[index] = temp;
		}
		System.out.println(Arrays.toString(m));
	}

	private static void selectionSort(int[] m) {
		for(int i=0; i<m.length-1; i++) {
			for(int j=i+1; j<m.length; j++) {
				if(m[j]<m[i]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(m));
	}

	public static void bubbleSort(int m[]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<4-i; j++) {
				if(m[j+1]<m[j]) {
					int temp = m[j+1];
					m[j+1] = m[j];
					m[j]  = temp;
				}
			}
		}
		System.out.println(Arrays.toString(m));
	}
}
