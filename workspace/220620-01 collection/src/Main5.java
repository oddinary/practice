import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)); // 이런식으로 초기화를 해줘야 한다. 너무 복잡한디 왜 이래야함?
		System.out.println(list);

//		List<Integer> test = Arrays.asList(10,20,30,40,50);
//		test.add(60); // 이 경우에 원소 추가나 삭제가 안되뮤ㅠ

		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list); // 이런식으로 리스트를 던져주면 리스트를 추가 해주기도 함. 개편하네

		list.removeAll(Arrays.asList(30, 40, 50));
		System.out.println(list); // 이런식으로 지워도 줌 (띄엄띄엄도 됨)

		System.out.println(list.containsAll(Arrays.asList(10, 20))); // 이런식으로 값이 있는지 확인도 됨 (띄엄띄엄도 됨)

		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub); // 이런식으로 리스트의 부분만 추출해서 출력도 가능
		System.out.println(list);
	}
}
