import java.util.Arrays;
import java.util.Scanner;

public class BookStore {
	// 일단 도서 정보를 출력하는 프로그램
		static void printInfo(Book[] arr) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == (null)) { // 배열의 참조가 null인지가 아니라 배열의 원소가 null인지를 확인해야 한다.
					break;
				} else {
					System.out.println((i + 1) + ": " + arr[i].getName() + " / " + arr[i].getAuthor() + " / "
							+ arr[i].getPublisher() + " / " + arr[i].getGenre() + " / " + arr[i].getPrice() + "원");
				}
			}
		}

		// 가격순으로 출력하는 프로그램
		static void printByPrice(Book[] arr) {
			Scanner scan = new Scanner(System.in);
			System.out.println("== 목록보기 (가격순) ==");
			System.out.println("1. 오름차순, 2. 내림차순");
			int input = scan.nextInt();
			switch (input) {
			case 1: { // 오름차순
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].getPrice() > arr[j].getPrice()) {
							Book temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						} else if (arr[i].getPrice() == arr[j].getPrice()) {
							if (arr[i].getPublisher().length() > arr[j].getPublisher().length()) {
								Book temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							}
						}
					}
				}
				System.out.println("오름차순으로 출력");
				for (int k = 0; k < 5; k++) {
					System.out.println((k + 1) +"." + arr[k].getName() + "\t / " + arr[k].getPrice() +"원");
				}
				break;
			}
			case 2: { // 내림차순
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i].getPrice() < arr[j].getPrice()) {
							Book temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						} else if (arr[i].getPrice() == arr[j].getPrice()) {
							if (arr[i].getPublisher().length() < arr[j].getPublisher().length()) {
								Book temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
							}
						}
					}
				}
				System.out.println("내림차순으로 출력");
				for (int k = 0; k < 5; k++) {
					System.out.println((k + 1) +"." + arr[k].getName() + "\t / " + arr[k].getPrice() +"원");
				}
				break;
			}
			}
		}

		static void printNameInfo(Book[] arr, int i) {
			System.out.print("'" + arr[i].getName() + "' "); // 같다면 출력
			System.out.println(arr[i].getInfo());
		}
		
		// 장르별로 출력하는 프로그램
		static void printByGenre(Book[] arr) {
			Scanner scan = new Scanner(System.in);
			System.out.println("== 목록보기 (분야) ==");
			System.out.println("1. 장편소설, 2. 시집, 3. 과학 공학, 4, 에세이");
			int input = scan.nextInt();

			switch (input) {
			case 1: {
				System.out.println("== 장편소설 ==");
				// 배열의 장르가 입력된 장르와 같은지를 확인
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getGenre().equals("장편소설")) {
						printNameInfo(arr, i);
					}
				}
				break;
			}
			case 2: {
				System.out.println("== 시집 ==");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getGenre().equals("시집")) {
						printNameInfo(arr, i);
					}
				}
				break;
			}
			case 3: {
				System.out.println("== 과학 공학 ==");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getGenre().equals("과학 공학")) {
						printNameInfo(arr, i);
					}
				}
				break;
			}
			case 4: {
				System.out.println("== 에세이 ==");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getGenre().equals("에세이")) {
						printNameInfo(arr, i);
					}
				}
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
			}
			}
		}

		static void inputInfo(Book[] arr, int input) {
			// 수정할 정보를 입력받기 (switch로 구현하기)
			Scanner scan = new Scanner(System.in);
			System.out.println("책의 제목을 입력하세요");
			arr[input - 1].setName(scan.nextLine());
			System.out.println("책의 저자을 입력하세요");
			arr[input - 1].setAuthor(scan.nextLine());
			System.out.println("책의 출판사을 입력하세요");
			arr[input - 1].setPublisher(scan.nextLine());
			System.out.println("책의 분야을 입력하세요");
			arr[input - 1].setGenre(scan.nextLine());
			System.out.println("가격을 입력하세요");
			arr[input - 1].setPrice(scan.nextInt());
		}

		static void changeInfo(Book[] arr,int a) {
			Scanner scan = new Scanner(System.in);
			// 수정을 원하는 배열의 책의 번호를 입력받기
			System.out.println("수정을 원하는 책의 번호를 입력하세요.  0.이전");
			int input = scan.nextInt();
			switch (input) {
			case 1: {
				inputInfo(arr, a);
				// 저장한 상태로 탈출하기(확인할 수 있어야함)
				break;
			}
			case 2: {
				inputInfo(arr, a);
				break;
			}
			case 3: {
				inputInfo(arr, a);
				break;
			}
			case 4: {
				inputInfo(arr, a);
				break;
			}
			case 5: {
				inputInfo(arr, a);
				break;
			}
			case 6: {
				inputInfo(arr, a);
				break;
			}
			case 7: {
				inputInfo(arr, a);
				break;
			}
			case 8: {
				inputInfo(arr, a);
				break;
			}
			case 9: {
				inputInfo(arr, a);
				break;
			}
			case 0: {
				break;
			}
			default: {
				System.out.println("잘못된 입력입니다.");
			}
			}
		}

		static Book[] inputbooks(Book[] arr, int a) {
			Scanner scan = new Scanner(System.in);
			System.out.println("입력을 원하는 책의 정보를 입력하세요");
			Book[] copy = Arrays.copyOf(arr, arr.length + 1);
			System.out.println(Arrays.toString(copy));
			copy[a] = new Book(scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextInt());
			Book[] books = copy;
			System.out.println(Arrays.toString(books));
			
			return books;
		}
		
		public static void bookStore() {
			int numBooks = 5;
			Book[] books = new Book[numBooks];
			books[0] = new Book("작별인사", "김영하", "복복서가", "장편소설", 12600);
			books[1] = new Book("불편한 편의점", "김호연", "나무옆의자", "장편소설", 12600);
			books[2] = new Book("지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집", 8100);
			books[3] = new Book("코스모스", "칼 세이건", "사이언스북스", "과학 공학", 16650);
			books[4] = new Book("여행의 이유", "김영하", "문학동네", "에세이", 12150);

			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("== 도서 관리 프로그램 ==");
				System.out.println("1. 목록보기 (가격순), 2. 목록보기 (분야), 3. 도서 정보 수정, 4. 도서 정보 입력, 5.전체 책 상세 정보, 0.종료");
				int input = scan.nextInt();
				switch (input) {
				case 1: {
					printByPrice(books);
					continue;
				}
				case 2: {
					printByGenre(books);
					continue;
				}
				case 3: {
					changeInfo(books, input);
					continue;
				}
				case 4: {
					books = inputbooks(books, numBooks);
					continue;
				}
				case 5: {
					printInfo(books);
					continue;
				}
				case 0: {
					break;
				}
				default: {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				}
				System.out.println("프로그램 종료");
				break;
			}
		} 
}
