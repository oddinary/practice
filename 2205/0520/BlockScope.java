public class BlockScope {
	public static void main(String[] args) {
		int a = 10; // 이것도 지역변수임(프로그램이라는 범위 내에 있으니까)
		{
			int b = 20; // 범위 내의 변수 선언을 지역변수라고 부른다.
			
			// int a = 99; // 범위가 달라도 이미 정의된 변수를 덮어씌울 수 없음.(컴파일 에러)
			System.out.println("가능한가?");
			System.out.println(a); // 괄호 밖의 선언은 안에도 적용된다
			System.out.println(b); // 괄호 내의 선언은 안에도 적용된다
		}
		// System.out.println(b);//괄호 내의 선언은 범위가 끝나는 순간 같이 끝나서 적용되지 않는다. (컴파일 에러)
		 // 중괄호는 짝을 잘 맞춰야 한다. 중괄호 안의 범위(scope)를 block이라고 한다.
	}
}