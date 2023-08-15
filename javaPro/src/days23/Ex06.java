package days23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		/*
		[Map] 인터페이스를 구현한 컬렉션 클래스
		
		1. Map : (key, value) 한 쌍 -> 엔트리(Entry)
		2. key : 중복 허용 x
		   value : 중복 허용 O
		3. HashMap(신) : 동기화 처리 x
		   HashTable(구) : 동기화 처리 o
		4. HashMap 사용 권장
		5. 해싱(Hashing) : 해시 함수를 이용해서 데이터를 해시테이블에 저장하고 검색하는 기법
		6. 해시함수 : 데이터가 저장되어 있는 곳을 알려 주는 함수, 데이터를 빠르게 찾을 수 있음
		   데이터 저장(key+value) 키를 해시함수에 넣으면 배열의 한 요소를 얻어오고
		   그 배열에 연결된 LinkedList에 데이터를 저장하는 방식
		 */
		
		HashMap<String, String> hm = new HashMap<String, String>();
		//Hashtable<String, String> ht = new Hashtable<String, String>(); // 사용법 같음
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		
		System.out.println(hm); // {hong=홍길동, admin=관리자}
		
		hm.put("hong", "홍중복");
		// 키가 중복될 때 에러 발생 x, 새로운 value로 저장
		System.out.println(hm); // {hong=홍중복, admin=관리자}
		
		hm.put("root", "관리자");
		System.out.println(hm); // {hong=홍중복, root=관리자, admin=관리자}
		
		System.out.println("-".repeat(40));
		
		// 모든 key값 조회
		Set<String> kSet = hm.keySet();
		Iterator<String> ir = kSet.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.printf("%s ", key); // hong root admin 
		}
		
		hm.containsKey("hong"); // hong key값을 가졌는지? true/false
		hm.containsValue("홍중복"); // 홍중복 value값을 가졌는지? true/false
		
		hm.get("root"); // root라는 key값을 가진 value 가져오기
		hm.getOrDefault("kim", "익명"); // key값이 있으면 value값 리턴, 없으면 익명 리턴
		
		hm.replace("root", "관리자", "루트"); // root 키의 value인 관리자를 루트로 변경
		
		// 모든 value값 조회
		Collection<String> vSet = hm.values();
		Iterator<String> ir2 = vSet.iterator();
		while (ir2.hasNext()) {
			String value = (String) ir2.next();
			System.out.printf("%s ", value); // 홍중복 관리자 관리자
		}
		
		// key를 알 때 value 조회
		String key = "admin";
		String value = hm.get(key);
		System.out.println(value); // 관리자
		
		System.out.println("-".repeat(40));
		
		dispHm(hm);
	}

	/*
	// [1]
	private static void dispHm(HashMap<String, String> hm) {
		// key : value
		// key : value
		// key : value
		Set<String> kSet = hm.keySet();
		Iterator<String> ir = kSet.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			String value = hm.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
	}
	*/
	
	// [2]
	private static void dispHm(HashMap<String, String> hm) {
		// key : value
		// key : value
		// key : value
		Set<Entry<String, String>> eset = hm.entrySet();
		Iterator<Entry<String, String>> ir3 = eset.iterator();
		while (ir3.hasNext()) {
			Entry<String, String> entry = ir3.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("e %s : %s\n", key, value);
			//e hong : 홍중복
			//e root : 관리자
			//e admin : 관리자
		}
		
	}

}
