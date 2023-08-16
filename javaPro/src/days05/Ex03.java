package days05;

// ASCII 256가지 찍어 보기

public class Ex03 {
	public static void main(String[] args) {
			// [문제] 한 라인에 10개씩 출력
			// [문제] 앞에 라인 번호를 붙이자.
			
		// 	
		for(int i=0, lineNumber =1; i<256; i++ ) {
			if(i%10==0) System.out.printf("%d: ",lineNumber++); 
			System.out.printf("[%c]", (char)i);
			if(i%10==9) 
				System.out.println();

		}
		
		// **내일 시험** 알파벳 출력, 숫자 출력, 대소문자 출력(중간에 다른 문자도 포함) 등등도 해 보기
	}
}
