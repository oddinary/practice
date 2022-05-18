import java.util.Scanner;

public class Sphere {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("구의 반지름 : ");
		double r = input.nextDouble();
		
		double volume = (4.0/3.0) * (r * r * r );
		double result = Math.pow(r,3); // 제곱식
		System.out.println("구의 부피 : " + volume);
		System.out.println("구의 부피 : " + 4 * result / 3);
		
	}
}