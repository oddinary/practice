public class Car {
	private int speed; // 접근제한자 외부에서의 필드나 메소드에 접근을 설정하는 키워드
	private int gear; // private는 외부에서 볼수도 설정할수도 없게 한다. 이 안에서만 쓸 수 있음.
	private String color; // 원치 않는 접근을 막음으로서 정보를 보호할 수 있음.
	//바깥에서 안봐도 되는 정보들을 숨길 수 있음.
	
	public Car(String c, int s, int g){
		color = c;
		speed = s;
		gear = g;
	}
	
	public Car(String c) {
		this(c, 0, 1);//자기 자신의 생성자를 호출
		//this 는 언제나 생성자의 첫줄!
	}
	
	// getter
	public String getColor() {
		return color;
	}
	
	// setter
	public void setColor(String c) {
		color = c;
	}
	
	// 접근(스피드)
	public int getSpeed() {
		return speed;
	}
	
	//설정하는
	public void setSpeed(int s) {
		speed = s;
	}
	
	// 접근(기어)
	public int getGear() {
		return gear;
	}
	
	//설정하는
	public void setGear(int g) {
		gear = g;
	}
	
}