import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		// 2 ~ 5의  제곱수들을 각 원소로 가지는 2차원 배열을 선언 초기화 후에 모든 원소 출력해보기
		
		int[][] arrPow = new int[4][5];
		for (int j = 0; j < arrPow.length; j++) {	
			for (int i = 0; i < arrPow[0].length; i++) {
				arrPow[j][i] = (int) Math.pow(j + 2, i + 1);
			}
		}	
		int[][] arrPow2 = new int[4][5];
		for (int i = 0; i < arrPow2.length; i++) {
			int n = 1;
			for (int j = 0; j < arrPow2[0].length; j++) {
				n *= 2 + i;
				arrPow2[i][j] = n;
			}
		}	
		for (int j = 0; j < arrPow.length; j++) {	// 이중 for문을 사용하여 2차원 배열의 모든 값을 출력할 수 있다.
			for(int i = 0; i < arrPow[j].length; i++) {
				System.out.print(arrPow[j][i]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arrPow2)); // 2차원 배열을 확인할 수 있는 메소드.
		System.out.println(Arrays.deepEquals(arrPow, arrPow2)); // 2차원 배열이 같은지 확인할 수 있는 메소드.
	}
}
