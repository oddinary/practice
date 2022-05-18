//사용자에게 정수 하나를 입력받아서 제곱 값을 출력하는 프로그램
import java.util.Scanner;

public class Squred{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int x;
		int squ;
		
		System.out.print("값을 입력하세용 : ");
		x = input.nextInt();
		
		squ = x * x;
		System.out.print("제곱은 : " + squ);
	}
}