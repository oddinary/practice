public class TestString2{
	public static void main(String[] args) {
		String hello = "Hello"; // index의 범위는 0부터 시작하는 것에 주의하자. 띄어쓰기도 하나의 문자로 취급해서 하나의 인덱스를 가진다.
		
		char h  = hello.charAt(0); // ()번째의 문자를 추출하는 메소드.
		System.out.println(h);
		System.out.println(hello.charAt(1));
		// System.out.println(hello.charAt(-1)); 음수는 없다.
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		// System.out.println(hello.charAt(5); 범위보다 큰 수는 에러가 남
		
		int length = hello.length();
		System.out.println(length);
	}
}