import java.util.Scanner;
	
public class BigSmall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = scan.nextInt();
		
		int div;
		int mod;
		if(a != 0 && b !=0){
			if (a >= b) {
				div = a / b;
				mod = a % b;
			} else {
				div = b / a;
				mod = b % a;
			}	System.out.println("몫은 "+ div + "이고 나머지는 " + mod +" 입니다.");
		} else {
			System.out.println("0을 입력하면 안대양!");
		}
	}
}