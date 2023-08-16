package days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01_04 {
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
		
		// 이 씨 삭제
		list.removeIf(n-> ((String) n).charAt(0)=='이');
		System.out.println(list);
		
		
	}
}
