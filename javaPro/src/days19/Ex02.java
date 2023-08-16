package days19;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;

		/*
		String my_str = "abcdef123";
		int n = 3;
		 */

		String answer [] = Solution.solution(my_str, n);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution {
	public static String[] solution(String my_str, int n) {
		int len = (int) Math.ceil((double)my_str.length()/n);
		String ans[] = new String[len];
		String[] answer = new String[len];


		int beginIndex = 0, endIndex = 0;
		String str = null;
		int my_strLength = my_str.length();
		int index = 0;

		while(index != len) {
			endIndex = beginIndex + n;
			if( endIndex > my_strLength)  endIndex = my_strLength;
			str = my_str.substring(beginIndex, endIndex);
			answer[index++] = str;
			beginIndex = endIndex;

		}
		return answer;
		
		/*
		int i = 0, idx = 0;
		try {
		   for (             ; i < my_strLength ; i+=n, idx++) {
		       answer[idx] =   my_str.substring(i, i+n );
		     } 
		} catch (Exception e) {
		   answer[idx] =   my_str.substring(i);
		}
		 */
	}
}

/*
class Solution {
	public String[] solution(String my_str, int n) {
		int len = my_str.length()%n==0 ? my_str.length()/n : my_str.length()/n+1;
		String ans[] = new String[len];
		for(int i=0, d=1; i<len; i++, d++) {
			if(my_str.length()<n*d) ans[i] = my_str.substring(n*(d-1),my_str.length());
			else ans[i]= my_str.substring(n*(d-1),n*d);
		}
		return ans;
	}
}
 */