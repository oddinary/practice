import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		// list는 중복을 처리하기가 힘든데 중복을 처리하러면 어떻게 해야 할까
		// set을 사용하자(중복에 집중한 구현체) set은 집합이라고 생각하면 편하다.
		HashSet set = new HashSet();
		boolean b1 = set.add("객체1");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("객체2");
		boolean b4 = set.add("객체2"); // boolean으로 set에 값이 들어갔는지 확인할 수 있음 
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);			// 중복되는 것이 있다면 중복을 걸러서 추가해주지 않음.
		System.out.println(set.size());
		System.out.println(set.toString());
//		set.get(0)// 오잉?? set은 인덱스를 가지고 있지 않음. -> get이 없다. -> 반복문이 없다.
		for (Object o : set) {
			System.out.println(o);
		} //for-each문은 사용 가능하다.
		Iterator<Object> iter = set.iterator(); // Iterator를 상속하고 있기 때문에 사용가능하다.
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
