import java.util.Scanner;

public class Biggest {
	public static void main(String[] args) {
		//숫자 3개 중에 가장 큰 수를 출력하자.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = scan.nextInt();
		System.out.print("세 번째 정수를 입력하세요 : ");
		int c = scan.nextInt();
		
		int biggest;
		
		if (a != b && b != c && c != a){
			if (a > b) {
				if (a > c) {
					biggest = a;
				} else {
					biggest = c;
				}
			} else {  // a < b
				if (b > c) {
					biggest = b;
				} else {
					biggest = c;
				}
			}
			System.out.print("가장 큰 수는 " + biggest + "입니당.");
		} else
			System.out.print("같은 수가 있으면 안되지비!");
	}
}