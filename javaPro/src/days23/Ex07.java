package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {
	public static void main(String[] args) {
		//days20.Ex01.java 파일 읽어서
		// HashMap 저장 - key + value
		// 				알파벳    n개
		
		String fileName = ".\\src\\days20\\Ex01.java";
		int code = -1;
		char one = '\u0000';
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		try (FileReader fr = new FileReader(fileName)){
			while((code = fr.read()) != -1) {
				one = (char) code;
				
				// 읽어온 key가 hmap에 존재한다면 value값 1 증가
				// else 새로운 엔트리 추가
				/*
				if(hmap.containsKey(one)) {
					int value = hmap.get(one);
					hmap.put(one, value++);
				} else hmap.put(one, 1);
				*/
				
				hmap.put(one, hmap.getOrDefault(one, 0) + 1);
			}
			
			// key, value 출력
			Set<Entry<Character, Integer>> es = hmap.entrySet();
			Iterator<Entry<Character, Integer>> ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry = ir.next();
				char key = entry.getKey();
				int value = entry.getValue();
				System.out.printf("'%c'(%d) %s\n", key, value, "#".repeat(value));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}