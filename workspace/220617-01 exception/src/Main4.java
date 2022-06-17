
public class Main4 {
	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			if (right == 0) {
				// 0으로 나누려고 함 (예외적인 상황)
				// 보고서 적어서 던진다.(try)
				// 예외적인 상황을 만들수 있는 객체를 만들어보자
//				throw new Exception("0으로 나누는 예외적인 상황이 발생했지비."); //예외를 던진다, 발생시킨다.
				throw new MyZeroDivideException("0으로 나누면 안되지비");
			} 
		} catch (Exception e) {
			// 던진 객체를 e로 전달해 준다.
			System.out.println(e.getMessage()); // 던진 예외를 받아서 출력했지비.
												// 이 경우 프로그램상에서 내가 쓸 예외를 정의해 놓는다면 좀더 구체적으로 만들면 되지 않을까??
		}
	}
}
