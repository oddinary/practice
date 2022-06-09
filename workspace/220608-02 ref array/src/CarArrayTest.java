class Car {
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	public void speedUp() {
		speed += 10;
	}
	public String toString(){ // 객체의 상태를 문자열로 반환하는 메소드
		return "속도 : " + speed + " 기어 : " + gear + " 색상 : "+ color;
	}
} 

public class CarArrayTest {

	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];			// for-each문은 값을 보고자 할 때는 잘 작동하지만
		for (int i = 0; i < cars.length; i++)	// 값을 변경하거나 뭔짓을 하려고 하면 잘 작동하지 않는다.
			cars[i] = new Car();				// 참조를 가져오기 때문에 null을 참조한다거나 함
		for (int i = 0; i < cars.length; i++)
			cars[i].speedUp();
		for (Car c : cars)
			System.out.println(c.toString()); 	// toString을 생략이 가능하다. 왜지
												// 객체의 기본 행동중의 하나인 toString메소드 호출.
		for	(int i = 0; i < cars.length; i++)	// 이름을 toString으로 해주면 객체를 문자열처럼 다루고자 할때 자동으로 호출이 된다.
		System.out.println(cars[i].toString());
	}
}
