public class StaticVariableAndConst2 {
	public static void printTest(final int param) { // final 적으면 값을 고정시킬 수 있음
		// param++; // 20이라는 값이 복사가 되서 ++ 된거라 적용이됨.
		System.out.println(param);
	}
	public static void main(String[] args) {
		int inner = 10;
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		{
			System.out.println(inner);
			System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE;
			final int BLOCK = 100;
		}
		// System.out.prinln(BLOCK); // 지역변수여서, {} 밖에서는 사용이 안된다.
	}
}