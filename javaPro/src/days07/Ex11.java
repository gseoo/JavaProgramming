package days07;

public class Ex11 {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int m[] = {x,y};

		System.out.printf("> x=%d, y=%d\n" , x, y);

		// 두 기억공간의 값 바꾸기
		/*
		int temp = x;
		x = y;
		y = temp;
		 */
		swap(m);
		System.out.printf("> x=%d, y=%d\n" , m[0], m[1]);
		// 얼요일에 다시 풀이
	}
	public static void swap(int m[]) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}


}

