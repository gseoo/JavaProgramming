package days13;

public class Ex01 {
	public static void main(String[] args) {
		int [][] m = new int[5][5];
		fillM(m);
		disp(m);
	}

	private static void disp(int[][] m) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void fillM(int[][] m) {
		int k = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				m[i][j] = k++;
				m[i][4] += m[i][j];
				m[4][j] += m[i][j];
				m[4][4] += m[i][j];
			}
		}
	}
}
