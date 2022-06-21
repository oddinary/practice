import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 날짜 중복 이랑 내용수정 구현 해야함
public class Diary {
	public void DiaryManage() {
		List<Daily> list = new ArrayList<>();
		list.add(new Daily(606, "오늘은", "맑음", "쉬는 날이었다."));
		list.add(new Daily(607, "어제는", "흐림", "힘들었다."));
		list.add(new Daily(616, "오늘은", "비옴", "남아서 했다."));
		list.add(new Daily(621, "오늘은", "맑음", "화요일(Tuesday)이었다."));
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("★☆일기장☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			System.out.println("1.일기 쓰기 | 2.일기 보기 | 3.일기 지우기 | 4.일기 고치기 |0.오늘의 일기 끝");
			System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				writeDiary(list);
				continue;
			}
			case 2: {
				readDiary(list);
				continue;
			}
			case 3: {
				deleteDiary(list);
				continue;
			}
			case 4: {
				editDiary(list);
				continue;
			}
			case 0: {
				break;
			}
			default: {
				System.out.println("잘못 입력했어요.");
			}
			}
			break;
		}
	}

	public void writeDiary(List<Daily> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.일기 쓰기");
		System.out.println("날짜를 입력하세요 ex) 6월 6일 -> 606");
		int date = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf(date).equals(list.get(i).getDate())) {
				System.out.println("같은 날짜로는 일기를 못써요");
				break;
			} else {
				System.out.println("제목을 입력하세요");
				String title = scan.nextLine();
				System.out.println("날씨를 입력하세요");
				String weather = scan.nextLine();
				System.out.println("내용을 입력하세요");
				String content = scan.nextLine();
				list.add(new Daily(date, title, weather, content));
				break;
			}
		}
	}

	public void readDiary(List<Daily> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2.일기 보기");
		System.out.println("1.날짜 오래된 순 |2. 날짜 최신 순 | 3.내용 길이 순 | 4.내용 길이 역순");
		int input = scan.nextInt();
		switch (input) {
		case 1: {
			System.out.println("1.날짜 순");
			System.out.println("가장 오래된 날짜의 일기부터 보여줍니다.");
			Comparator<Daily> dateCompareAsc = new Comparator<Daily>() {
				@Override
				public int compare(Daily o1, Daily o2) {
					return o1.getDate() - o2.getDate();
				}
			};
			Collections.sort(list, dateCompareAsc);
			for (Daily d : list)
				System.out.println(d);
			break;
		}
		case 2: {
			System.out.println("2.내용 길이 순");
			System.out.println("가장 오래된 날짜의 일기부터 보여줍니다.");
			Comparator<Daily> dateCompareAsc = new Comparator<Daily>() {

				@Override
				public int compare(Daily o1, Daily o2) {
					return o2.getDate() - o1.getDate();
				}
			};
			Collections.sort(list, dateCompareAsc);
			for (

			Daily d : list)
				System.out.println(d);
			break;
		}
		case 3: {
			System.out.println("3.내용 길이 순");
			System.out.println("가장 긴 일기 부터 보여 줍니다.");
			Comparator<Daily> contentCompareAsc = new Comparator<Daily>() {
				@Override
				public int compare(Daily o1, Daily o2) {
					return o1.getContents().length() - o2.getContents().length();
				}
			};
			Collections.sort(list, contentCompareAsc);
			for (Daily d : list)
				System.out.println(d);
			break;
		}
		case 4: {
			System.out.println("4.내용 짧은 순");
			System.out.println("가장 짧은 일기 부터 보여 줍니다.");
			Comparator<Daily> contentCompareDesc = new Comparator<Daily>() {
				@Override
				public int compare(Daily o1, Daily o2) {
					return o2.getContents().length() - o1.getContents().length();
				}
			};
			Collections.sort(list, contentCompareDesc);
			for (Daily d : list)
				System.out.println(d);
			break;
		}
		case 0: {
			System.out.println("이전으로 돌아갑니다.");
			break;
		}
		default: {
			System.out.println("잘못 입력했어요.");
		}
		}
	}

	public void deleteDiary(List<Daily> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("3.일기 지우기");
		System.out.println("일기는 가장 오래된 날짜순으로 지워집니다.");
		System.out.println("지우시겠습니까??");
		System.out.println("1. 지울래요 | 2. 안지울래요");
		int input = scan.nextInt();
		switch (input) {
		case 1: {
			System.out.println("1. 지울래요");
			if (!list.isEmpty()) {
				System.out.println("가장 오래된 날짜의 일기를 지웁니다.");
				list.remove(0);
				System.out.println("지우기 완료.");
				break;
			} else {
				System.out.println("빈 일기장 입니다.");
				break;
			}
		}
		case 2: {
			System.out.println("2. 안지울래요");
			System.out.println("이전으로 돌아갑니다.");
			break;
		}
		default: {
			System.out.println("잘못 입력했어요.");
		}
		}

	}

	public void editDiary(List<Daily> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("4.일기 고치기");
		System.out.println("날짜를 입력하세요 ex) 6월 6일 -> 606");
		int date = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf(date).equals(list.get(i).getDate())) {
				System.out.println("제목을 입력하세요");
				String title = scan.nextLine();
				System.out.println("날씨를 입력하세요");
				String weather = scan.nextLine();
				System.out.println("내용을 입력하세요");
				String content = scan.nextLine();
				list.set(i, new Daily(date, title, weather, content));
				break;
			} else {
				System.out.println("없는 날짜로는 일기를 못고쳐요");
				break;
			}
		}
	}
}
