
	// 종단 클래스 상속시키려고하면 컴파일 에러가 남
public final class MyImpleClass extends MySubClass{ // 자식 클래스에서 구현되지 않았다면 손자 클래스에서 밀린 구현을 다 해줘야함.
												// 더이상 상속하지 못하게 하는 종단클래스를 선언할수 있다.
//	@Override // 새롭게 재 정의 하면 덮어 씌워짐
//	public void myMethod() {  // 부모클래스에서 종단선언했기 때문에 오버라이딩이 불가능해짐.
//		System.out.println("새롭게 재정의 하였습니다.");
//	}
	
	
	@Override
	public void myMethod2() {
		System.out.println("손자 클래스에서 구현되었습니다.");
	}
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		
		MySubClass sub = (MySubClass) m; // myMethod2를 구현하기 위해 다운캐스팅을 해줌
		sub.myMethod();
		
		sub.myMethod2();
	}
}
