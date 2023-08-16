package days14;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 객체 생성 시 1000L 값으로 필드 초기화
		Random rnd = new Random(1000L);
		
		Scanner sc =  new Scanner(System.in);
		
		/*
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
		*/
		
		int year = 2023;
		int month = 10;
		int day = 25;
		Date d = new Date(year-1900, month-1, day);
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
		
		System.out.println(d.getDay()); // 요일
	}
}
