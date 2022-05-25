// 구구단 2단 부터 9단 까지
public class Gugudan {
	public static void main(String[] args) {
		for(int j = 2; j <= 9; j++) {	
			for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", j, i, j*i);
			}
		}	
	}
}