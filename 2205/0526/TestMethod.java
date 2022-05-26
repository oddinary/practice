public class TestMethod {
	public static void printRepeat() { // 메소드 머리(head) 기능을 담는 행위
		// 메소드 몸통(method body)  기능, 문장
		for (int i = 0; i < 3; i++) {
			System.out.println("반복 중");
		}
	}
	
	public static void printHello() {
		// 몸통이 비워져있어도 되지만 없으면 안된다.
		int number = 10; // 지역변수 취급
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	}
	
	public static void main(String[] args) { // 프로그램 시작은 언제나 메인 메소드에서)
		System.out.println("프로그램 시작");
		
		// System.out.println("헬로 안에서 초기화한 변수 값: " + number); // 컴파일 에러
		printHello();
		
		printRepeat(); // 메소드 호출. 같은 모양이 있는지 찾은 후 원래ㄴㄴ
		
		System.out.println("프로그램 종료");
	}
}