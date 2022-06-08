public class Car {
	
	private String color;
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수. 필드가 아님!
	// public으로 사용하는 경우는 거의 없다고 보면 됨. 어디서 어떻게 바꾸는지 알기 힘들기 때문
	private static int numberOfCars = 0;
	
	// 공유하고 싶은 값이 있으면 상수로 만들자!
	public static final int SHARE_NUMBER = 22;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 갯수를 증가하고 id번호를 할당한다.
		numberOfCars++;
		id = numberOfCars;
	}
	
	//메소드는 객체의 행동이라 static이 붙으면 안됨
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
//	public static void printColor() {
//		// color는 프로그램이 실행되야 생성되기 때문에 static에선 필드값을 가질수 없다.(말이 안됨)
//		System.out.println(color);
//	}

	// 정적 메소드
	public static int getNumberOfCars() {
		return numberOfCars; // ok!
	}
 }	
	