public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10;
		
		i++;
		
		final int MY_NUMBER = 22; // 상수 값의 이름을 지어 주는 행위. 변수와의 차이를 위해 대문자로 이름을 짓는다.구분자는_로 한다.
		// 절대로 변해서는 안되는 수, 아니면 서로간의 약속을 할 때 사용할 수 있다.
		// MY_NUMBER++; // 컴파일 에러
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
		
		final int ASDF;
		ASDF = 10; // 초기화는 상수여도 컴파일 에러가 안난다. 
		// ASDF = 15; // 그 이후로는 컴파일 에러가 뜸
		
		
	}
}