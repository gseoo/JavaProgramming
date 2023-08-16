package days22;

public class Ex08 {
	public static void main(String[] args) {
		
		/*
		[LinkedList 컬렉션 클래스]
		 1. 배열
		 	- 메모리상에 동일한 자료형으로 연속적으로 놓이게 한 것
		    - 장점 : 읽기 성능이 가장 빠름
		    - 단점 : 배열 크기 자동 조절 x, 삽입 삭제 속도가 매우 느림
		   
		 2. LinkedList
		 	1) 특징 : 비연속적
		 	2) 노드(Node) : LinkedList에 들어 있는 데이터
		 	   - 각 노드들은 연결돼 있다 (앞 노드의 주소값을 포함함)
		 	   	 [Node]  [[0x100]Node]  [[0x200]Node]
		 	   	 0x100       0x200			0x300
		 	   
		 	   - 단방향 환형 LinkedList
		 	   - 양(더블)방향 환형 LinkedList
		 	   - 환형 LinkedList : 마지막 노드가 첫 번재 노드의 주소값을 가짐
		*/
		
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 20;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 30;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 40;
		node3.next = node4;
		
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		
		node5.next = node4;
		
		node5.next = null;
		
	}
}

class Node {
	int value;
	Node next = null; // 다음 노드의 주소를 참조하는 필드
	// Node prev = null; // 이전 노드의 주소를 참조하는 필드
}