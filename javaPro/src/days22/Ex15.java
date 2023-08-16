package days22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * @author 이경서
 * @date 2023. 8. 11. - 오후 4:33:51
 * @subject 로또게임
 * @content
 */
public class Ex15 {
	public static void main(String[] args) {
		//HashSet lotto = new HashSet();
		LinkedHashSet lotto = new LinkedHashSet();
		fillLotto(lotto);
		dispLotto(lotto);
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
