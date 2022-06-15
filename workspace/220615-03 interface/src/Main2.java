interface Greetable {
	void bow();
}

interface EngHello extends Greetable {
	// 인터페이스끼리 상속이 가능하다
	// 세분화 시키기 위한 상속
}

interface KorHello extends Greetable {
	// 인터페이스끼리 상속이 가능하다
}

class Student{
	private String name;
	private int age;
}
class KoreanStudent extends Student implements Greetable{

	@Override
	public void bow() {
		System.out.println("안녕");
	}
}
class BritishStudent extends Student implements Greetable{

	@Override
	public void bow() {
		System.out.println("Hello");
	}
}
class American implements Greetable {

	@Override
	public void bow() {
		System.out.println("wassup");
	}
}

public class Main2 {
	public static void main(String[] args) {
		KoreanStudent kim = new KoreanStudent();
		Greetable lee = new KoreanStudent(); // 인터페이스의 형으로 인스턴스를 참조하기
		
		BritishStudent john = new BritishStudent();
		
		Greetable[] arr = new Greetable[4]; // 인터페이스의 배열을 생성할수있다. 만들어진 인스턴스를 인터페이스 타입으로 참조 할 수 있다.
		American tom = new American();
		arr[0] = kim;
		arr[1] = lee;
		arr[2] = john;
		arr[3] = tom;
		
		for (int i = 0; i < arr.length; i++) { // 위 방법을 통해 인터페이스를 통해 하나의 무언가로 묶어 줄 수 있음.
			arr[i].bow();
		}
	}
}
