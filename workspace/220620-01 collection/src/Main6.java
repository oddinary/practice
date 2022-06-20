import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		Collections.sort(list); // 정렬이 가능(오름차순)
		System.out.println(list);
		
		int index = Collections.binarySearch(list,8);
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list); // 섞을 수 도 있음
		System.out.println(list);
		
		System.out.println(Collections.max(list)); // 최댓값
		System.out.println(Collections.min(list)); // 최솟값
		
		Collections.fill(list, 33); // 길이 값은 유지를 하면서 안의 값을 전부 다 바꿔준다.
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77); // 전의 값을 후의 값으로 바꿔준다
		System.out.println(list);
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90,80,70));
		Collections.copy(list, target); // 덮어쓰기도 가능! 덮어쓰기라서 덮어쓸 리스트보다 기존의 리스트가 커야한다.
		
		System.out.println(list);
	}
}
