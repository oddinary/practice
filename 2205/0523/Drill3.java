import java.util.Scanner;

public class Drill3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("돈을 입력하세요 : ");
		int money = scan.nextInt();
		int cock = 0;
		int cider = 0;
		if (money <= 1300) {
			System.out.println("잔액이 부족합니다.");
		} else{
			for (int i = 0; i < 3; i++) {
				System.out.print("다음 행동을 입력하세요 : ");
				int act = scan.nextInt();
				if (act == 1) {
					if (money >= 1500) {
					money -= 1500;
					cock++;
					System.out.println("콜라를 선택했습니다.");
					System.out.println("남은 돈:" + money);
					} else {
						System.out.println("잔액이 부족합니다!");
					}
				} else if (act == 2){
					if (money >= 1300) {
					money -= 1300;
					cider++;
					System.out.println("사이다를 선택했습니다.");
					System.out.println("남은 돈:" + money);
					} else {
						System.out.println("잔액이 부족합니다!");
					}
				} else if (act == 3){
					System.out.println("계산을 합니다.");
					i = 3;
				} else {
					System.out.println("Error");
				}
			}		
		}
		System.out.println("콜라 : " + cock + "캔");
		System.out.println("사이다 : " + cider + "캔");
		System.out.println("거스름돈:" + money);
		System.out.println("프로그램 종료");
	}
}