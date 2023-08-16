package days09;

public class Ex03 {
	public static void main(String[] args) {
		
		// [주민등록번호]
		// 1. 주민번호
		// 2. 생년월일
		// 3. 나이
		// 4. 성별
		// 5. 내/외국인
		// 6. 검증번호
		
		String rrn = "890123-1700001";
		String birth = getBirth(rrn); // 주민등록번호를 매개변수로 받아 생일을 돌려주는 함수
		System.out.println(birth);
	}
	
	// 성별에 해당되는 ㅅ을 돌려주는 함수
	public static int getGender(String rrn) {
		//return Integer.parseInt(rrn.substring(7,8));
		return rrn.charAt(7)-'0';  // '0' = 48
	}

	private static String getBirth(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));
		int month =Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));
		int ㅅ = getGender(rrn);
		
		int centry = 1800;
		switch (ㅅ) {
		case 1: case 2: case 5: case 6:
			centry = 1900; break;
		case 3: case 4: case 7: case 8:
			centry = 2000; break;
		case 9: case 0:
			centry = 1800; break;
		}
		year = centry + year;
		String birthday = String.format("%d.%d.%d\n", year, month, day);
		
		return birthday;
	}
}
