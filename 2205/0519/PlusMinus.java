import java.util.Scanner;

public class PlusMinus{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int a = input.nextInt();
		
		a -= 2;
		int a2 = a;
		System.out.println(a);
		int b = ++a;
		System.out.println(b);
		int c = ++a;
		System.out.println(c);
		int d = ++a;
		System.out.println(d);
		int e = ++a;
		System.out.println(e);
		
		System.out.print("-2 ~ +2 값은 : " + a2 + b + c + d + e);
		
	}
}