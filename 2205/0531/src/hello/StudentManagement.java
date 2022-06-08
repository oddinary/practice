package hello;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		// 값을 입력하지 않았을 때에도 결과를 확인할 수 있게 초기화를 해줌.
		Student st1 = new Student("1반-1");
		Student st2 = new Student("1반-2");
		Student st3 = new Student("1반-3");
		Student st4 = new Student("2반-1");
		Student st5 = new Student("2반-2");
		Student st6 = new Student("2반-3");
		Student st7 = new Student("3반-1");
		Student st8 = new Student("3반-2");
		Student st9 = new Student("3반-3");
		Classes c1 = new Classes(st1, st2, st3);
		Classes c2 = new Classes(st4, st5, st6);
		Classes c3 = new Classes(st7, st8, st9);

		// 학생관리 프로그램
		int menu = 1;
		int menu1 = 1;
		int menu2 = 1;// 메뉴값을 초기화 해줌
		while (menu1 != 3) {
			System.out.println("****** 학생 관리 프로그램 ******");
			System.out.println("원하는 수행을 입력하세요. 1번 : 정보 입력, 2번 : 정보 확인, 3. 종료"); // 종료 구현 완료
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			switch (num) {
			case 1: {
				// 학생 정보를 입력하는 메소드 호출
				while (menu != 0) {
					System.out.println("*** 정보 입력 창 ***");
					System.out.println("입력을 원하는 반 번호를 입력하세요. 3반까지. 0. 처음으로");
					Scanner scan1 = new Scanner(System.in);
					int num1 = scan1.nextInt();
					switch (num1) {
					case 1: {
						c1.infoInput(); // 1반의 정보를 입력하는 메소드
						break;
					}
					case 2: {
						c2.infoInput(); // 2반의 정보를 입력하는 메소드
						break;
					}
					case 3: {
						c3.infoInput(); // 3반의 정보를 입력하는 메소드
						break;
					}
					case 0: {
						menu = 0;
					}
					}
					break;
				}
				continue;// 입력이 끝나면 초기화면으로 돌아가서 다시 어떤 행동을 수행 할지 물어본다.
			}
			case 2: {
				// 학생정보를 확인하는 항목, 이름 목록, 평균, 1등학생의 정보.
				while (menu != 0) {
					System.out.println("*** 정보 확인 창***");
					System.out.println("확인을 원하는 반을 입력하세요. 3반까지. 0. 종료");// 종료 구현 완료
					Scanner scan1 = new Scanner(System.in);
					int num1 = scan1.nextInt();
					switch (num1) {

					case 1: {
						while (menu2 != 0) {
							System.out.println(
									"확인을 원하는 번호를 입력하세요. 1. 학생이름 목록, 2. 학생 총 평균, 3. 1등 이름, 4. 한번에 확인하기, 0. 처음으로");
							Scanner scan2 = new Scanner(System.in);
							int num2 = scan2.nextInt();
							switch (num2) {
							case 1: {
								c1.getClassName(); // 1반의 이름 확인
								break;
							}
							case 2: {
								c1.getClassAvg(); // 1반의 평균 확인
								break;
							}
							case 3: {
								c1.getClass1st(); // 1반의 1등 확인
								break;
							}
							case 4: {
								c1.getClassName();
								c1.getClassAvg();
								c1.getClass1st(); // 3개를 한번에 확인하기
								break;
							}
							case 0: {
								menu2 = 0;
								break;
							}
							}
						}
					}
					case 2: {
						while (menu2 != 0) {
							System.out.println(
									"확인을 원하는 번호를 입력하세요. 1. 학생이름 목록, 2. 학생 총 평균, 3. 1등 이름, 4. 한번에 확인하기, 0. 처음으로");
							Scanner scan2 = new Scanner(System.in);
							int num2 = scan2.nextInt();
							switch (num2) {
							case 1: {
								c2.getClassName(); // 2반의 이름 확인
								break;
							}
							case 2: {
								c2.getClassAvg(); // 2반의 평균 확인
								break;
							}
							case 3: {
								c2.getClass1st(); // 2반의 1등 확인
								break;
							}
							case 4: {
								c2.getClassName();
								c2.getClassAvg();
								c2.getClass1st(); // 3개를 한번에 확인하기
								break;
							}
							case 0: {
								menu2 = 0;
								break;
							}
							}
						}
					}
					case 3: {
						while (menu2 != 0) {
							System.out.println(
									"확인을 원하는 번호를 입력하세요. 1. 학생이름 목록, 2. 학생 총 평균, 3. 1등 이름, 4. 한번에 확인하기, 0. 처음으로");
							Scanner scan2 = new Scanner(System.in);
							int num2 = scan2.nextInt();
							switch (num2) {
							case 1: {
								c3.getClassName(); // 3반의 이름 확인
								break;
							}
							case 2: {
								c3.getClassAvg(); // 3반의 평균 확인
								break;
							}
							case 3: {
								c3.getClass1st(); // 3반의 1등 확인
								break;
							}
							case 4: {
								c3.getClassName();
								c3.getClassAvg();
								c3.getClass1st(); // 3개를 한번에 확인하기
								break;
							}
							case 0: {
								menu2 = 0;
								break;
							}
							}
						}
					}
					}
					menu2 = 1; // menu = 0으로 탈출한 거를 다시 1로 초기화 시킴.
					// 정보 확인을 두번째 돌릴 때 정보확인이 안되고 바로 프로세스가 종료되는 오류를 막아준다.
					System.out.println("정보확인을 종료합니다.");
					break;
				}
				continue;// 확인이 끝나면 초기화면으로 돌아가서 다시 어떤 행동을 수행 할지 물어본다.

			}
			case 3: {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			default:
				System.out.println("잘못된 입력입디다.");
				continue;
			}
			break;
		}
		System.out.println("프로그램 종료.");
	}
}
