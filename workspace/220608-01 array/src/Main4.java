import java.util.Arrays;
public class Main4 {

	//두개 정수 배열을 전달 받아 결합시켜 반환하는 메소드
	static int[] arrCombi (int[] left, int[] right) {
		int[] combi = new int[left.length + right.length];
		for(int i = 0; i < left.length; i++) {
			combi[i] = left[i];
		}
		for(int i = 0; i < right.length; i++) {
			combi[i + left.length] = right[i];
		}
		return combi;
	}
	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int[arr.length + newLength];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		return larger;
}
	// 두개 정수 배열의 합을 반환하는 메소드
	static int[] arrSum (int[] left, int[] right) {
		int[] copy;
		int[] target;
		if(left.length > right.length) {
			copy = copy(left, 0);
			target = right;
		} else {
			copy = copy(right, 0);
			target = left;
		}
		
		for (int i = 0; i <target.length; i++) {
			copy[i] += target[i];
		}
		
		return copy;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3}; // 칸을 늘리고 싶을 때는
		int[] arr1 = {10, 11, 12, 13, 14};
		
		int[] larger = new int[arr.length + 2]; // 1. 칸이 더 큰 배열을 만들어서
		for(int i = 0; i < arr.length; i++) {
			larger[i] = arr[i]; // 2. 배열을 복사 해주면 된다.
		}
		
		System.out.println(Arrays.toString(larger));
		System.out.println(Arrays.toString(arrCombi(arr, arr1)));
		System.out.println(Arrays.toString(arrSum(arr, arr1)));
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]); // 길이 값을 주면 초기화는 자동으로 0 된다.
		
		
	}
}
