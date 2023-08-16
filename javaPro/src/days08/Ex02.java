package days08;

public class Ex02 {
	public static void main(String[] args) {
		char one = 'x';
		System.out.println(myUpperCase(one));
	}

	public static char myUpperCase(char one) {
		if('a' <= one && one <= 'z')
			one = (char)(one-32);
		return one;
	}
}
