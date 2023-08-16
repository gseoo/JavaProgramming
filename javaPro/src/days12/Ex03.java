package days12;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 이진검색 : 필수조건->정렬이 되어 있어야 함
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		System.out.println(Arrays.toString(m));

		int n = 111;

		int index = binarySearch(m,n);

		if(index==-1)
			System.out.println("찾는 정수 없음");
		else
			System.out.println(index + " 위치에 있음");
	}

	private static int binarySearch(int[] m, int n) {
		//					0			  49
		// 0~m.length-1   bottom  24	top 저장
		// 						middle
		//						m[middle]
		// m[middle] == n : 
		// m[middle] > n  : top = middle-1
		// m[middle] < n  : bottom = middle+1
		// bottom==top==middle까지 체크

		int bottom = 0;
		int top = m.length-1;
		int middle;
		int count = 0;

		while(bottom<=top) {
			count++;
			middle = (bottom + top)/2;
			if(m[middle]==n) {
				System.out.println("> 찾은 횟수 : " + count);
				return middle;
			}
			else if(m[middle]>n) top = middle - 1;
			else bottom = middle + 1;
		}
		System.out.println("> 못 찾은 횟수 : " + count);
		return -1;
	}
}
