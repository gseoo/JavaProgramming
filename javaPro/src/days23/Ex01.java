package days23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex01 {
	static int a = 1;
	public static void main(String[] args) {
		
		int n = 5;
		int lottoNumber = -1;
		
		LinkedHashSet<Integer> lotto = null;
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<LinkedHashSet<Integer>>();
		
		for(int i=0; i<n; i++) {
			lotto = new LinkedHashSet<Integer>(6);
			while(lotto.size() < 6) {
				lottoNumber = (int) (Math.random()*45+1);
				lotto.add(lottoNumber);
			}
			lottos.add(lotto);
		}
		
		
		ArrayList<Integer> sList = null;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		int no = 1;
		while (ir.hasNext()) {
			lotto = ir.next();
			sList = new ArrayList<Integer>(lotto);
			Collections.sort(sList);
			
			Iterator<Integer> ir2 = sList.iterator();
			System.out.printf("%d게임 : ", no++);
			while (ir2.hasNext()) {
				lottoNumber = ir2.next();
				System.out.printf("[%02d]", lottoNumber);
			}
			System.out.println();
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.printf("> 게임 횟수 입력 ? ");
		int n = sc.nextInt();
		
		ArrayList lottos = new ArrayList();
		TreeSet lotto = null;
		
		for(int i=0; i<n; i++) { 
			lotto = new TreeSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}
		dispLottos(lottos);
		*/
	}
/*
	private static void dispLottos(ArrayList lottos) {
		Iterator ir = lottos.iterator();
		while (ir.hasNext()) {
			TreeSet lotto = (TreeSet) ir.next();
			dispLotto(lotto);
		}
	}

	private static void dispLotto(TreeSet lotto) {
		Iterator ir = lotto.iterator();
		System.out.printf("%d게임 : ", a++);
		while (ir.hasNext()) {
			int num = (int) ir.next();
			System.out.printf("[%d]", num);
		}
		System.out.println();
	}

	private static void fillLotto(TreeSet lotto) {
		Random rnd = new Random();
		while (lotto.size()<6) {	
			int num = rnd.nextInt(45)+1;
			lotto.add(num);
		}
	}
	*/
}
