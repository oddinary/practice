// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이
// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
public class Dog {
	private String name;
	private String breed;
	private int age;
	// 강아지 3개의 모든 필드를 초기화 할 수 있는 생성자.
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	// 강이지 이름, 종을 전달 받은 값으로 초기화 하고 나이는 1살로 초기화 할 수 있는 생성자
	public Dog(String name, String breed) {
		this (name, breed, 1);
	}
	// 각 필드의 public 한 getter/setter를 작성해보세용
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		void printAll() {
		System.out.println(getName());
		System.out.println(getBreed());
		System.out.println(getAge());
		System.out.printf("강아지 등록 \n 이름은  %s, 종은  %s, 나이는 %d", name, breed, age);
		
	}
}


