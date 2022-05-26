public class TestMethod2 {
	// 메소드 이름 영소문자로 시작, 여러단어가 있으면 다음 단어의 첫 문자를 대문자로. 동사로 많이 지음.
	public static int sum() { // void : retrun type (읎음)
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum; // 값을 가지고 돌아감
	}
	// pi 메소드 {3.14 실수값을 반환하는 메소드}
	public static double pi() {
		double pi = 3.14;
		
		return pi;
	}
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = sum();
		System.out.println(result);
		
		double result2 = pi();
		System.out.println(result2);
		
		System.out.println("끝");
	}
}