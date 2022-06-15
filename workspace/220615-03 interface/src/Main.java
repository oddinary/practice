
public class Main {
	public static void main(String[] args) {
//		Flyable f = new Flyable(); // 인터페이스는 인스턴스화 할 수 없다.
		
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		Flyable f = e; // 업캐스팅이 가능함.
		
		f.fly(); // 자식구현체에서 오버라이딩 한대로 수행함.
		
		Flyable p = new Plane();		// 자식구현체에서 오버라이딩 한대로
		// Eagle test = (Eagle) p; // 아무 관련이 없는 형태는 캐스팅시 에러가 난다. instanceof 로 확인해주고 다운캐스팅 해주는 것이 안전하다.
		
		Flyable fish = new FlyingFish();// 자식구현체에서 오버라이딩 한대로
		
		p.fly(); 	//수행함
		fish.fly();	//수행함
		
		penguin penguin = new penguin();
//		Flyable test = penguin; // 특징을 가지고 있지 않기 때문에 컴파일 에러가 남
	}
}
