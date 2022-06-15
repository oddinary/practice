package src;


public class Person {
	private String name;
	protected int age;
	// 자식들이 접근할수 있게 만들어 놓은 접근 제한자. default 보다는 넓고(다른 패키지에서도 접근이 가능함) public 보다는 좁다. 
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
