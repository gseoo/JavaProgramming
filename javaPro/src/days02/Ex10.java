package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	public static void main(String[] args) throws IOException {
		
		byte age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이를 입력하세요 : ");
		
		String inputData = br.readLine();
		age = Byte.parseByte(inputData);
		
		System.out.printf("나이는 %d살", age);
	}
}
