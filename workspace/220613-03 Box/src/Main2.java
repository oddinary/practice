
public class Main2 {

	public static void main(String[] args) {
		Box b1 = new Box();
		
		b1.height = 10;
		b1.length = 10;
		b1.width = 10;
		
		System.out.println(b1.getVolume());
		
		ColorBox c1 = new ColorBox();
		
		c1.height = 20;
		c1.length = 20;
		c1.width = 20;
		c1.color = "red";
		
		System.out.println(c1.getColor());		
		System.out.println(c1.getVolume());		
		
		// 1. 자식 클래스는 명시 되어있지 않으면 부모클래스의 기본 생성자로 호출한다.
	}

}
