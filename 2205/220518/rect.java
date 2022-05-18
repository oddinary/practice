//사각형의 밑변과 높이를 정수로 입력
// 사각형의 둘레와 넓이를 출력
import java.util.Scanner;

public class rect{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int area;
		int perimeter;
		
		System.out.print("밑변의 길이를 입력하세요 : ");
		x = input.nextInt();
		
		System.out.print("높이의 길이를 입력하세요 : ");
		y = input.nextInt();
		
		area = x * y;
		perimeter = 2 * (x + y);
		
		System.out.print("둘레는 " + perimeter + "입니다.");
		System.out.print("넓이는 " + area + "입니다.");
	}
}