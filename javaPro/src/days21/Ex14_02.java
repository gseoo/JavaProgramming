package days21;

// 안 봐도 됨 - 참고용
// 나중에 배움

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//1조
//이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 
//2조
//박민석(팀장), 유희진, 고경림, 임경재, 이지현 , 김정주, 김호영
//3조
//박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
//
//팀장/팀카톡방/팀명

public class Ex14_02 {
	public static void main(String[] args) {
		ArrayList team1 = new ArrayList();
		System.out.println(team1.size()); // 0 -> 요소의 갯수를 나타냄
		String t1 = "이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 ";
		t1 = t1.replaceAll("\\(팀장\\)", "");
		String t1Arr[] = t1.split("\\s*,\\s");
		for(int i=0; i<t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		}
		System.out.println(team1);
		
		
		ArrayList team2 = new ArrayList();
		team2.add("박민석");
		team2.add("유희진");
		team2.add("고경림");
		
		
		ArrayList team3 = new ArrayList();
		team2.add("박정호");
		team2.add("이상문");
		team2.add("이주영");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		System.out.println(class5);
		
		// iterator()로 class5 모든 요소 출력
		Iterator ir = class5.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println(class5.containsAll(team1)); // true
		
		// class5를 이름 오름차순으로 정렬
		// 원본은 그대로 유지/ 복제본 만들어서 수정, 삭제, 추가
		
		ArrayList<String> class5Clone = (ArrayList) class5.clone();
		class5Clone.removeAll(team1);
		
		// 2, 3팀만 있음 - 이름 오름차순 정렬
		System.out.println(class5Clone);
		
		/*
		// 무명(익명) 클래스
		class5Clone.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		*/
		
		// 람다식/ 익명 클래스랑 똑같은 로직
		class5Clone.sort((o1,o2)-> o1.compareTo(o2));
		System.out.println(class5Clone);
	}
}
