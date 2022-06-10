
public class Main {
	public static void someMethod(int param) {
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	public static void sum(double a, double b) {// 메소드의 같고 다름을 이름이 같아도 파라미터의 순서, 타입, 갯수가 다르다면 다르게 취급한다.
		System.out.println(a + b);				// 메소드를 같은 이름으로 파라미터를 다르게 오버로드(추가로 로딩)시켜서 
												// 같은 이름의 메소드를 다양한 타입에 대응할수 있게 하는 기법 이다.
	}
	
	public static void main(String[] args) {
//		someMethod(3873.3216854);
//		someMethod("asdf"); // 이렇게는 매개변수 타입이 달라서 작동이 안됨
		
		System.out.println(123123);
		System.out.println(123.123);
		System.out.println("123123");// 이 처럼 타입에 상관없이 작동하는 거를 메소드 오버로딩 (Method Overloading)이라고 한다.
		
		sum(50, 20);
		sum(10.0, 40.0);
	}
}
