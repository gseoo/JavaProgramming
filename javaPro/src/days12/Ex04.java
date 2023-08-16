package days12;

public class Ex04 {
	public static void main(String[] args) {
		int m[][] = new int [5][5];
		
		//fillM(m); //01~25 순서
		//fillM02(m); //25~01 순서
		//fillM03(m); //밑에서부터 찍기
		//fillQ(m);//ㄹ자로 찍기 -> 카톡에 다른 문제들도 풀기
		
		magicSquare(m); //마방진
		dispM(m);
	}

	private static void magicSquare(int[][] m) {
		// 1) 첫 번째 행의 가운데 열 = 1
		// 2-1) 출력값이 5의 배수라면 행만 증가
		// 2-2) 행 감소, 열 증가 반복적으로 처리
		//        ㄴ 행=-1 -> 가장 큰 행값으로 처리
		//              ㄴ 열=5 -> 가장 작은 열값으로 처리
		int n=1;
		int row=0, col=2;
		while(n<=25) {
				m[row][col] = n;
				if(n%5==0) row++;
				else {
					row--; col++;
					if(col==5) col=0;
					else if(row==-1) row=4;
				}
				n++;
			}
	}

	private static void fillQ(int[][] m) {
		// [1] 방 찾아가기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(i%2==0) m[i][j] = 5*i+j+1;
				else m[i][4-j] = 5*i+j+1;
			}
		}

		// [1] 값 바꾸기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(i%2==0) m[i][j] = 5*i+j+1;
				else m[i][j] = 5*(i+1)-j;
			}
		}
		
	}

	private static void fillM03(int[][] m) {
		
		// 위치 찾아서 찍기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[m.length-1-j][i] = 5*i+j+1;
			}
		}
		
		/*
		// 값의 규칙을 찾아서 넣기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j] = 5-i + i*j;
			}
		}
		*/
	}

	private static void fillM02(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[m.length-1-i][m.length-1-j] = 5*i+j+1;
			}
		}
	}

	private static void fillM(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j] = 5*i+j+1; //열 크기*행갯수+열갯수+1;
			}
		}
	}

	private static void dispM(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
	}
}
