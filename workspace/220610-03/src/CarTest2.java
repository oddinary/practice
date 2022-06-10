class Car {
	private int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수버전 호출");
	}
	public void setSpeed(double s) {
		speed = (int) s;
		System.out.println("실수버전 호출");
	}
}

public class CarTest2 {
	
	public static void main(String[] args) {
		Car myCar = new Car();	// 첫번째 객체 생성
		myCar.setSpeed(100);	// 정수 버전 메소드 호출
		myCar.setSpeed(79.2);	// 실수 버전 메소드 호출
		myCar.setSpeed(1000L);
		myCar.setSpeed('A');
//		myCar.setSpeed("A");
	}

}
