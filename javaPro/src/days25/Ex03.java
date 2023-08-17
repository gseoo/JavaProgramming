package days25;

public class Ex03 {
	//enum Direction {EAST, SOUTH, WEST, NORTH}
	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400, "▲");
		
		private final int value;
		private final String symbol;
		
		/*
		Direction(int value) {
			this.value = value;
			this.symbol = "";
		}
		*/
		
		Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;
		}

		public int getValue() {
			return value;
		}

		public String getSymbol() {
			return symbol;
		}
		
		// 추상 메소드 선언 가능
	}
	
	public static void main(String[] args) {
		// [열거형에 멤버 추가]
		
		/*
		[열거형 구조 이해]
		
		1. enum Direction {EAST, SOUTH, WEST, NORTH}
		2. 컴파일러가 열거형을 클래스로 변환
		   class Direction extends Enum {
		     static fianl Direction EAST = new Direction("EAST");
		     static fianl Direction SOUTH = new Direction("SOUTH");
		     static fianl Direction WEST = new Direction("WEST");
		     static fianl Direction NORTH = new Direction("NORTH");
		     
		     private tring name;
		     private Direction(String name) {
		       this.name = name;
		     }
		     
		     private int ordinal;
		     public int ordinal() {
		       return this.ordinal;
		     }
		     // 등등
		     
		   }
		 */
		
		
		// ordinal() 메소드에 의해서 열거형 상수를 사용하는데 상수값은 순서를 반환
		// 내가 원하는 정수값을 설정해서 사용할 수 있음
		
		Direction [] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(dir.name() + "/" + dir.ordinal() + "/"
					+ dir.getSymbol() + "/" + dir.getValue());
		}
		
/*
EAST/0/▶/100
SOUTH/1/▼/200
WEST/2/◀/300
NORTH/3/▲/400
*/
		
	}
}
