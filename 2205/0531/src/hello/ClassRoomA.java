package hello;

public class ClassRoomA {
	private Student stu1;
	private Student stu2;
	private Student stu3;
	private int max;
	// 생성자는 필드를 초기화 하기 위해서 만든 것
	public ClassRoomA() {}
	// 때문에 학생 3개를 마련해두고 집어 넣을 때 마다 호출 해준다.
	public ClassRoomA(Student stu1, Student stu2, Student stu3) {
		this.stu1 = stu1;
		this.stu2 = stu2;
		this.stu3 = stu3;
	}

	public void printNames() {
		System.out.println("1번 학생 : " + stu1.getName());
		System.out.println("2번 학생 : " + stu1.getName());
		System.out.println("3번 학생 : " + stu1.getName());
	}
	
	public int getTotalAvg() {
		return (stu1.getAvg() + stu2.getAvg() + stu3.getAvg()) / 3;
	}
	
	public Student getTop() {
		return max(max(stu1, stu2), stu3);
//		if (stu1.compare(stu2) && stu1.compare(stu3)) {
//			return stu1;
//		} else if (stu2.compare(stu1) && stu2.compare(stu3)) {
//			return stu2;
//		} else {
//			return stu3;
//		}
	}
	
	public Student max(Student left, Student right) {
		if (left.getAvg() >= right.getAvg()) {
			return left;
		}else {
			return right;
		}
	}
	
	public Student getStu1() {
		return stu1;
	}

	public void setStu1(Student stu1) {
		this.stu1 = stu1;
	}

	public Student getStu2() {
		return stu2;
	}

	public void setStu2(Student stu2) {
		this.stu2 = stu2;
	}

	public Student getStu3() {
		return stu3;
	}

	public void setStu3(Student stu3) {
		this.stu3 = stu3;
	}
	
}
