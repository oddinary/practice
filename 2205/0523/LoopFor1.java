public class LoopFor1 {
	public static void main(String[] args) {
		//반복이라는 문자열 5번 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.println("출력");
		}
		
		//1부터 10까지 for문
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//21부터 30까지 3의배수 출력하기
		for (int i = 21; i <= 30; i += 3) {
			System.out.println(i);
		}
		
		//30~20까지 역순 출력
		for (int i = 30; i >= 20; i--) {
			System.out.println(i);
		}
	}
}