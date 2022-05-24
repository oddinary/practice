//사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력하세요.
import java.util.Scanner;

public class Drill4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int n = scan.nextInt();
		
		int count = 0;
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				System.out.print(n / i + " ");
				count++;
			}
		}
		System.out.println("약수의 총 갯수 : " + count);
	}
}