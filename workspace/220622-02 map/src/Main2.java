import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // 뒤에있는 제네릭은 생략 가능
		
		map.put("둘리", 100);
		map.put("또치", 90);
		map.put("도우너", 150);

		Map<Integer, String> map2 = new HashMap<>(); // Map은 1:1관계
		
		map2.put(1, "둘리");
		map2.put(2, "또치");
		map2.put(3, "도우너");
		
		System.out.println(map.toString()); // 문자열 형태로 호출 가능
		
		System.out.println(map.keySet());
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> iter = keySet.iterator(); // iterator사용하는 방법
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			
			System.out.println(key + "=" + value);
		}
		
		for (String key : keySet) {
			System.out.print(key + "=" + map.get(key) + " ");	// for-each문 사용하는 방법
		}
		
		Set<Entry<String,Integer>> entrySet = map.entrySet(); // entry = 키와 밸류를 한 덩어리로 묶은것(페어)
		System.out.println();
		for (Entry<String,Integer> e : entrySet) {
			System.out.print(e.getKey() + "=" + e.getValue() + " ");
		}
		
	}
}
