package days02;

public class Ex15 {

	public static void main(String[] args) {
		
		int i =Integer.MAX_VALUE;		
		// 기본형(int) -> 물건(객체, object, 클래스) 사용하기 쉽도록 만들어놓은 래퍼클래스 >> Integer
		
		Integer.parseInt("20");
		
		// String -> byte 형 변환
		byte age = Byte.parseByte("20");
		// Long.parseLong(null);
		// Short.parseShort(null);
	}

}
