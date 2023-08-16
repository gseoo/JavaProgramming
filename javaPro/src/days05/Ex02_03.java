package days05;

public class Ex02_03 {
	public static void main(String[] args) {
		
		/* 1. 직접 배열 선언 후 for문 사용해서 값 넣어주기
		String name = "kenik";
		
		// String to char[] --> char[0]
		char [] nameArr = new char[name.length()];
		for(int i=0; i<name.length(); i++) 
			nameArr[i] = name.charAt(i);
		*/
		
		
		//2. 
		String name = "kenik";
		char [] arr = name.toCharArray();
		System.out.println(arr[0]);
	
	
		
	}
}