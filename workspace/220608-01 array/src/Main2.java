public class Main2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		int[] copy = arr; // 1-1.배열 복사
		
		int [] copy2 = new int[arr.length]; // 2-1. 같은 길이의 배열을 만들어서
		
		for (int i = 0; i < arr.length; i++) {
			copy2[i] = arr[i]; // 2-2. 각각의 값을 넣어준다.
		}
		
		arr[0] = 1000; // 이 값을 바꿔도
		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]); // 1의 경우에는 같은 곳을 참조하고 있기 때문에 값이 바뀐다.
		}
		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy2[i]); // 2의 경우에는 복사된 값을 갖기 때문에 바뀌지 않는다.
		}
	}
}
