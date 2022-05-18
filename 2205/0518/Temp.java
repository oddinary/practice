import java.util.Scanner;

public class Temp{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("화씨온도 : ");
		double f = input.nextDouble();
		
		double c = (5 * (f - 32)) / 9;
		System.out.print("섭씨온도 : " + c);
	}
}