
public class Box {
	int height;
	int width;
	int length;
	
	public Box(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	} // 2. 생성자를 만들어 준다면! 자동으로 안 만들어 주는데!!

	public Box() { // 4. 부모의 기본 생성자를 만들어 주는 방법이나
		super();
	}

	public int getVolume() {
		return height * width * length;
	}
}
