//사용자가 입력한 5개의 정수 중 가장 큰 수를 출력하세요.
import java.util.Scanner;

public class Drill5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//입력하는 동시에 앞의 수와 비교 한다
		System.out.print("5개의 정수를 입력하세요");
		int max;
		int a = scan.nextInt();
		max = a;
		
		for (int i = 0; i < 4; i++) {
			int b = scan.nextInt();
			
			if (max < b) {
				max = b;
			}
		}
		//출력
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
}