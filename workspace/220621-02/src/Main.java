import java.util.ArrayList;
import java.util.List;

class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}

public class Main {
	public static void main(String[] args) {
		//2차원 좌표를 여러개 관리하고 싶다.
		List<Point2D> list = new ArrayList<>();
		// 0,0
		list.add(new Point2D(0,0));
		list.add(new Point2D(5,5));
		
		Point2D p1 = list.get(0);
		System.out.println(p1);
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		//리스트에 0,0 좌표 객체가 있는지?? 인덱스는 몇번인지??
		System.out.println(list.contains(new Point2D(0,0)));
		System.out.println(list.indexOf(new Point2D(0,0))); // 같은지를 판단하는기준이 equals이기 때문에 equals를 재정의 해줘야함.(이클립스가 자동으로 만들어 줄 수 있죠)
		System.out.println(list.remove(new Point2D(5,5))); // equals를 재정의 했기 때문에 똑같은 것을 remove해줄거다
		System.out.println(list);
	}
}
