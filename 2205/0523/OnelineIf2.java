public class OnelineIf2 {
	public static void main(String[] args) {
		boolean con = true;
		boolean con2 = false;
		
		// ? : 삼항연산자. (boolean 값) ? 참인 경우 : 거짓인 경우
		String result = (con) ? "참" : "거짓"; 
		String result2 = (con2) ? "참" : "거짓"; 
		
		int result3 = (con) ? 100 : -100;
		
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println("프로그램 종료");
	}
}