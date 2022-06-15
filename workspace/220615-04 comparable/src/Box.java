
public class Box implements Comparable {
	private double volume = 0;

	public Box(double v) {
		volume = v;
	}
	public int CompareTo(Object otherObject) {
		Box other = (Box) otherObject;
		if (this.volume < other.volume)
			return -1;
		else if (this.volume > other.volume)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if (b1.CompareTo(b2) > 0) {
			System.out.println("b1이 b2보다 더 크다.");
		} else
			System.out.println("b1이 b2와 작거나 같다.");
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
