//입력받는 단수의 구구단을 보여주자.
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 구구단 4단을 보여주자
		// int i = 1;
		// while (i <= 9){
		// // System.out.println("4 * " + i + " = " + 4 * i);
		// System.out.printf("%d * %d = %d\n", 4, i, 4 * i);
		// i++;
		// }
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 프로그램 원하는 단수를 입력하세요! : ");
		int a = scan.nextInt();
		int i = 1;
		while (i <= 9){
			System.out.printf("%d * %d = %d\n", a, i, a * i);
			i++;
		}
	}
}