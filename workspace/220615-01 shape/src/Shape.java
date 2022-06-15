// 도형 x좌표, y좌표를 가지고
// 넓이 구할수 있음.
public abstract class Shape { // 추상 클래스
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract double getArea(); // 추상 메소드
	// ?? 막상 넓이를 구하려고하니까 삼각형, 사각형, 원 의 넓이 구하는 공식이 다름. 구체화 시켜야함.
	// abstract를 붙였다. (추상적이라서 구체화시켜야 한다는 뜻) -> 추상 메소드
	// 동작에 대한 구체적인게 없다. 메소드 바디 없이 세미콜론을 찍는다. 헤더만 있음
	// 일반적인 클래스에는 존재 할 수 없어서 해당 클래스의 머리에도 추상임을 표시해야함.
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
}
