
public interface Flyable { 	// 추상적인 동작을 표현한다던지 객체들끼리의 통로를 만들어주는 역할
							// 대문자로 시작, ~할수있음의 단어로 표현한다. I를 붙이고 시작하기도 함.
	
	void fly(); // 추상 메소드만을 가질수 있음
				// 무조건 public하고, 추상적이라는 표현을 생략할 수 있음
				// 필드는 가질수 없다.
}

class Animal {}

class Bird extends Animal {}

class Eagle extends Bird implements Flyable{ //인터페이스를 구현하는 방법은 implements + 이름을 적어주면 된다.
	// 추상메소드를 물려 받기 때문에 오버라이딩 해줘야 한다.
	@Override
	public void fly() {
		System.out.println("퍼덕퍼덕");
	}
}
class penguin extends Bird {}

class FlyingFish extends Animal implements Flyable{

	@Override
	public void fly() {
		System.out.println("날치가 물 위로 남");
	}
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("위잉");
	}
}