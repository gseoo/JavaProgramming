package days19;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

public class Ex03 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가";
		byte[] bArr = str.getBytes("UTF-8");
		printByteArr(bArr); // 한글 한 문자 3바이트 처리
		String s = new String(bArr, "UTF-8");
		System.out.println(s); // 바이트를 다시 한 문자로
		
		bArr = str.getBytes("EUC-KR");
		printByteArr(bArr); // 한글 한 문자 2바이트 처리
		s = new String(bArr, "EUC-KR");
		System.out.println(s); // 바이트를 다시 한 문자로
	}

	
	private static void printByteArr(byte[] bArr) {
		
		StringJoiner sj = new StringJoiner(":", "[", "]");
		
		for (int i = 0; i < bArr.length; i++) {
			sj.add(String.format("%02x",bArr[i]));
		}
		System.out.println(sj.toString());
	}
	
}
