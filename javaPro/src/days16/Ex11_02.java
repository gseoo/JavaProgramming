package days16;

public class Ex11_02 {
	public static void main(String[] args) {
		
		// 인터페이스 안의 static 메소드 호출
		//Parseable.method1();
		
		String parsingFile = "hello.xml";
		String docType = "xml";
		
		// 자료형 = 인터페이스 (다형성)
		Parseable parser = ParserManager.getParse(docType);
		parser.parse(parsingFile);
		
		// 5년 지난 후에 파싱 + 출력(인쇄) 기능
		parser.print();
		
	}
}

interface Parseable {
	// 구문 분석
	void parse(String fileName);
	
	// Abstract methods do not specify a body
	default void print() {
		System.out.println("각각 parser에서 각자 인쇄기능 구현");
	}
	
	// static 메소드
	static void method1() {
		System.out.println("기본 코딩");
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("> XML 파일 구문 분석 코딩");
	}
	
}
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("> HTML 파일 구문 분석 코딩");
	}
	
}


// 모든 파서를 관리
class ParserManager {
	// 			  리턴자료형 = 인터페이스(다형성)
	public static Parseable getParse(String docType) {
		if(docType.equals("xml")) {
			return new XMLParser();
		} else if(docType.equals("html")) {
			return new HTMLParser();
		} else {
			return null;
		}
	}
}