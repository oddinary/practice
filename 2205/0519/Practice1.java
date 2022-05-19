import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = input.nextInt();
		
		System.out.print( a >= 0 && (a % 7) == 0);
		
	}
}