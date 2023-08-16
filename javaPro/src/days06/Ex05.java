package days06;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int n = 0;
		
		try (Scanner sc = new Scanner(System.in)){
			// nextInt() : 문자 x, 실수 x, 정수 입력
			System.out.print("> 정수(n) 입력 ? ");
			String inputData = sc.nextLine();
			char [] idArr = inputData.toCharArray();
			
			boolean flag = false; // 숫자가 아닌 게 있으면 true로 바꿈
			
			for(int i=0; i<idArr.length; i++) {
				if(!(idArr[i]>='0' && idArr[i]<='9')) {
					flag = true;
					break;
				}
			}
			
			// if(flag==true) : if 문은 조건문이 true일 때 실행되므로 생략해줘도 됨
			// if(!flag) = if(flag==false)
			if(flag) {
				System.out.println("잘못 입력");
			} else {
				n = Integer.parseInt(inputData);
				System.out.println(n);
			}
			
			
			// n = sc.nextInt();
			//System.out.println(n);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
