import java.util.Scanner;

public class Mile {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double mile = input.nextDouble();
		double kilo;
		
		kilo = 1.609 * mile;
		System.out.print(mile + "마일은 " + kilo + "킬로미터 입니다.");
	}
}