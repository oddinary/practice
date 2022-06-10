import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = {2, 4, 6, 8, 10};
		int[] arr2 = {3, 6, 9, 12, 15};
		int[] arr3 = {4, 8, 12, 16, 20};

		int[][] arr2d = new int[3][5]; 	// 배열안에 배열을 넣는 2차원 배열
		arr2d[0] = arr1;				// [큰배열의 길이(행의 갯수)][배열안의 배열의 길이(열의 갯수)]
		arr2d[1] = arr2;				// 길이가 같은 배열들만 하나의 2차원 배열로 묶일 수 있다.
		arr2d[2] = arr3;
		
		System.out.println(arr2d[0][0]); // 좌표 처럼 불러오면 됨.
		
		for (int i = 0; i < arr2d.length; i++) {
			System.out.print(arr2d[0][i] + " "); // 이러면 행의 갯수대로만 반복하기 때문에 원하는 결과를 얻을 수 없음
		}
		System.out.println();
		for (int i = 0; i < arr2d[0].length; i++) {
			System.out.print(arr2d[0][i] + " "); // 열의 갯수를 구하기 때문에 원하는 결과를 얻을 수 있음
		}
		System.out.println();
		System.out.println("-------------------------------------");
		for (int j = 0; j < arr2d.length; j++) {	// 이중 for문을 사용하여 2차원 배열의 모든 값을 출력할 수 있다.
			for(int i = 0; i < arr2d[j].length; i++) {
				System.out.print(arr2d[j][i]+ " ");
			}
			System.out.println();
		}
	}
}
