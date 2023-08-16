package days04;

public class Ex02 {
	public static void main(String[] args) {
		
		// trim() : 앞뒤 공백 제거/ 매개변수 필요없음/ 리턴값 : 앞뒤 공백을 제거한 string 값
		
		String sKor = "  90  ";
		int kor = Integer.parseInt(sKor.trim());
		System.out.printf("kor=%d",kor);
		
	}

}
