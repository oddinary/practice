public class TestMethod3 {
	public static int getSum(int a, int b) { // 메소드의 입력부 parameters. 개수, 타입, 순서가 중요함.
		return a + b;
	}
	
	// 두 개의 정수를 전달 받아 곱 연산 결과를 반환하는 메소드를 작성하고 호출해 반환값을 메인 메소드에서 출력.
	public static int getMulti(int a, int b) {
		return a * b;
	}
	
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		
		//System.out.println(a); 지역변수라 에러남
		
		System.out.println(getSum(100, 200));
		
		System.out.println(getMulti(25, 4));
	}
}