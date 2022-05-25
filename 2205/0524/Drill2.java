// 사용자에게 비밀번호를 물어보고 동일할 경우 통과
// 최대 3번의 기회를 줌

import java.util.*;

public class Drill2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		while (true) {
		System.out.print("비밀번호를 입력하세요 : ");
		String line = scan.nextLine();
		count++;
			if (line.equals("password")) {
				System.out.println("통과");
				break;
			}
			if (count == 3) {
				System.out.println("비밀번호 오류 3번 초과.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}