import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		//사용자가 정수 범위를 지정 (시작 - 끝 입력)
		//합
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작하는 수를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("끝나는 수를 입력하세요 : ");
		int b = scan.nextInt();
		
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "부터 "+ b + "까지의 총합은 " + sum +"입니다.");
	}
}