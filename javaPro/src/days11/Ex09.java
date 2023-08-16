package days11;

import java.util.Scanner;

public class Ex09 {
	static int gameNumber = 0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("> 로또 게임 횟수 입력 ? ");
		gameNumber = sc.nextInt();

		int lottos[][] = new int[gameNumber][6];

		fillLotto(lottos);
		dispLotto(lottos);

		sc.close();
	}

	private static void dispLotto(int[][] lottos) {
		for(int j=0; j<gameNumber; j++) {
			System.out.printf("[%d 게임]\t", j+1);
			for(int i=0; i<6; i++) {
				System.out.printf("[%02d]", lottos[j][i]);
			}
			System.out.println();
		}
	}

	private static void fillLotto(int[][] lottos) {
		int lottoNumber = (int)(Math.random()*45)+1;
		for(int i=0; i<gameNumber; i++) {
			for(int index=0; index<6; index++) {
				lottos[i][index] = lottoNumber;
				boolean flag = false;	

				while(index<=5) {
					flag = false;
					lottoNumber = (int)(Math.random()*45)+1;

					// 중복이 되면 true, 중복이 되지 않으면 false를 반환하는 함수
					if(!isDuplicateLotto(lottos, lottoNumber, index))
						lottos[i][index++] =  lottoNumber;
				}
			}
		}
	}

	private static boolean isDuplicateLotto(int[][] lottos, int lottoNumber, int index) {
		for(int j=0; j<gameNumber; j++) {
			for(int i=0; i<index; i++) {
				if(lottos[j][i]==lottoNumber)
					return true;
			}
		}
		return false;
	}
}
