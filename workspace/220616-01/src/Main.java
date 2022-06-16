
interface PrintAll{
	void printAll();
}

public class Main {
	public static void main(String[] args) {
		PrintAll a = new PrintAll() {// 인터페이스를 구현 하는데 이름만 없는 클래스를 만든다.  
			@Override // a는 이름이 없는 클래스의 인스턴스를 참조하는 것.
			public void printAll() {
				System.out.println("출력할 거시 없는 거시에여");
			}
		};
		a.printAll(); //인터페이스속의 구체화된 메소드를 호출하면 됨.
		
//		class point implements PrintAll{
//			int x;
//			int y;
//			public point (int x, int y) {
//				super();
//				this.x = x;
//				this.y = y;
//			}
//			@Override
//			public void printAll() {
//				System.out.println(x);
//				System.out.println(y);
//			}
//			
//		}
//		
//		point p = new point(10, 20);
	}
}
