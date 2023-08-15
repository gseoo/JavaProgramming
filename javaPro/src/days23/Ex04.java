package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		// 1. a ∪ b 합집합 -> 1, 2, 3, 4, 5, 6, 7, 8
		/*
		// 중복 검사 해줘야 함
		ArrayList<Integer> hap = new ArrayList<Integer>();
		hap.addAll(a);
		Iterator<Integer> ir = b.iterator();
		while (ir.hasNext()) {
			Integer i = (Integer) ir.next();
			if(!a.contains(i)) hap.add(i);
		}
		System.out.println(hap); // [1, 2, 3, 4, 5, 6, 7, 8]
		*/
		
		// 애초에 중복을 허용하지 않는 컬렉션 클래스 사용
		HashSet<Integer> hap = new HashSet<Integer>();
		hap.addAll(a);
		hap.addAll(b);
		System.out.println(hap); // [1, 2, 3, 4, 5, 6, 7, 8]
		
		// 2. a - b 차집합 -> 1, 2, 3
		// 3. a ∩ b 교집합 -> 4, 5
		/*
		HashSet<Integer> cha = new HashSet<Integer>();
		cha.addAll(a);
		Iterator<Integer> ir = cha.iterator();
		while (ir.hasNext()) {
			Integer i = (Integer) ir.next();
			// ConcurrentModificationException : 수정하는 도중에 예외 발생 - 반복자 사용해서
			if(b.contains(i)) cha.remove(i);
		}
		System.out.println(cha);
		*/
		
		HashSet<Integer> cha = new HashSet<Integer>();
		HashSet<Integer> kyo = new HashSet<Integer>();

		Iterator<Integer> ir = a.iterator();
		while (ir.hasNext()) {
			Integer i = (Integer) ir.next();
			if(!b.contains(i)) cha.add(i);
			else kyo.add(i);
		}
		System.out.println(cha); // [1, 2, 3]
		System.out.println(kyo); // [4, 5]
	}
}
