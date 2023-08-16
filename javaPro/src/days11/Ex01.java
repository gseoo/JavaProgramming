package days11;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		int max = m[0];
		

		for(int i=1; i<m.length; i++) {
				if(m[i]>max) {
					max = m[i];
			}
		}
		
		System.out.printf("max = %d\n", max);
		
		int[] maxIndex = new int[m.length];
		int index = 0;
		for(int i=0; i<m.length; i++) {
			if(max==m[i]) maxIndex[index++] = i;
		}
		System.out.printf("index = %s\n",Arrays.toString(maxIndex));
		
		int arr[] = Arrays.copyOf(maxIndex, index);
		
		String s = "index = ";
		for(int i=0; i<arr.length; i++) {
			s += arr[i] + ", ";
		}
		System.out.println(s.substring(0,s.length()-2));
	}
}