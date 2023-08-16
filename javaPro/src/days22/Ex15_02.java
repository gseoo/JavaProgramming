package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/*
 게임횟수를 입력받아 로또 번호를 출력하는 코딩을 하세요 . 
         게임 횟수 입력 ? 3

      1게임 : [17][9][4][15][16][38]   
      2게임 : [17][9][4][15][16][38]   
      3게임 : [17][9][4][15][16][38]   
 */

public class Ex15_02 {
	static int a;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("> 게임 횟수 입력 ? ");
		a = sc.nextInt();
		
		ArrayList lottos = new ArrayList();
		HashSet lotto = null;
		
		for(int i=0; i<a; i++) {
			lotto = new HashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}
		
		/*
		for(int i=0; i<a; i++) {
			System.out.printf("%d게임 : ", i+1);
			lotto = (HashSet) lottos.get(i);
			dispLotto(lotto);
		}
		*/
		
		dispLottos(lottos);
	}
	
	private static void dispLottos(ArrayList lottos) {
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			HashSet lotto = (HashSet) ir.next();
			dispLotto(lotto);
		}
	}

	private static void dispLotto(HashSet lotto) {
		Iterator ir = lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%d]", n);
		}
		System.out.println();
	}

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		while (lotto.size() < 6) {
			int n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
	}
}
