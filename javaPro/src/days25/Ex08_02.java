package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

public class Ex08_02 {
	public static void main(String[] args) throws IOException {
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "public class Ex03 {\r\n"
				+ "	//enum Direction {EAST, SOUTH, WEST, NORTH}\r\n"
				+ "	enum Direction {\r\n"
				+ "		EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400, \"▲\");\r\n"
				+ "		\r\n"
				+ "		private final int value;\r\n"
				+ "		private final String symbol;\r\n"
				+ "		\r\n"
				+ "		/*\r\n"
				+ "		Direction(int value) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = \"\";\r\n"
				+ "		}\r\n"
				+ "		*/\r\n"
				+ "		\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return value;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return symbol;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		// 추상 메소드 선언 가능\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		// [열거형에 멤버 추가]\r\n"
				+ "		\r\n"
				+ "		/*\r\n"
				+ "		[열거형 구조 이해]\r\n"
				+ "		\r\n"
				+ "		1. enum Direction {EAST, SOUTH, WEST, NORTH}\r\n"
				+ "		2. 컴파일러가 열거형을 클래스로 변환\r\n"
				+ "		   class Direction extends Enum {\r\n"
				+ "		     static fianl Direction EAST = new Direction(\"EAST\");\r\n"
				+ "		     static fianl Direction SOUTH = new Direction(\"SOUTH\");\r\n"
				+ "		     static fianl Direction WEST = new Direction(\"WEST\");\r\n"
				+ "		     static fianl Direction NORTH = new Direction(\"NORTH\");\r\n"
				+ "		     \r\n"
				+ "		     private tring name;\r\n"
				+ "		     private Direction(String name) {\r\n"
				+ "		       this.name = name;\r\n"
				+ "		     }\r\n"
				+ "		     \r\n"
				+ "		     private int ordinal;\r\n"
				+ "		     public int ordinal() {\r\n"
				+ "		       return this.ordinal;\r\n"
				+ "		     }\r\n"
				+ "		     // 등등\r\n"
				+ "		     \r\n"
				+ "		   }\r\n"
				+ "		 */\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "		// ordinal() 메소드에 의해서 열거형 상수를 사용하는데 상수값은 순서를 반환\r\n"
				+ "		// 내가 원하는 정수값을 설정해서 사용할 수 있음\r\n"
				+ "		\r\n"
				+ "		Direction [] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(dir.name() + \"/\" + dir.ordinal() + \"/\"\r\n"
				+ "					+ dir.getSymbol() + \"/\" + dir.getValue());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "/*\r\n"
				+ "EAST/0/▶/100\r\n"
				+ "SOUTH/1/▼/200\r\n"
				+ "WEST/2/◀/300\r\n"
				+ "NORTH/3/▲/400\r\n"
				+ "*/\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "";


		// [문제] 문자열에서 [20번째 라인]의 문자열을 line20 변수에 저장한 후 출력

		/*
		// [1]
		String [] datas = source.split("\r\n");
		String line20 = datas[19];
		System.out.println(line20);
		 */

		/*
		// [2]
		// 라인 단위로 처리할 수 있는 보조스트림 사용
		StringReader sr = new StringReader(source);
		BufferedReader br = new BufferedReader(sr);

		int count = 1;
		while(count++<=19) br.readLine();
		String line20 = br.readLine();
		System.out.println(line20);
		*/
		
		
		// [3]
		String [] datas = source.split("\r\n");
		String line20 = Stream.of(datas).skip(19).findFirst().get();
		System.out.println(line20);
	}
}

