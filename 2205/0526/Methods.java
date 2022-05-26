public class Methods {
	public static int increase(int a) { // 값이 '복사'된다.
		a++;
		return a;
	}
	// 홀짝판별 메소드 만들기
	public static boolean oddEven (int number) {
		return number % 2 == 0;
	}
		
	// public static int,int createTwoNumber() { //메소드는 리턴값을 하나만 가질수 있다.
		// return 20,30;
	// }
	
	// public static boolean test() {
		// return 10;
	// }
	
	public static void main(String[] args) {
		
		System.out.println("짝수이면 true, 홀수이면 false : " + oddEven(26));
		
		
		int a = 10;
		a = increase(a); // Call by Value 값에 의한 호출. 변수 값이 복사되서 전달된다.
		System.out.println(increase(a)); // 복사만 한거라서 다르게 쓸 때는 바뀌지 않는다.
		System.out.println(a); // 가져만 왔기 때문에 대입연산을 해줘야 값이 변한다.
	}
}