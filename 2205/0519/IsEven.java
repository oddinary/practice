import java.util.Scanner;

public class IsEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		int result = a % 2;
		System.out.println("입력한 정수는 짝수인가요? " + (result == 0));
	}
}