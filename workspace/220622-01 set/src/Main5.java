import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

// 중복되지 않는 정수 1 ~ 45 사이의 정수 6개를 가지는 집합
public class Main5 {
	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto); //번호순으로 정렬을 하고 싶으면?
		
		List<Integer> list = new ArrayList<>(lotto); // 리스트에 넣어서
		
		Collections.sort(list); // 정렬을 하면 되겠죠??
		System.out.println(list);
	}
}
