public class CarTest3 {	
	public static void main(String[] args) {
		Car c1 = new Car("blue", 100, 1); // 첫 번째 생성자 호출
		c1.printStaticNumber();
		Car c2 = new Car("white", 0, 1); // 두 번째 생성자 호출
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차 수 = " + n);

	}

}
