public class Main2 {
	public static void main(String[] args) {
		//길이가 5인 정수형 배열을 선언 초기화 하고 모든 원소의 값을 100으로 설정해보세요.
		
//		int[] aBox1; // 정수형 배열 선언
//		aBox1 = new int[5]; // 초기화
		
		int[] aBox1 = new int[5]; // 선언과 초기화를 동시에 해줌.
		
//		aBox1[0] = 100;
//		aBox1[1] = 100;
//		aBox1[2] = 100;
//		aBox1[3] = 100;
//		aBox1[4] = 100; // 길이는 n-1

//		for (int i = 0; i < 5; i++) {
//			aBox1[i] = 100;
//		}
	
		for (int i = 0; i < aBox1.length; i++) {
			aBox1[i] = 100;
		} // 배열과 반복분은 짝꿍입니다.

		for (int i = 0; i < aBox1.length; i++) {
			System.out.println(i +"번째 index의 원소값 : " + aBox1[i]);
		}
		
	}

}
