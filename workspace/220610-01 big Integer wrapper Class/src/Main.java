import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] arr = {50, 30, 20, 60, 10};
		
		Arrays.sort(arr); // 정렬을 하는 메소드
		System.out.println(Arrays.toString(arr));
		int index = Arrays.binarySearch(arr, 20); // 이진 검색 전에는 정렬이 되어있어야한
		System.out.println(index);

	}
}
