
public class Main3 {
	public static void main(String[] args) {
		try {
			System.out.println("try블록 안");
		} catch (Exception e) {
			System.out.println("catch블록 안");
		} finally {
			System.out.println("finally 블록 안"); // 예외 발생 여부에 관련없이 무조건 실행가능하다.
		}
	}
}
