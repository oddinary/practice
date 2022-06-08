class Car {
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("( "+ color +", "+ speed + ", " + gear + " )");
	}
}

public class CarTest { // 저장은 메인 메소드의 클래스 명으로 한다.
	public static void main(String[] args) {
		Car myCar = new Car();	// 객채 생성
		myCar.color = "red";
		myCar.speed = 0;		// 객채 필드 변경
		myCar.gear = 1;
		myCar.print(); 			// 객체의 메소드 호출
		
		Car myCar2 = new Car();	// 새로운 객체 생성
		myCar2.color = "blue";
		myCar2.speed = 60;
		myCar2.gear = 3;
		myCar2.print();
		
	}
}