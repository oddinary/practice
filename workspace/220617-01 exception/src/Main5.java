import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException{// 2. throws 예외이름 을 통해서 처리해줄 수 있음 
		if (right == 0) {
			throw new MyZeroDivideException("0으로 나눌 수 없음"); // 1. 이 경우 try-catch를 해도 return값이 없음.
		} else {
			return left / right;
		}
	}

	public static void main(String[] args) {
	
			int result = divide(3, 0); 	// 예외 처리를 안해줘서 컴파일 에러가 남.  왜??
										// 런타임 exception이 아니라서 그럼 런타임은 unchecked exception 
										// checked exception은 무조건 throws나 try-catch로 해줘야함 아니면 런타임으로 바꿔주면 됨(MyZeroDivideException.java)
			Scanner scan = new Scanner(System.in);
			scan.nextInt(); // 어떤 예외를 throw 할 수있는 지 살펴보는 것도 중요하다.
		
	}
	
	
	public int myFunction() {
		//아직 미완성
		throw new UnsupportedOperationException("내일 할랭 아직 덜 함");
}
