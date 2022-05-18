import java.util.Scanner;

public class Reverse{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("5자리 정수를 입력하세요 : ");
		int x = input.nextInt();
		
		// int a = x % 10;
		// int b = x % 100 / 10;
		// int c = x % 1000 / 100;
		// int d = x % 10000 / 1000;
		// int e = x / 10000;
		// System.out.print("역순 : " + a + b + c + d + e);
		System.out.println("역순 : " + x % 10 + x % 100 / 10 + x % 1000 / 100 + x % 10000 / 1000 + x / 10000);
		System.out.println("자릿수의 합:" + (x % 10 + x % 100 / 10 + x % 1000 / 100 + x % 10000 / 1000 + x / 10000));
	}
}