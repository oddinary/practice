public class TestString{
	public static void main(String[] args){
		String str;// 참조형은 클래스를 불러오는 거라서 대문자로 시작함 
		str = "Hello World";
		
		System.out.println(str);
		
		// String s2;
		// System.out.println(s2);// 참조형도 초기화 없이는 사용할 수 없다.
		
		String s2 = "다음 문자열";
		System.out.println(s2);// 선언과 초기화가 동시에 가능하다.
		
		String concat = str + "\n" + s2;
		System.out.println(concat); // 합연산으로 연결해줄 수 있다. (정수값과 실수값, 논리값도 결합이 가능하다.)
		
	}
}