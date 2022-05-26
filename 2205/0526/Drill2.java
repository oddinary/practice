// 2. 전달 받은 정수 만큼 '안녕'이라는 문자열을 출력하는 메소드. 반환값이 없음. void.
import java.util.Scanner;

public class Drill2 {
	public static void hello (int h) {
		for(int i = 1; i <= h; i++) {
			System.out.print("안녕");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("안녕을 출력할 횟수를 입력하세요: ");
		int h = scan.nextInt();
		hello(h);
	}
}