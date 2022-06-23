import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가","나","다","다","다","가","라")); //리스트에서 중복을 없애고 싶다면?
		Set<String> set = new HashSet<>(list); // 이렇게 바로 넣어도 됨.
		
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i)); // set에 list의 원소들을 집어 넣으면 된다.
//		}
		System.out.println(set);
	}
}
