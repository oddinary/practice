import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 줄의 갯수를 입력하세요 : ");
		int n = scan.nextInt();
		
		String star = "*";
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(star);
			}System.out.println();
		}	
	}
}