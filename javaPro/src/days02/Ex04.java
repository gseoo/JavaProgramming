package days02;

// 두 기억공간의 값 바꾸기
public class Ex04 {

	public static void main(String[] args) {
		// 두 정수를 저장할 x, y 변수를 선언하고
		// 각각 10, 20으로 초기화하고
		// 출력형식: x=10, y=20
		
		
		//동일한 자료형일 경우에는 콤마 연산자를 사용해서 나열할 수 있음
		int x=10, y=20, temp=0;
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);
		
		//프로그램 상에서 두 기억공간의 값을 교환하려면 반드시 동일한 자료형의 임시기억공간이 필요함
		
		temp = x;
		x = y;
		y = temp;
		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);

	}

}
