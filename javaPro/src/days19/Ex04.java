package days19;

import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		// StringTokenizer 클래스
		String str = "고경림,김성준,김정주,김호영";
		// String [] str.split(regex)
		
		StringTokenizer st = new StringTokenizer(str,",");
		
//		System.out.println(st.countTokens()); // 4
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		/*
		// nextToken() : 다음 토큰을 가져오고 그 가져온 토큰은 st에서 지워버림
		int countToken = st.countTokens();
		for(int i=0; i<countToken; i++) {
			System.out.println(st.nextToken()); 
		}
		*/
		
		// 가져올 토큰이 있으면 true, 없으면 false 반환
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); 
		}
		
	}
}
