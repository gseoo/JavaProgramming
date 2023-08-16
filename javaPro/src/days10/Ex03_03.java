package days10;

import java.util.Arrays;

public class Ex03_03 {
	public static void main(String[] args) {
		/*
		//1. Arrays.copyOfRange
		int [] arr = {1,2,3,4,5};
		int [] arrCopy = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));
		*/
		
		int [] m =  new int[3];
		m[0] = 5;
		m[1] = 3;
		m[2] = 7;
		
		int index = 3;
		if(index == m.length) {
			int [] temp = new int[m.length+3];
			
			// 2. arraycopy(m, 0, temp, 0, m.length)
			System.arraycopy(m, 0, temp, 0, m.length);
			m = temp;
		}

		m[3] = 10;
		System.out.println(Arrays.toString(m));
	}
}
