public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog("댕댕이", "잡종");
		Dog d2 = new Dog("댕댕이", "잡종", 3);
		
		d.printAll();
		d2.setName("멍멍이");
		d2.setBreed("진도");
		d2.setAge(5);
		d2.printAll();
	}
}