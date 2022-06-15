package src;

public class Student extends Person{ // 상속하는 방법 extends + 클래스 명
	private int score;
	
	public Student(String name, int age, int score) {
		 // 부모클래스의 필드가 private면 자식이 접근할 수 없다.
		super(name, age);	// 부모의 생성자를 호출 할 수 있는 슈퍼 키워드(슈퍼 클래스) 
		this.score = score;	// 생성자의 첫 문장이어야 함
	}

	public int getScore() {
		return score;
	}

}
