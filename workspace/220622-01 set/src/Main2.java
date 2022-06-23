import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		set.add("donut");
		set.add("egg");
		set.add("fried");
		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); // 넣은 순서랑 상관없이 나온다. 
		}
		set.contains("banana"); // 순서보다는 원소의 중복이나 유무에 더 집중한 구현체
		set.contains("granola"); 
	}
}
