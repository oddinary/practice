public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);
		Car c2 = new Car ("yellow");
		
		// c.color = "빨강";
		// System.out.println(c.color);
		
		c.setColor("빨강");
		System.out.println(c.getColor());
		c.setSpeed(60);
		System.out.println(c.getSpeed());
		c.setGear(3);
		System.out.println(c.getGear());
		
	}
}