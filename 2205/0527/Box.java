public class Box {
	// 값/상태 -> 멤버변수 (memver variable) / 필드 (fields) 객체를 구성하는 것들.
	int length;
	int width;
	int height;
	// int volume = length * width * height;
	
	// 기능 or 동작 -> 메소드(methods)
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
		//박스는 자기자신의 부피를 구해서 정수형 값으로
		//알려줄 수 있음. (반환)
	}	
	
	public int getVolume() {
		return width * length * height; 
		// param지정 없이 클래스 자신이 가지고 있는 변수를 사용 가능
	}
}