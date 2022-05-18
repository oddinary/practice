import java.util.Scanner;

public class Change{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("받은 돈 : ");
		int money = input.nextInt();
		System.out.print("상품의 총액 : ");
		int price = input.nextInt();
		System.out.println("부가세 : " + price / 10 );
		System.out.println("잔돈 : " + (money - price));
	}
}