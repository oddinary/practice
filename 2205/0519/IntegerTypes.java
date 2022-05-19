public class IntegerTypes{
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // 자릿수표시할때 쉼표를 사용하면 컴파일 에러뜨기 때문에 밑줄로 대신한다.
		long l = 123456789L;
		
		int bs = b + s;
		
		// byte b2 = 100;
		
		// byte sum = b + b2;
		// System.out.println(sum);
	}
}