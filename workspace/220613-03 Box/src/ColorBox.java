
public class ColorBox extends Box{
	String color;

	public ColorBox() {
		super(); // 3.호출할 수 없어서 컴파일 에러가 남 
		this.color = null; // 4-1. 부모의 값을 초기화 해주거나 값을 전달 해주면 된다.
	}
//	public ColorBox(int width, int length, int height, String color) {
//		super(width, length, height);  // 4-1. 부모의 값을 초기화 해주거나 값을 전달 해주면 된다.
//		this.color = null; 
//	}
	
	public String getColor() {
		return color;
	}
}
