package days09;

//‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
// ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
// 괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)


public class Ex03_03 {
	public static void main(String[] args) {
		/*
		주민등록번호(rrn)
		1. 생년월일
		2. 성별, 세기, 내국인/외국인
		3. 세는 나이, 만나이
		 */

		String rrn = "011209-4009917";
		boolean checkSum = checkRRN(rrn);
		if(checkSum) 
			System.out.println("올바른 주민등록번호");
		else
			System.out.println("잘못된 주민등록번호");
	}

/*
	private static boolean checkRRN(String rrn) {
		char c[] = rrn.replace("-", "").toCharArray();
		int a=2; int sum=0; int result;
		for(int i=0; i<c.length; i++) {
			sum += (c[i]-'0')*a;
			if(a==9) {
				sum += c[i]*a;
				a=2;
			}
			++a;
		}
	
		int i = 11-sum%11;
		if(rrn.charAt(13) ==(char)i) return true;
		else return false;
	}
*/
	
	private static boolean checkRRN(String rrn) {
		int total = 0;
		int ㄱ = rrn.charAt(0)-'0';
		int ㄴ = rrn.charAt(1)-'0';
		int ㄷ = rrn.charAt(2)-'0';
		int ㄹ = rrn.charAt(3)-'0';
		int ㅁ = rrn.charAt(4)-'0';
		int ㅂ = rrn.charAt(5)-'0';
		int ㅅ = rrn.charAt(7)-'0';
		int ㅇ = rrn.charAt(8)-'0';
		int ㅈ = rrn.charAt(9)-'0';
		int ㅊ = rrn.charAt(10)-'0';
		int ㅋ = rrn.charAt(11)-'0';
		int ㅌ = rrn.charAt(12)-'0';
		
		total += 2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ;
		int check = 11-total%11;
		if(check==10) check = 0;
		else if(check==11) check = 1;
		
		int ㅍ = rrn.charAt(13) - '0';
		
		
		return ㅍ == check;
		
	}

}
