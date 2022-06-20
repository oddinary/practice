import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
//		System.out.println(list.contains(new String("banana"))); // list의 유무는 equals로 원소의 동등함을 확인한다.
//		list.remove("banana"); // 동등함을 비교하고, 같을 때 지워 준다.
//		
//		System.out.println(list);
		
		//위에서 5글자 문자열만 찾아서 지우기
//		for(String s : list) { // for each문에서는 확인만 가능하다.
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);
		// 리스트는 iterable함.(상속하고 있음)
		Iterator<String> iterator = list.iterator(); // list의 요소를 하나씩 꺼내와주는 역할을 하는 놈인 이터레이터를 만들 수 있음
		while (iterator.hasNext()) {				// 이런 경우엔 iterator가 필수다.
			String str = iterator.next();
			if (str.length() == 5) {
				iterator.remove();	
			}
		}
		System.out.println(list);
	}	
}
