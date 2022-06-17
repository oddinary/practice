import java.util.InputMismatchException;
import java.util.Scanner;

// 정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
//		System.out.println("큰 수 입력");
//		int left = scan.nextInt();
//		System.out.println("작은 수 입력");
//		int right = scan.nextInt();
//
//			System.out.println("나눈 몫 : " + (left / right));
		
		// 0으로 나누거나, 정수가 아닌 문자열 입력시 에러 발생, 예외(exception)가 발생 자바에서는 이런 예외를 객체로 관리하고 있는데,
			// if문으로 처리할 수 있음 하지만 if문으로 다 처리 할 수 없는 여러가지 예외가 발생할 경우에는 어떻게 해야 하는가?
			// try - catch 문을 사용하면 된다!
		
		try {
			// 프로그램의 흐름 문장
			System.out.println("큰 수 입력");
			int left = scan.nextInt();
			System.out.println("작은 수 입력");
			int right = scan.nextInt();
	
			if (right != 0)
				System.out.println("나눈 몫 : " + (left / right));
			else
				System.out.println("0으로 나눌 수 없어요.");
			// 예외 없을시 catch부분이 생략된다.
		}catch (InputMismatchException e) { // ()안에는 어떤 예외가 들어갈지 미리 적어놓을 수 있다.
			//예외가 발생시 catch부분으로 들어와서 예외를 처리 한다.
			System.out.println("숫자를 입력해야 합니다.");
			//처리 종료시 다시 다음 문장의 흐름으로 되돌아 간다.
			e.printStackTrace(); // 예외 발생 경로를 콘솔에 출력하는 메소드.
								// 아래로 갈 수록 과거 경로를 추적해서 뭐가 잘못됐는지 알 수 있다.
		}

		System.out.println("프로그램 정상 종료");
	}
}
