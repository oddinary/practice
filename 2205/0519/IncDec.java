public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		
		a = 78;
		
		a += 5; //복합 대입 연산자 a = a + 5;와 같은 결과가 나온다.
		
		System.out.println(a);
		
		a -= 3; // 대입연산자 앞에 복합을 넣어야 구동이 된다.
		System.out.println(a);
		
		a *= 2;
		System.out.println(a);
		
		a /= 4 ;
		System.out.println(a);
		
		a %= 2 ;
		System.out.println(a);
	}
}