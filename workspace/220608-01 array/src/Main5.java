import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] temp = { 40, 50, 60 };
		int[] copy = Arrays.copyOf(arr, 6); // 원하는 칸수만큼 늘이거나 줄일수 있는 스태틱 메소드
											// 같은 길이 값을 적으면 그대로 복사되겠죠?

		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(arr, copy)); // 두개의 배열이 길이와 원소가 (참조가 같아도 됨) 같은지 알아보는 메소드

		int[] another = Arrays.copyOfRange(temp, 0, temp.length); // 원하는 시작점을 복사할 수있음.
		System.out.println(Arrays.toString(another));
		
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr)); // 배열을 원하는 값으로 채우는 메소드
	}
}
