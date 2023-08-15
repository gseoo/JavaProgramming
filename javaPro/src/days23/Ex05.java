package days23;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		// Set : HashSet, LinkedHashSet, [TreeSet]
		
		/*
		[TreeSet]
		1. 중복 허용 x, 순서 유지 x
		2. 이진 검색 트리라는 자료 구조로 데이터 저장하는 컬렉션 클래스
		3. 이진 검색 트리 : 검색, 정렬, 범위 검색할 때 성능이 뛰어남
		4. 노드가 서로 연결된 구조(LinkedList처럼)
		5. 최상위 노드 : 루트(root) 노드
		   부모-자식 노드 관계
		   형제 노드 관계
 		6. 트리 노드
 		   class Tree Node{
 		   		TreeNode left; // 왼쪽 자식노드
 		   		Object element;
 		   		TreeNode right; // 오른쪽 자식노드
 		   }
		*/
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts); // [1, 4, 5, 6, 7, 9]
		
		System.out.println(ts.first()); // 1
		System.out.println(ts.last()); // 9
		
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println(ss); // [4, 5, 6]
		
		// 지정된 값(1)보다 큰 값을 가진 가장 가까운 값
		System.out.println(ts.higher(1)); // 4 
		System.out.println(ts.lower(4)); // 1
		
		// 지정된 값(3)과 같은 객체를 반환
		// 트리 구조에 3값이 없으면 가진 객체 중 가장 가까운 값을 반환
		// 없으면 null 반환
		System.out.println(ts.floor(3)); // 1
		
		// floor 반대 - 가까운 가장 큰 값
		System.out.println(ts.ceiling(3)); // 4
	}
}
