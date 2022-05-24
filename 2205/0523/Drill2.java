//사용자의 입력 n,m에 대해 n의 m제곱 출력하기

import java.util.Scanner;

public class Drill2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n의 m제곱에서 n과 m을 입력하세요");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		long num = 1;
		for (int i = 1; i <= m; i++) {
			num *= n;
		}
		System.out.print(num);
	}
}