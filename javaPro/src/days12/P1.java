package days12;

public class P1 {
	public static void main(String[] args) {
		int m[][] = new int [5][5];
		
		/*
		// [1] 방 찾아가기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(i%2==0) m[i][j] = 5*i+j+1;
				else m[i][4-j] = 5*i+j+1;
			}
		}
		*/
		
		/*
		// [1] 값 바꾸기
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(i%2==0) m[i][j] = 5*i+j+1;
				else m[i][j] = 5*(i+1)-j;
			}
		}
		*/
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m.length; j++) {
				
			}
		}
		
		
		
		
		// 출력
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			}
			System.out.println();
		}
	}
}
