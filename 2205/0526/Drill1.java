// 1. 원의 반지름을 실수형으로 전달 받아 원넓이(실수형)를 반환하는 메소드를 작성후 메인메소드에서 호출하여 테스트
import java.util.Scanner;

public class Drill1 {
	public static double area(double r) {
		return r * r * 3.14;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		int r = scan.nextInt();
		System.out.print("원의 넓이 : " + area(r));
	}
}