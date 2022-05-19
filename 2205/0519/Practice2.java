import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = input.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = input.nextInt();
		System.out.print("세 번째 정수를 입력하세요 : ");
		int c = input.nextInt();
		
		System.out.print( a == b - 1 && c == b + 1);
	}
}