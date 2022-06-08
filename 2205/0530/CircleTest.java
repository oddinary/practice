class Point {
	private int x, y;
	//생성자
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class Circle {
	private int radius = 0;
	private Point center; // has-a 관계 : 클래스를 필드로 가지는 관계
	
	//생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	// 중심점을 getter로 해주기/
	public Point getPoint(){
		return center;
	}
	public void setPoint(Point p) {
		center = p;
	}
}


public class CircleTest {
	public static void main(String[] args) {
		//Circle객체를 생성하고 초기화 한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
	}
}
