
public interface Days {
// 인터페이스에 추상메소드 외에 추가로 올 수 있는 것들
	public static final int NUM = 10; // 인터페이스에 상수를 정의해 둘 수 있다.
	int MONDAY = 1; // 상수만 오기 때문에 생략해도 됨.
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3; // 날짜 같은 것도 숫자로 정의해 둘 수 있다.
}

interface MyInterFace { // 디폴트 메소드가 올수 있다.
	default void printHello(){ 	// 이 인터페이스를 사용하는 모든 클래스가 오버라이드 해줘야 하는가??
	System.out.println("hello");// 같은 메소드는 묶어줘도 되지 않을까??
	}							// 미리 구현을 해두는 방식을 취해주면 된다. 디폴트(default)메소드

	public static void myStaticMethod() {// 스태틱한 메소드도 올 수 있다.
		
	}
//	private static int sum(int a, int b) {// private한 스태틱메소드는 사용할 수 없다.
//		return a + b;
//	}
}
