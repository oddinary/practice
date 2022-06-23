import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // treeset은 대소 비교를 할수 있는 원소를 집어 넣으면 정렬된 순서처럼 원소를 가지고 있음
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(22);
		set.add(22);
		set.add(30);
		for (int i : set) {
			System.out.println(i); // 결과 : 2 17 22 30 50
		}
	}
}
