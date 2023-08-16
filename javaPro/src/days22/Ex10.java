package days22;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {
	public static void main(String[] args) {
		
		/*
		[큐(Queue)]
		- FIFO(First In First Out) 구조
		- 데이터 삽입 : offer()
		- 데이터 반환 : poll();
		- 마지막 값 읽기 : peek();
		- Collection 인터페이스를 상속받은 인터페이스
		
		[Deque]
		
		*/
		/*
		Queue q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
			//String name = (String) q.remove();
			//System.out.println(name);
		}
		*/
		
		
		Deque q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		q.offerFirst("홍길동");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
	}
}
