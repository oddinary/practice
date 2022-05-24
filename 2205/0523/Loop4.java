//사용자가 원하는 만큼만 입력받아서 0 부터 1씩 증가하는 수를 출력하기
import java.util.Scanner;

public class Loop4 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 반복의 양을 입력하세요 : ");
		int a = scan.nextInt();
		
		int i = 0;
		while (i < a) {
			System.out.println(i + ": " + (i + 1) + "번 반복");
			i++;
		}
	}
}