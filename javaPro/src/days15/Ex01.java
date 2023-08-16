package days15;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";  
		
		char nArr[] = n.toUpperCase().toCharArray();
		char mArr[] = m.toUpperCase().toCharArray();
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);
		System.out.println(n.equals(m));
		
		
		/*
		n = n.toUpperCase();
		m = m.toUpperCase();
		
		char [] nArr = n.toCharArray();
		Arrays.sort(nArr);
		
		char [] mArr = m.toCharArray();
		Arrays.sort(mArr);
		
		n = String.valueOf(nArr);
		m = String.valueOf(mArr);
		
		System.out.println(n.equals(m));
		*/
		
	}
}
