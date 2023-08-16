package days08;

public class Ex09_03 {
	public static void main(String[] args) {
		int lotto[] = new int[6];
		fillLotto(lotto);
		dispLotto(lotto);
	}

	private static void fillLotto(int[] lotto) {
		int index = 0;
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] =  lottoNumber;
		boolean flag = false;	

		while(index<=5) {
			flag = false;
			lottoNumber = (int)(Math.random()*45)+1;

			// 중복이 되면 true, 중복이 되지 않으면 false를 반환하는 함수
			if(!isDuplicateLotto(lotto, lottoNumber, index))
				lotto[index++] =  lottoNumber;
		}
	}

	public static void dispLotto(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("lotto[%d] = [%d]", i, lotto[i]);
			System.out.println();
		}
	}
	
	public static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		for(int i=0; i<index; i++) {
			if(lotto[i]==lottoNumber)
				return true;
		}
		return false;
	}
}
