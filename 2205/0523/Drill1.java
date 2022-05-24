//2의 제곱수를 32개 나열하고 결과값을 확인해보세요.

public class Drill1 {
	public static void main(String[] args) {
		
		long num = 1;
		for (int i = 1; i <= 32; i++) {
			num *= 2;
			System.out.print(num + " ");
		}
	}
}