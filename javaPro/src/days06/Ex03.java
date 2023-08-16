package days06;
/**
 * @author 이경서
 * @date 2023. 7. 20. - 오전 11:20:53
 * @subject 복습 4번
 * @content 1. for문 두 번 쓰기 A~Z, a~z
 * 				2. count, if문 사용
 */				
public class Ex03 {
public static void main(String[] args) {
		
		for(int i='A', count=1, line=1; i<='z'; i++) {
			if(i>'Z' && i<'a')
				continue;
			
			if(count%10==1)
				System.out.printf("%d : ", line++);
			
			System.out.printf("%c(%03d)", i, i);
			
			if(count++ %10 ==0)
				System.out.println();		
			
			// 소문자부터 개행해서 출력하기
			if(i=='Z') {
				System.out.println();
				count = 1;
			}
		}
		
		
		/*
		for(int i=65; i<=90; i++) {
			if(i%10==5) System.out.println();
			System.out.printf("%c(%03d)", (char)i, i);
		}
		
		for(int i=97; i<=122; i++) {
			if(i%10==1) System.out.println();
			System.out.printf("%1$c(%1$03d)", i);
		}
		*/
		
		
		
		/* 만들어 보기
		 1 : A(065)B(066)C(067)D(068)E(069)F(070)G(071)H(072)I(073)J(074)
		2 : K(075)L(076)M(077)N(078)O(079)P(080)Q(081)R(082)S(083)T(084)
		계속하려면 아무 키나 누르세요.
		3 : U(085)V(086)W(087)X(088)Y(089)Z(090)
		4 : a(097)b(098)c(099)d(100)e(101)f(102)g(103)h(104)i(105)j(106)
		계속하려면 아무 키나 누르세요.
		5 : k(107)l(108)m(109)n(110)o(111)p(112)q(113)r(114)s(115)t(116)
		6 : u(117)v(118)w(119)x(120)y(121)z(122)
		종료!
		 */

	}
}
