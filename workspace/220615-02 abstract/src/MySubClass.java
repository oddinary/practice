
public abstract class MySubClass extends MyClass{ // 자식 클래스도 추상 클래스로 만들 수 있음.
	
	@Override
	public final void myMethod() { // 메소드에 종단 선언을 하면 오버라이딩이 불가능해진다.
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2();
}
