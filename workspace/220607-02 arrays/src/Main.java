public class Main {
	public static void main(String[] args) {
		// 배열, 하나의 이름으로 여러개를 사용할 수 있다.
		// 몇개를 사용할 지를 알려주면 그만큼 공간을 만들어줌.
		// 배열의 크기 = 길이, 순서가 있음(index, 0부터 시작)
		int[] aBox; // 타입 설정후에 배열 선언한다. 정수형 배열 변수 선언.
		aBox = new int[4]; // 배열의 길이를 4로 초기화. new를 썻으니까 객체, 그리고 참조변수(길이가 4인 배열을 참조한다)
		// 자바의 배열은 초기화시에 정해둔 길이값을 변경할 수 없다.(final하게 상수로 설정되어있음)
		System.out.println("배열의 길이값 : " + aBox.length);
//		aBox.length = 10;(x)
		
		aBox[0] = 56; // 0번째 인덱스에 값을 집어 넣음. 배열의 값 하나를 원소라고 부른다.
		aBox[1] = 57; // 1번째 인덱스에 값을 집어 넣음
		aBox[2] = 58; // 2번째 인덱스에 값을 집어 넣음
		aBox[3] = 59; // 3번째 인덱스에 값을 집어 넣음. 인덱스의 마지막은 길이의 -1.
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]); // 출력은 이렇게 호출하면 된다.
	}
}
