import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("4자리 정수를 입력하세요 : ");
		int x = input.nextInt();
		
		int a = x / 1000;
		int b = (x % 1000) / 100;
		int c = (x % 100) / 10;
		int d = x % 10;
		
		System.out.println("정수는 = " + a + b + c + d );
		
		System.out.println(a == d && b == c);
		
	}
}