import java.util.Scanner;

public class Div{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int x = input.nextInt();
		System.out.print("정수를 입력하시오 : ");
		int y = input.nextInt();
		
		if(x>y) {
			System.out.println(x + "를 " + y + "으로 나눈 몫은 " + x / y + "이고 나머지는 " + x % y + "입니다.");
		} else {
			System.out.println(y + "를 " + x + "으로 나눈 몫은 " + y / x + "이고 나머지는 " + y % x + "입니다.");
		}			
	}
}