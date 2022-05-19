import java.util.Scanner;

public class IsZero {
	public static void main(String[] args) {
		//사용자가 입력한 두 정수의 합을 출력하고 합이 0이면 true를 아니면 false를 출력해보세요.
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("첫 번째 정수를 입력하시오");
		 int a = scan.nextInt();
		 
		 System.out.print("두 번째 정수를 입력하시오");
		 int b = scan.nextInt();
				 
		 int sum = a + b;
		 System.out.println("두 정수의 합 : " + sum);
		 System.out.println("두 정수의 합이 0인가요? " + (sum == 0));
	}
}