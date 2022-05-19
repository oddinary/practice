import java.util.Scanner;

public class UnderArmour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("벤치를 입력하세요 : ");
		int b = scan.nextInt();
		System.out.print("스쿼트를 입력하세요 : ");
		int s = scan.nextInt();
		System.out.print("데드를 입력하세요 : ");
		int d = scan.nextInt();
		
		int result = b + s + d;
		System.out.println("언더아머 착용가능? " + (result >= 500));
	}
}