public class Count {
	public static void main (String[] args) {
		// 300 ~ 400 사이의 정수 중 13의 배수를 찾아서 몇개가 있는지 출력하기.
		int count = 0; // 몇개인지 들어갈 변수를 따로 만들어서
		for (int i = 300; i <= 400; i++) {
			if (i % 13 == 0){
			System.out.println(i);
			count++; // 1씩 더해준다.
			}
		}
		System.out.println(count); // 출력
	}
}