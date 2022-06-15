
public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	// 넓이를 구할 수 있는 추상메소드를 상속받았으니 구체화(오버라이딩) 시켜줘야함
	@Override
	public double getArea() { // 구현한다.
		return base * height / 2.0;
	}
}
