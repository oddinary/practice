import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박", "복숭아"));
		Scanner scan = new Scanner(System.in);
		// 콘솔 입출력
		// 과일 목록 보여주기
		// 과일 주기 (제일 앞에거 부터 줌)
		// 재고 과일 추가 하기(제일 마지막에 추가) - 진열대가 최대 10개
		while (true) {
			System.out.println("====과일가게====");
			System.out.println("==============과일 목록==============");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
			System.out.println("==================================");
			System.out.println(" 1.과일 주세요  ");
			System.out.println(" 2.과일 줄게요  ");
			System.out.println(" 0.안녕히계세요");
			System.out.println("=============");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				System.out.println(" 1.과일 주세요  ");
				if (list.size() == 0) {
					System.out.println("과일이 없시유");
				} else {
					System.out.println(" 과일을 받습니다.");
					System.out.println(list.get(0) + "를 받았습니다.");
					list.remove(0);
				}
				continue;
			}
			case 2: {
				scan.nextLine();
				System.out.println(" 2.과일 줄게요  ");
				if (list.size() == 10) {
					System.out.println("진열대가 꽉찼시유");
				} else {
					System.out.println(" 줄 과일을 입력하세요.");
					String fruit = scan.nextLine();
					System.out.println(fruit + "을(를) 재고에 추가 합니다.");
					list.add(fruit);
				}
				continue;
			}
			case 0: {
				System.out.println("안녕히계세요");
				break;
			}
			}
			break;
		}
		System.out.println("과일가게 문닫음");
	}
}
