//	삼각형  중심점(x,y), 밑변, 높이 
// 	넓이를 구해서 알려줄 수 있음.

//	직사형  중심점(x,y), 가로, 세로 
// 	넓이를 구해서 알려줄 수 있음.

//	삼각형  중심점(x,y), 반지름 
// 	넓이를 구해서 알려줄 수 있음.

// 	세 개의 클래스를 도형이라는 상위 클래스로 묶을수 있어 보임. (is-a관계)
//	중심점과 넓이 구하기를 묶을 수 있어 보임.

public class Main {
	public static void main(String[] args) {
//		Shape s1 = new Shape(); // 추상 클래스는 인스턴스화 할 수 없음ㅠㅠ 추상적이니까! 
		// 도형이라는 도형은 만들 수 없다.
//		Shape s2 = new Shape(10, 20);
		Triangle t = new Triangle(0, 0, 5, 5);
		System.out.println(t.getArea());

		Shape s = t; // 업캐스팅은 자연적으로 된다.
		System.out.println(s.getArea()); // 업캐스팅해도 자식에서 오버라이드 된 메소드가 실행됨
		
		Rectangle r = new Rectangle(0, 0, 5, 5);
		System.out.println(r.getArea());
		
		Circle c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
	}
}
