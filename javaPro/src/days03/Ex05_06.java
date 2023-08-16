package days03;

/**
 * @author 이경서
 * @date 2023. 7. 17. - 오후 2:41:01
 * @subject 단항연산자 ++  --   (증감연산자)
 * @content 
 */
public class Ex05_06 {
	public static void main(String[] args) {
		// 어떤 기억 공간의 값을 1 증가시키는 코딩
		int n = 10;
		System.out.println(n); // 10
		
		n = n + 1;
		//n += 1; (복합대입연산자)
		//n++; (후위형 증감연산자)
		//++n; (전위형 증감연산자)
    	//System.out.println(n); // 11
		
		// 어떤 기억 공간의 값을 1 감소시키는 코딩
		n = n - 1;
		//n -= 1; (복합대입연산자)
		//n--;
		//--n;
		System.out.println(n); // 9

	}
}
