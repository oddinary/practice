import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 줄의 갯수를 입력하세요 : ");
		int n = scan.nextInt();
		
		String star = "*";
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= ((n + 1) - j)*2; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (2 * (j - 1) ) + 1; i++) {
				
				System.out.print(star);
			}System.out.println();
		}	
	}
}