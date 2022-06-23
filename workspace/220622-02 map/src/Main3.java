import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//중국집 주문 가격 계산기 
// 메뉴마다 가격이 있고
// 사용자가 주문을 입력하면 가격이 올라가고
// 메뉴를 추가
// 계산 결과 출력 가능
//--------------------------------
// 다하면 곱빼기도 해보셈
public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> restaurant = new HashMap<>();
		restaurant.put("짜장면", 2500);
		restaurant.put("짬뽕", 4000);
		restaurant.put("볶음밥", 4000);
		while (true) {
			System.out.println("1.주문, 2.메뉴 추가, 0.종료");
			int i = scan.nextInt();
			switch (i) {
			case 1: {
				int sum = 0;
				System.out.println("메뉴");
				System.out.println(restaurant);
				while (true) {
					scan.nextLine();
					System.out.println("뭐 드시나요?");
					String input = scan.nextLine();
					if (!input.equals("계산")) {
						System.out.println("몇개 드릴까요?");
						int num = scan.nextInt();
						sum += restaurant.get(input) * num;
					} else {
						break;
					}
				}
				System.out.println(sum + "원 선불입니다.");
				continue;
			}
			case 2: {
				scan.nextLine();
				System.out.println("추가할 메뉴는?");
				String menu = scan.nextLine();
				System.out.println("메뉴의 가격은?");
				int price = scan.nextInt();
				restaurant.put(menu, price);
				continue;
			} 
			case 0 : {
				System.out.println("프로그램 종료");
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}break;
		}
	}
}
