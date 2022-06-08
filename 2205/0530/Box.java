public class Box {
	int length;
	int width;
	int height;
	
	public Box() { 	//필요에 따라 생성자를 여러개 만들어 줄 수 있다. 
					//대신 파라미터가 같으면 안됨! (갯수, 타입, 순서가 같으면 안됨)
		width = 1;
		length = 1;
		height = 1;
	}
	
	public Box(int w, int l, int h) { // 클래스 이름 그대로
		width = w;
		length = l;
		height = h;
	}
	
	public static void main(String[] args) {
		Box b = new Box(50, 60, 70);
				
		System.out.println(b.width);
		System.out.println(b.length);
		System.out.println(b.height);
		// 1. 기본 생성자가 초기화를 해줘서 0 0 0이 나옴.
		
		// 박스 인스턴스화, 생성자를 호출해서 가로 90 세로 100 높이 110인 박스를 만들고 싶다.
		Box b2 = new Box(90, 100, 110);
		System.out.println(b2.width);
		System.out.println(b2.length);
		System.out.println(b2.height);
		
		Box b3 = new Box(); // 컴파일 에러남 생성자를 하나라도 작성하면 기본 생성자가 없어지고 호출할수 없다.
	}
}