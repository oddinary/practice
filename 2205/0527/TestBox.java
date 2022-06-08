public class TestBox {
	public static void main(String[] args) {
		Box none = null; // 참조형 변수는 null을 참조할 수도 있다.(참조할 변수가 없다.)
				
		// none.width = 10; // 문법은 맞으나 (컴파일 에러 x)
		// System.out.println(none.width); // 실행시에 프로그램이 도중에 에러나서 종료됨.
		
		Box box1; // 클래스 자체가 하나의 타입으로 사용 되어서 참조형 변수가 생성된 상황.
		box1 = new Box(); // 초기화, 인스턴스가 생성됨.(공간이 할당됨)
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		// System.out.println(box.color); // 필드가 없을 경우에는 컴파일러가 알려줌!
		
		Box box2 = new Box();
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		// System.out.println("부피 : " + box1.volume);
		
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		box1.printAllState();
		box2.printAllState();
		// 인스턴스의 상태에 따라 다른 값이 나온다.
		
	}
}