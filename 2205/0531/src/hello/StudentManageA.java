package hello;

import java.util.Scanner;

public class StudentManageA {
	private ClassRoomA room;
//---입력받은 정보를 새로운 학생필드로 만드는 과정, 학생3명을 새로운 반이라는 클래스로 묶는 과정---	
	public Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 정보. 이름 국,영,수 순으로 입력해주세요.");
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		return new Student(name, kor, eng, math);
	}
	
	public void start() {
		Student stu1 = inputStudent();
		Student stu2 = inputStudent();
		Student stu3 = inputStudent();
		
		room = new ClassRoomA(stu1, stu2, stu3);
//-----------------------------------------------------------------------------
			
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1.학생 이름 보기, 2.반 평균 보기, 3.1등 학생 정보");
		int number = scan.nextInt();
		
		if (number == 1) {
		room.printNames();
		} else if (number == 2 ) {
			System.out.println("총평균 : " + room.getTotalAvg());
		} else if (number == 3) {
			Student top = room.getTop();
			System.out.println(top.getName());
			System.out.println(top.getAvg());
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("프로그램 종료");
	}	
}
