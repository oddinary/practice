import java.util.Scanner;

public class PiggyBank{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("500원의 갯수 : ");
		int a = input.nextInt();
		System.out.print("100원의 갯수 : ");
		int b = input.nextInt();
		System.out.print("50원의 갯수 : ");
		int c = input.nextInt();
		System.out.print("10원의 갯수 : ");
		int d = input.nextInt();
		System.out.print("저금통의 총액 : " + (500 * a + 100 * b + 50 * c + 10 * d) + "원");
	}
}