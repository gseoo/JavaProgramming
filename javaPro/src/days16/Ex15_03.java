package days16;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 8. 3. - 오후 4:43:23
 * @subject [개발자가 강제로 예외 발생시키기]
 * @content	1. new 예외클래스() -> 예외 객체 생성
 * 			2. throw문을 사용해서 생성된 예외를 발생시킴
 * 			
 * 			예) 국어 점수 입력받아서 수~가 등급 처리
 * 				0 <= 국어점수 <= 100 범위가 벗어나면 예외 발생시켜서 처리
 */
public class Ex15_03 {
	public static void main(String[] args) {
	
//		BufferedReader br;
//		br.readLine();
		
		// [checked 예외] Exception 상속받음
		// Unhandled exception type IOException
		// public abstract int read() throws IOException;
		//System.in.read();
		
		// [unchecked 예외] RuntimeException 상속받음
		// class IOException extends Exception { }
		//int kor = getScore();
		//System.out.println(kor);
		

		try {
			int kor = getScore();
			System.out.println(kor);
		} catch(ScoreOutOfBoundException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

		
	private static int getScore() throws ScoreOutOfBoundException{
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.print("> 점수 입력 ? ");
		String input = sc.next();
		String regex = "100|[1-9]?\\d";
		
		if(input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			// 개발자가 고의로 예외 발생시키기
			throw new ScoreOutOfBoundException("> 점수 범위(0~100) 벗어남!!");
		}
		
		
	}
}
