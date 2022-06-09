public class Main6 {
	public static void someMethod(double d, int... arr) { 	// 가변길이 파라미터. 값을 여러개 전달 받을 목적으로 (0~n개)쓰임
															// 파라미터가 여려개 일 경우 제일 마지막에 위치해야함.(여려개의 값이 언제 끝날지 알수 없기 때문에)
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		// 인덱스 없이 배열을 순환시키는 방법, for-each문
		// for ( 변수 : 배열처럼 여러개를 담을 수 있는 것) {}
		// 순서대로 하나씩 꺼내서 대입을 반복해주는 문장 무족권 왼쪽에서 오른쪽으로 하나씩 흐른다. 순서나 건너뛰기를 조절하려면 for문을 쓰자.
		for (int number : arr) {
			//값을 확인하려고 하는 문장이기 때문에 값을 수정하려고 하면 쓰면 안된다. 
			System.out.println(number);
		}
		someMethod(40, 50, 60, 70, 80);
		
//		someMethod(arr);
//		someMethod(new int[] {20, 30, 40, 50, 60});
//		System.out.println("---");
//		someMethod(new int[] {4, 5, 6});
//		System.out.println("종료");
	}
}
