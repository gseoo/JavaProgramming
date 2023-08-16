package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 이경서
 * @date 2023. 7. 26. - 오후 12:07:44
 * @subject 배열 단점 -> 컬렉션 클래스
 * @content	1) 배열 크기가 자동으로 증가/감소되지 않음
 */
public class Ex03 {

	static int index = 0; // 전역변수
	static Scanner sc = new Scanner(System.in);
	static char con = 'y';

	public static void main(String[] args) throws IOException {

		int [] m =  new int[3];

		String [] menus = {"추가", "수정", "삭제", "검색", "조회", "종료"};
		int selectedNumber;

		while(true) {
			dispMenus(menus);
			selectedNumber = selectMenus(sc);
			processMenus(selectedNumber, m);
		}

	}

	private static void processMenus(int selectedNumber, int[] m) throws IOException {
		switch (selectedNumber) {
		case 1: // main 함수 안의 m 배열에 값을 입력받아서 요소 추가
			add(m);
			break;
		case 2:
			System.out.println("배열에 요소 수정");
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:  // 배열의 모든 요소 조회
			list(m);
			break;

		case 6:
			exit(); break;

		default:
			break;
		}
		
		일시정지();

	}

	public static void 일시정지()  {
		System.out.print("> 아무 키나 누르면 계속합니다.");
		
		// 예외 처리 방법 2가지 : try~catch, throws
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void list(int[] m) {
		System.out.println("[5. 조회]");
		if(index==0) {
			System.out.println("추가된 요소가 없습니다");
			return;  // 함수를 빠져나간다
		}
		for(int i=0; i<index; i++) {
			System.out.printf("m[%d] = %d ", i, m[i]);
		}
		System.out.println();
	}

	// m 배열에 요소를 추가하는 함수
	private static void add(int[] m) throws IOException {
		System.out.println("[1. 추가]");
		do {
			// if(index == 3) break;
			
			if(index == m.length) {
				int [] temp = new int[m.length+3];
				for(int i=0; i<m.length; i++) {
					temp[i] = m[i];
				}
				m = temp; // temp에 있는 주소값을 m에 담는
			}
			
			System.out.printf("> 정수 입력 ? ");
			int n = sc.nextInt();
			m[index++] = n;

			System.out.print("\t 요소 추가를 계속하시겠습니까? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		// } while (Character.toUpperCase(con) == 'Y' && index<3);

		System.out.println(Arrays.toString(m));

	}

	private static void exit() {
		System.out.println("\n\n 프로그램 종료 ~");
		System.exit(-1);
	}

	private static int  selectMenus(Scanner sc) {
		System.out.print("> 메뉴를 선택하세요? ");
		return sc.nextInt();
	}

	private static void dispMenus(String[] menus) {
		System.out.println("[메뉴]");
		for(int i=0; i<menus.length; i++) {
			System.out.printf("%d. %s\t", i+1, menus[i]);
		}
		System.out.println();
	}
}
