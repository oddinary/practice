public class OnelineIf {
	public static void main(String[] args) {
		boolean con = true;
		
		if(con) System.out.println("참일 경우 실행할 문장"); // 한 문장일 경우 중괄호 생략 가능 , 한 줄에 적어도 가능
		else {// 한 문장일 경우 중괄호 생략 가능
			System.out.println("거짓일 경우 실행할 문장1");
			System.out.println("거짓일 경우 실행할 문장2");
		}
		
		System.out.println("프로그램 종료");
	}
}