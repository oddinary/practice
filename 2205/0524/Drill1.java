import java.util.*;

public class Drill1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int num = random.nextInt(8) + 2;
		int count = 0;
		System.out.println((num) + "의 배수를 순서대로 입력하세요"); 
		
		while (true) {
			System.out.print(num + "의 배수 : "); 
			int answer = scan.nextInt();
				count++;
			if (answer != (num * count)) {
				break;
			}
		}
		System.out.println("틀렸습니다. 프로그램 종료");
	}
}