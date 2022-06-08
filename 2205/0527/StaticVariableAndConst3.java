public class StaticVariableAndConst3 {
	public static final int NUMBER = 100; 
	// 전역 변수 : 모든 지역에서 값을 공유하는 변수. 앞에 static이 붙는다.
	// 사용은 쉬우나 많아질수록 관리가 복잡해진다. 요즘은 잘 안씀
	// 적게 사용하되 상수화 시켜서 사용한다. 
	
	public static void test() {
		// number++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		// number++;
		System.out.println("메인메소드에서 : " + NUMBER);
		
		test();
		
		System.out.println(Math.PI);
		
		double a = Math.abs(-372);
		System.out.println(a);
		
		double r = Math.random();
		r = (int) (r * 10);
		System.out.println(r); // 0과 1 사이의 실수를 랜덤하게 만들어내서 알려줌
	}
}