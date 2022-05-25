// 2~100사이의 모든 소수 출력하기

public class Drill {
	public static void main(String[] args) {
		
		for (int j = 2; j <= 100; j++) {
			int count = 0; // 변수의 위치에 주의 하자.
			for (int i = j; i > 0; i--) {
				if (j % i == 0) {
					count++;
				}		
			}
			if(count == 2) {
				System.out.print(j + " ");
			}
		}
	}
}