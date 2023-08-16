package days22;

import java.util.Stack;

public class Ex09 {
	public static void main(String[] args) {
		// Stack(스택)과 Queue(큐)
		
		/*
		 [스택]
		 - LIFO(Last In First Out) 구조
		 - 데이터 삽입 : push()
		 - 데이터 반환 : pop() - 마지막 요소 꺼내서 가져감
		 - 마지막 값 확인 : peek() - 안 가져가고 확인만 함
		 - index search() : 인덱스는 1부터 시작
		 */
		
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		
		System.out.println(s); // [유희진, 임경재, 김호영, 이지현]
		
		/*
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		//java.util.EmptyStackException
		System.out.println(s.pop());
		*/
		
		
		/*
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		*/
		
		/*
		System.out.println(s.peek()); // 이지현
		System.out.println(s.peek()); // 이지현
		System.out.println(s.peek()); // 이지현
		System.out.println(s.peek()); // 이지현
		*/
		
		System.out.println(s.search("임경재")); // 3
		
		// 스택 활용 : 브라우저 앞/뒤로
		
		
	}
}
