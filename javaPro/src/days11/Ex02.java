package days11;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		
		// 순차탐색
		
		int [] m =  {3,5,2,4,1};
		int n = 4;
		int index = sequentialSearch(m,n);
		System.out.println("> index : " + index);
		
		int [] temp = new int[m.length+1];
		for(int i=0; i<m.length; i++) {
			if(i<index) temp[i] = m[i];
			else temp[i+1] = m[i];
			//temp[index>i ? i : i+1] = m[i]; <- if else랑 같은 의미
		}
		temp[index] = 100;
		m = temp;
		
		System.out.println(Arrays.toString(m));
	}

	private static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for(int i=0; i<m.length; i++) {
			if(m[i]==n) {
				index = i;
				break;
			}
		}
		return index;
	}
}
