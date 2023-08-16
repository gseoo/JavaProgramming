package days08;

public class Ex09_02 {
	public static void main(String[] args) {

		// 배열을 초기화하지 않으면 기본형의 초기값으로 설정(기본형: int, 초기값:0)
		int lotto[] = new int[6];
		fillLotto(lotto);
		dispLotto(lotto);

	}

	// 중복되지 않는 로또번호로 배열을 다 채우도록 코딩 	
	// while문 -> 중복되지 않게 6개 배열을 다 채울 때까지
	// index = 0
	// int lottoNumber = (int)(Math.random()*45)+1; lotto[i] = lottoNumber;
	private static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] =  lottoNumber;
		boolean flag = false;		// 로또 번호가 중복이 되면 true 할당

		while(index<=5) {
			flag = false;
			lottoNumber = (int)(Math.random()*45)+1;

			for(int i=0; i<index; i++) {
				if(lotto[i]==lottoNumber) {
					flag = true;
					break;
				}
			}
			
			if(!flag) lotto[index++] =  lottoNumber;


		}
	}

	public static void dispLotto(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("lotto[%d] = [%d]", i, lotto[i]);
			System.out.println();
		}
	}
}
