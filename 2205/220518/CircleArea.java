import java.util.Scanner;

public class CircleArea{
	public static void main(String[] args) {
		
		double radius; // 변수를 선언하는데 실수를 사용가능
		double area;
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextDouble(); //실수를 입력가능
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}
	
}