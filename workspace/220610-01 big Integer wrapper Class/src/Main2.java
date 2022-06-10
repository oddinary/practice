
public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		// Wrapper class
		
//		Byte
//		Short
//		Integer
//		Long
//		Float
//		Double
//		Char
//		Boolean // 기존타입에서 대문자로 바꿔주면 객체로 바뀐다.
		//예외
		Integer i = new Integer(10); //10을 가지고 있는 객체가 만들어짐 deprecated
		Integer i2 = Integer.valueOf(500); // 객체의 형태로 포장(인스턴스를 참조하게)하는 과정 Boxing
		int primitiveInt = i2.intValue();// 언빡싱 unboxing
		Character a = new Character('a');
		
		System.out.println(primitiveInt);
		
		Integer auto = 100; //자바 문법상 대입연산을 하면 자동으로 박싱이 일어남 auto-boxing
		int un = auto; // 자동으로 포장이 플리면서 값이 넘어옴
		
		
		Integer value = Integer.valueOf("5959"); // 문자열 형태의 숫자를 받아서 인티져로 나타내준다
		System.out.println(value);
		int result = Integer.valueOf("1234");
		System.out.println(result);
		
		Integer.parseInt("123"); // 문자열 형태를 받아 정수형 타입으로 나타내준다.
	}
}
