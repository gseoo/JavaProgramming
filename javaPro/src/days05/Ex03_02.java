package days05;

public class Ex03_02 {
	public static void main(String[] args) {

		for(int i='가'; i<='힣'; i++ ) {

			System.out.printf("%d[%c]", i,(char)i);
			if(i%10==9) 
				System.out.println();
		}

	}
}
