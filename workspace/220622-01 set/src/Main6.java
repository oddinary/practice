import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(); 	// 추가된 순서가 그대로 유지 되는 (순서가 기억되는) set
		set.add("banana");							// 인덱스는 없음. 당연히 get도 없다.
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple","dount","egg","fancake"));
		set.addAll(set2);
		System.out.println(set); // 어디에 넣느냐에 따라 순서가 달라진다
		set2.addAll(set);
		System.out.println(set2);
	}
}
