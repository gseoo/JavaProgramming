package days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01_03 {
	public static void main(String[] args) {
		// 이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 
		
		ArrayList list = new ArrayList();
		
		// 1) 팀원들의 이름을 요소로 추가  
		list.add("이경서");
		list.add("신종혁");
		list.add("이재영");
		list.add("송해영");
		list.add("신기범");
		list.add("이준희");
		list.add("김성준");
		
		// 2) 반복자를 사용해서 모든 요소(팀원들) 출력 
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String)ir.next();
			System.out.println(name);
		}
		
		// 3) 팀원들의 인원수를 출력
		System.out.println(list.size());
		
		// 4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
		System.out.println(list.get(1));
		list.set(1, "홍길동");
		System.out.println(list);
		
		// 5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
		System.out.println(list.contains("홍길동"));
		list.remove(list.indexOf("홍길동"));
		
		// 6) "김"씨 팀원들만 삭제 후 확인.
		list.removeIf(n-> ((String) n).charAt(0)=='김');
		System.out.println(list);
		/*
		String regex = "김.+";
		for(int i=0; i<list.size(); i++) {
			if(((String)list.get(i)).equals(regex)) {
				System.out.println(1);
				list.remove(i);
			}
		}
		System.out.println(list);
		*/
	}
}
