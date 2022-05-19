public class TestRange{
	public static void main(String[] args) {
		// 0 ~ 100 사이??
		int number = 33;
		
		// System.out.println(0 <= number <= 100); //자바는 한번에 하나 밖에 못 물어봄. 왼쪽이 먼저 계산됨
		System.out.println(0 <= number);
		System.out.println(number <= 100);
		
		System.out.println(0 <= number && number <= 100); // 논리연산을 사용해서 한 문장으로 원하는 값을 얻을 수 있음
	}
}