public class TestIf {
	public static void main(String[] args) {
		// if ( 조건식(논리값) ) { 참일 경우 중괄호 안(then 절)로 흐름이 이어져서 문장을 실행함
		//		문장1
		//		문장2
		// } 	문장3		중괄호가 끝나면 다시 원래대로의 흐름으로 이어진다.
		
		// if ( 조건식(논리값) ) { 거짓일 경우 중괄호 안을 건너뛴다.		
		//		문장1
		//		문장2
		// } 	문장3 	다시 원래대로의 흐름으로 이어진다.
		
		//참 : 문장1, 문장2, 문장3 을 수행함		거짓 : 문장3 을 수행함
		
		boolean condition = true;
		if(condition) {
			System.out.println("조건문 블록 안입니다.");
		}
		System.out.println("프로그램 종료");
		System.out.println("----------");
		
		boolean condition2 = false;
		if(condition2) {
			System.out.println("조건문 블록 안입니다.");
		}
		System.out.println("프로그램 종료");;
	}
}