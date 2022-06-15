
public class Animal {
	public void sound() {
		System.out.println();
	}
	
	class Dog extends Animal{
		@Override // 미리 적어서 오류를 방지하자!! annotation을 적어주면 좋다.
		public void sound() { // 메소드 오버라이드 헤더부분
			System.out.println("멍멍");
		}
	}
	
	class Cat extends Animal{
		public void sound() { // 메소드 오버라이드 헤더부분
			System.out.println("냐용");
		}
	}
}